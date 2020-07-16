package FlyWeight;

public class Demo {
    
    public static void main(String[] args) {
        Display display = new Display();
        display.addParticle(new Particle(2, 3, ParticleType.GREEN));
        display.addParticle(new Particle(3, 3, ParticleType.RED));
        display.drawAll();
        
    }
    
}
