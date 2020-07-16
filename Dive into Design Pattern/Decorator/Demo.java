package Decorator;

public class Demo {
    
    public static void main(String[] args) {
        System.out.printf("%s.\n", new TomatoSauce(new Mozzarella(new WholeGrainDough("Lorem Pizza"))).getDescription());
        System.out.printf("%s.\n", new TomatoSauce(new NormalDough("Ipsum Pizza")).getDescription());
        
    }

}
