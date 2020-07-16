package Decorator;

public class Mozzarella extends Toppings {
    
    public Mozzarella(Pizza iPizza) {
        super(iPizza);
    }
    
    public String getDescription() {
        return this.pizza.getDescription() + ", mozzarella";
    }
    
}
