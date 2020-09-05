package InvertedIndex;

import java.io.File;
import java.util.Map;
import java.util.concurrent.Callable;

public class IndexingTask implements Callable<Document> {
    
    private File file;
    
    public IndexingTask(File file) {
        this.file = file;
    }
    
    @Override
    public Document call() {
        Map<String, Integer> contents = DocumentParser.parse(file.getAbsolutePath());
        return new Document(file.getName(), contents);
        
    }
    
}
