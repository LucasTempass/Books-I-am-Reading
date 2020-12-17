package InvertedIndex;

import java.util.Map;

public class Document {
    
    private String title;
    private Map<String, Integer> content;
    
    public Document(String iTitle, Map<String, Integer> content) {
        title = iTitle;
        this.content = content;
    
    }
    
    public String getTitle() {
        return title;
    }
    
    public Map<String, Integer> getContent() {
        return content;
    }
    
}
