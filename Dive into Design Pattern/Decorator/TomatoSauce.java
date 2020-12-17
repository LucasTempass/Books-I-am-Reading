package Decorator;

public class TomatoSauce extends Toppings {
    
    public TomatoSauce(Pizza pizza) {
        super(pizza);
    }
    
    public String getDescription() {
        return this.pizza.getDescription() + ", tomato sauce";
    }
    
}
