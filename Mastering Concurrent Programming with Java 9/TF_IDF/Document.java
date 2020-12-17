package TF_IDF;

import java.util.HashMap;
import java.util.Map;

public class Document {
    
    private String title;
    private Map<String, Word> content;
    
    public Document(String title, Map<String, Word> content) {
        this.title = title;
        this.content = content;
        
    }
    
    public Document(String iTitle) {
        title = iTitle;
        content = new HashMap<>();
        
    }
    
    public void addWord(String string) {
        content.computeIfAbsent(string, Word::new).incrementTF();
    }
    
    public String getTitle() {
        return title;
    }
    
    public Map<String, Word> getContent() {
        return content;
    }
    
}