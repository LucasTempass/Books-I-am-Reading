package Command;

public class CopyTextCommand implements TextCommand {
    
    private String text;
    
    public CopyTextCommand() { }
    
    public void setContent(String content) {
        text = content;
    }
    
    public String getContent() {
        return text;
    }
    
    @Override
    public void exec() {
        System.out.println("Copied: " + text);
    }
    
}
