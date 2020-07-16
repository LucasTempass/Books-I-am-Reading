package Decorator;

public abstract class Toppings implements Pizza {
    
    protected Pizza pizza;
    
    public Toppings(Pizza iPizza) {
        this.pizza = iPizza;
    }
    
    public Pizza getPizza() {
        return this.pizza;
    }
    
    public void setPizza(Pizza iPizza) {
        this.pizza = iPizza;
    }
    
}
