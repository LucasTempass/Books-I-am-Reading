package ClientServer;

import java.net.Socket;

public class StopCommand extends Command {
    
    public StopCommand(Socket clientSocket, String[] command) {
        super(clientSocket, command);
    }
    
    @Override
    public String execute() {
        Server.shutdown();
        return "OK";
        
    }
    
}
