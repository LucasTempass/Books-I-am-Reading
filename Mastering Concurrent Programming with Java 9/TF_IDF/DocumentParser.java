package TF_IDF;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.Normalizer;

public class DocumentParser {
    
    public static Document parse(String path) {
        Path file = Paths.get(path);
        Document doc = new Document(file.toString());
        try (BufferedReader ignored = Files.newBufferedReader(file)) {
            for (String line : Files.readAllLines(file))
                parseLine(line, doc);
        }
        catch (IOException ignored) { }
        return doc;
        
    }
    
    private static void parseLine(String line, Document ret) {
        line = Normalizer.normalize(line, Normalizer.Form.NFKD)
                         .replaceAll("[^\\p{ASCII}]", "")
                         .toLowerCase();
        for (String w : line.split("\\W+"))
            ret.addWord(w);
        
    }
    
}
