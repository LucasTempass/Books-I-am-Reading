package ClientServer;

import java.net.Socket;
import java.util.Arrays;

public class QueryCommand extends Command {
    
    public QueryCommand(Socket iClientSocket, String[] command) {
        super(iClientSocket, command);
    }
    
    @Override
    public String execute() {
        return "Querying: " + command[3];
    }
    
}
