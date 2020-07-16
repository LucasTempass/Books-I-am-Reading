package FlyWeight;

public class Particle {
    private int x;
    private int y;
    private ParticleProperty property;
    
    public Particle(int iX, int iY, ParticleType iType) {
        this.x = iX;
        this.y = iY;
        this.property = ParticleFactory.getParticleProperty(iType);
    }
    
    public void draw() {
        System.out.println(this);
    }
    
    public String toString() {
        return "Particle { x = " + this.x + ", y = " + this.y + ", property = " + this.property + "}";
    }
}
