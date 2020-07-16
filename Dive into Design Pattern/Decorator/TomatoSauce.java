package Decorator;

public class TomatoSauce extends Toppings {
    public TomatoSauce(Pizza iPizza) {
        super(iPizza);
    }
    
    public String getDescription() {
        return this.pizza.getDescription() + ", tomato sauce";
    }
}
