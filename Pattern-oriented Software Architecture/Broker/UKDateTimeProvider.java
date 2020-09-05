package Broker;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class UKDateTimeProvider extends DateTimeProvider {
    
    protected UKDateTimeProvider(DateTimeBroker iBroker) { super(iBroker); }
    
    @Override
    public String retrieveLocation() {
        return LocalDateTime.now(ZoneId.of("Europe/London")).toString();
    }
    
}
