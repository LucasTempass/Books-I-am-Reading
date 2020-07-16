package Command;

public class PasteTextCommand implements TextCommand {
    
    private String text;
    
    public PasteTextCommand() { }
    
    public void setContent(String iText) {
        text = iText;
    }
    
    public String getContent() {
        return text;
    }
    
    @Override
    public void exec() {
        System.out.println("Pasted: " + text);
    }
    
}
