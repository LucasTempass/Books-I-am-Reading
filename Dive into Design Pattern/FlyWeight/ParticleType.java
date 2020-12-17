package FlyWeight;

public enum ParticleType {
    
    GREEN("GREEN"),
    RED("RED");
    
    private final String color;
    
    ParticleType(String color) {
        this.color = color;
    }
    
    public ParticleProperty getProperty() {
        return new ParticleProperty(this.color);
    }
    
}
