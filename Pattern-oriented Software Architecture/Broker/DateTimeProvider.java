package Broker;

public abstract class DateTimeProvider {
    
    public DateTimeProvider(DateTimeBroker broker) {
        broker.registerProvider(this);
    }
    
    public abstract String retrieveLocation();
    
}
