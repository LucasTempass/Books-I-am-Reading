package ClientServer;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Arrays;

public abstract class Command implements Comparable<Command>, Runnable {
    
    protected final String[] command;
    private final Socket clientSocket;
    private String username;
    private byte priority;
    
    public Command(Socket socket, String[] command) {
        this.command = command;
        this.clientSocket = socket;
        username = command[1];
        priority = Byte.parseByte(command[2]);
        
    }
    
    public abstract String execute();
    
    @Override
    public int compareTo(Command other) {
        return Byte.compare(other.getPriority(), this.getPriority());
    }
    
    @Override
    public void run() {
        System.out.println("Running task - username: " + username + " and priority: " + priority + '.');
        String result = execute();
        try (PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {
            out.println(result);
        }
        catch (IOException e) { e.printStackTrace(); }
        
    }
    
    public String[] getCommand() {
        return command;
    }
    
    public String getUsername() {
        return username;
    }
    
    public byte getPriority() {
        return priority;
    }
    
}
