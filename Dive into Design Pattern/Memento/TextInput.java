package Memento;

public class TextInput {
    
    private String content;
    
    public TextInput(String content) {
        this.content = content;
    }
    
    public Memento saveMemento() {
        return new Memento(content);
    }
    
    public void restoreMemento(Memento iState) {
        content = iState.getContent();
    }
    
    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    public static class Memento {
        
        private final String content;
        
        private Memento(String content) {
            this.content = content;
        }
        
        private String getContent() {
            return content;
        }
        
    }
    
}
