package FlyWeight;

public class Particle {
    
    private int x;
    private int y;
    private ParticleProperty property;
    
    public Particle(int x, int y, ParticleType type) {
        this.property = ParticleFactory.getParticleProperty(type);
        this.x = x;
        this.y = y;
        
    }
    
    public void draw() {
        System.out.println(this);
    }
    
    public String toString() {
        return "Particle { x = " + this.x + ", y = " + this.y + ", property = " + this.property + "}";
    }
    
}
