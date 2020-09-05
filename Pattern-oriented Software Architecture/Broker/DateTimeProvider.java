package Broker;

public abstract class DateTimeProvider {
    
    public DateTimeProvider(DateTimeBroker iBroker) {
        iBroker.registerProvider(this);
    }
    
    public abstract String retrieveLocation();
    
}
