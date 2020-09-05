package InvertedIndex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.Normalizer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class DocumentParser {
    
    private static final Pattern PATTERN = Pattern.compile("\\P{IsAlphabetic}+");
    
    public static Map<String, Integer> parse(String route) {
        Map<String, Integer> result = new HashMap<>();
        List<String> file;
        try {
            file = Files.readAllLines(Paths.get(route));
        }
        catch (IOException ignored) {
            return result;
        }
        for (String line : file)
            for (String word : PATTERN.split(line))
                if (!word.isEmpty())
                    result.merge(Normalizer.normalize(word, Normalizer.Form.NFKD).toLowerCase(), 1, Integer::sum);
        return result;
        
    }
    
}
