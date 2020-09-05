package InvertedIndex;

import java.util.Map;

public class Document {
    
    private String title;
    private Map<String, Integer> content;
    
    public Document(String iTitle, Map<String, Integer> iContent) {
        title = iTitle;
        content = iContent;
        
    }
    
    public String getTitle() {
        return title;
    }
    
    public Map<String, Integer> getContent() {
        return content;
    }
    
}
