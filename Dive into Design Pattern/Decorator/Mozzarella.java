package Decorator;

public class Mozzarella extends Toppings {
    
    public Mozzarella(Pizza pizza) {
        super(pizza);
    }
    
    public String getDescription() {
        return this.pizza.getDescription() + ", mozzarella";
    }
    
}
