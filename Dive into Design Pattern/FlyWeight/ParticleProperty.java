package FlyWeight;

public class ParticleProperty {
    private final String color;
    
    public ParticleProperty(String iColor) {
        this.color = iColor;
    }
    
    public String toString() {
        return this.color;
    }
}
