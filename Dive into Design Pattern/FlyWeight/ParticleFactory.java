package FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class ParticleFactory {
    private static Map<ParticleType, ParticleProperty> cache = new HashMap();
    
    public ParticleFactory() {
    }
    
    public static ParticleProperty getParticleProperty(ParticleType iType) {
        cache.computeIfAbsent(iType, ParticleType::getProperty);
        return (ParticleProperty)cache.get(iType);
    }
}
