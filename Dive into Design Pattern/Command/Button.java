package Command;

public class Button {
    
    private TextCommand command;
    private String content;
    
    public Button(TextCommand iCommand, String iContent) {
        command = iCommand;
        content = iContent;
        
    }
    
    public TextCommand getCommand() {
        return command;
    }
    
    public void setCommand(TextCommand iCommand) {
        command = iCommand;
    }
    
    public String getId() {
        return content;
    }
    
    public void click(ClipBoard handler) {
        command.setContent(content);
        handler.handle(command);
        
    }
    
}
