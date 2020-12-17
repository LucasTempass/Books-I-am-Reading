package ClientServer;

import java.net.Socket;

public class QueryCommand extends Command {
    
    public QueryCommand(Socket clientSocket, String[] command) {
        super(clientSocket, command);
    }
    
    @Override
    public String execute() {
        return "Querying: " + command[3];
    }
    
}
