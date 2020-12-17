package Command;

public class Button {
    
    private TextCommand command;
    private String content;
    
    public Button(TextCommand command, String content) {
        this.command = command;
        this.content = content;
        
    }
    
    public TextCommand getCommand() {
        return command;
    }
    
    public void setCommand(TextCommand command) {
        this.command = command;
    }
    
    public void click(ClipBoard handler) {
        command.setContent(content);
        handler.handle(command);
        
    }
    
}
