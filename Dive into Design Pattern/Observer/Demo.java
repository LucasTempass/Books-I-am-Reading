package Observer;

import java.util.ArrayList;

public class Demo {
    
    public static void main(String[] args) {
        Dataset<String> iDataset = new Dataset<>();
        ArrayList<String> iStrings = new ArrayList<String>() {{add("Lorem"); add("Ipsum");}};
        iDataset.subscribe(new Graph("First"));
        iDataset.subscribe(new Graph("Second"));
        iDataset.setContent(iStrings);
        
    }
    
}
