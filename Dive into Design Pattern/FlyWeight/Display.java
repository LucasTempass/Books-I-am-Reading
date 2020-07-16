package FlyWeight;

import java.util.ArrayList;

public class Display {
    
    private ArrayList<Particle> particles;
    
    public Display() {
        this.particles = new ArrayList();
    }
    
    public Display(ArrayList<Particle> iParticles) {
        this.particles = iParticles;
    }
    
    public void addParticle(Particle iParticle) {
        this.particles.add(iParticle);
    }
    
    public void drawAll() {
        this.particles.forEach(Particle::draw);
    }
    
}
