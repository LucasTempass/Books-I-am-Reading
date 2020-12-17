package ClientServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

public class RequestHandlerThread extends Thread {
    
    private LinkedBlockingQueue<Socket> pendingConnections;
    private ServerExecutor executor = new ServerExecutor();
    private ConcurrentHashMap<String, ConcurrentMap<Command, Future<?>>> taskController;
    
    public RequestHandlerThread(LinkedBlockingQueue<Socket> pendingConnections, ConcurrentHashMap<String, ConcurrentMap<Command, Future<?>>> iController) {
        this.pendingConnections = pendingConnections;
        taskController = iController;
        
    }
    
    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                try {
                    var clientSocket = pendingConnections.take();
                    var inputReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    Command command = createCommand((inputReader.readLine()).split(";"), clientSocket);
                    CommandTask<?> task = (CommandTask<?>) executor.submit(command);
                    taskController.computeIfAbsent(command.getUsername(), ignored -> new ConcurrentHashMap<>()).put(command, task);
                }
                catch (IOException ignored) { }
            }
        }
        catch (InterruptedException ignored) { }
        pendingConnections.clear();
        
    }
    
    private Command createCommand(String[] commandData, Socket clientSocket) {
        return switch (commandData[0]) {
            case "q" -> new QueryCommand(clientSocket, commandData);
            case "s" -> new StopCommand(clientSocket, commandData);
            default -> new ErrorCommand(clientSocket, commandData);
        };
    
    }
    
    @Override
    public void interrupt() {
        super.interrupt();
        executor.shutdown();
    
    }
    
}
