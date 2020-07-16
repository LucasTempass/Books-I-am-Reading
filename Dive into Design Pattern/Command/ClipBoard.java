package Command;

public class ClipBoard implements Handler {
    
    public ClipBoard() { }
    
    public void handle(TextCommand iCommand) {
        iCommand.exec();
    }
    
}
