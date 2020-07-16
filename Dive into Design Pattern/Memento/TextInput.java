package Memento;

public class TextInput {
    
    private String content;
    
    public TextInput(String iContent) {
        content = iContent;
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
    
    public void setContent(String iContent) {
        content = iContent;
    }
    
    public static class Memento {
        
        private final String content;
        
        private Memento(String iContent) {
            content = iContent;
        }
        
        private String getContent() {
            return content;
        }
        
    }
    
}
