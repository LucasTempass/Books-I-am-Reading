package StatisticsStreams;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Statistics {
    
    public static void customersFrom(List<Order> iOrders, String country) {
        System.out.println("**************************************");
        System.out.println("Customers from United Kingdom");
        Map<String, List<Order>> map = iOrders
                .parallelStream()
                .filter(r -> r.getCountry().equals(country))
                .filter(r -> r.getCustomer() != null)
                .collect(Collectors.groupingBy(Order::getCustomer));
        map.forEach((key, list) -> System.out.println("Client  " + key + ": " + list.size()));
        System.out.println("**************************************");
        
    }
    
    //the United Kingdom
    public static void quantityFrom(List<Order> iOrders, String country) {
        System.out.println("**************************************");
        System.out.println("Quantity from " + country);
        DoubleSummaryStatistics statistics = iOrders
                .parallelStream()
                .filter(Objects::nonNull)
                .filter(r -> r.getCountry().equals(country.strip()))
                .collect(Collectors.summarizingDouble(Order::getQuantity));
        System.out.println("Min: " + statistics.getMin());
        System.out.println("Max: " + statistics.getMax());
        System.out.println("Average: " + statistics.getAverage());
        System.out.println("**************************************");
        
    }
    
}
