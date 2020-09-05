package Broker;

public class Main {
    
    public static void main(String[] args) {
        Client client = new Client(0);
        DateTimeProvider brazilDateTime = new BrazilDateTimeProvider(DateTimeBroker.getBroker());
        client.displayDateTime();
        DateTimeBroker.getBroker().unregisterProvider(brazilDateTime);
        new UKDateTimeProvider(DateTimeBroker.getBroker());
        client.displayDateTime();
        
    }
    
}
