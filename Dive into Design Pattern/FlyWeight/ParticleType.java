package FlyWeight;

public enum ParticleType {
    GREEN("GREEN"),
    RED("RED");
    
    private final String color;
    
    private ParticleType(String iColor) {
        this.color = iColor;
    }
    
    public ParticleProperty getProperty() {
        return new ParticleProperty(this.color);
    }
}
