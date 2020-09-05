package Broker;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class BrazilDateTimeProvider extends DateTimeProvider {
    
    protected BrazilDateTimeProvider(DateTimeBroker iBroker) { super(iBroker); }
    
    @Override
    public String retrieveLocation() {
        return LocalDateTime.now(ZoneId.of("America/Sao_Paulo")).toString();
    }
    
}
