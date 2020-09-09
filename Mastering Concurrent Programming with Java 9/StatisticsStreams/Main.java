package StatisticsStreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    
    public static void main(String[] args) {
        List<Order> iOrders = new ArrayList<>();
        try {
            iOrders = load(Path.of("./Mastering Concurrent Programming with Java 9/data/OnlineRetailData.csv"));
        }
        catch (IOException ignored) { }
        Statistics.quantityFrom(iOrders, "United Kingdom");
        Statistics.customersFrom(iOrders, "United Kingdom");
        
    }
    
    static List<Order> load(Path path) throws IOException {
        return Files.readAllLines(path).parallelStream()
                    .skip(1).map(l -> l.split(","))
                    .map(Order::new)
                    .collect(Collectors.toList());
        
    }
    
}
