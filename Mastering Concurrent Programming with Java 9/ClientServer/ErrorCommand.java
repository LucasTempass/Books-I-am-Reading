package ClientServer;

import java.net.Socket;

public class ErrorCommand extends Command {
    
    public ErrorCommand(Socket iClientSocket, String[] command) {
        super(iClientSocket, command);
    }
    
    @Override
    public String execute() {
        return "Error: command unknown";
    }
    
}
