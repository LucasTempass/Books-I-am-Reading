package ClientServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

public class Server {
    
    private static volatile boolean stopped = false;
    private static RequestHandlerThread requestHandlerThread;
    private static ServerSocket serverSocket;
    
    public static void main(String[] args) throws IOException {
        var pendingConnections = new LinkedBlockingQueue<Socket>();
        var controller = new ConcurrentHashMap<String, ConcurrentMap<Command, Future<?>>>();
        serverSocket = new ServerSocket(10);
        requestHandlerThread = new RequestHandlerThread(pendingConnections, controller);
        requestHandlerThread.start();
        System.out.println("Initialization completed");
        do {
            try {
                pendingConnections.put(serverSocket.accept());
            }
            catch (Exception ignored) { }
        } while (!stopped);
        close();
        
    }
    
    public static void shutdown() {
        stopped = true;
        try {
            serverSocket.close();
        }
        catch (IOException e) { e.printStackTrace(); }
        
    }
    
    public static void finishTask(Command command) {
        System.out.println("Task with code " + command.hashCode() + " has finished");
    }
    
    private static void close() {
        System.out.println("Starting server shutdown...");
        System.out.println("Shutting down RequestThread");
        requestHandlerThread.interrupt();
        System.out.println("Closing socket");
        System.out.println("Server shutdown");
        
    }
    
}
