package ClientServer;

import java.util.concurrent.FutureTask;

public class CommandTask <V> extends FutureTask<V> implements Comparable<CommandTask<V>> {
    
    private Command command;
    
    public CommandTask(Command command) {
        super(command, null);
        this.command = command;
        
    }
    
    public Command getCommand() {
        return command;
    }
    
    public void setCommand(Command command) {
        this.command = command;
    }
    
    @Override
    public int compareTo(CommandTask<V> other) {
        return command.compareTo(other.getCommand());
    }
    
}