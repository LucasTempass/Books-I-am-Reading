package ClientServer;

import java.net.Socket;

public class StopCommand extends Command {
    
    public StopCommand(Socket iClientSocket, String[] command) {
        super(iClientSocket, command);
    }
    
    @Override
    public String execute() {
        Server.shutdown();
        return "OK";
        
    }
    
}
