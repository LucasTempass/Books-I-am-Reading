package Broker;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DateTimeBroker {
    
    private static DateTimeBroker INSTANCE;
    private List<DateTimeProvider> registeredServers;
    
    private DateTimeBroker() { registeredServers = new ArrayList<>(); }
    
    public static DateTimeBroker getBroker() {
        if (INSTANCE == null)
            INSTANCE = new DateTimeBroker();
        return INSTANCE;
        
    }
    
    public boolean registerProvider(DateTimeProvider iServer) {
        return registeredServers.add(iServer);
    }
    
    public boolean unregisterProvider(DateTimeProvider iServer) {
        return registeredServers.remove(iServer);
    }
    
    public void unregisterAll() {
        registeredServers.clear();
    }
    
    public LocalDateTime retrieveLocation() {
        if (registeredServers.isEmpty())
            return null;
        return ClientProxy.parse(registeredServers.get(0).retrieveLocation());
        
    }
    
}
