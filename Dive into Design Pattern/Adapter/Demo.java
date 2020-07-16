package Adapter;

public class Demo {
    
    public static void main(String[] args) {
        Phone iPhone = new Phone(new MicroAdapter(new NanoSIMCard()));
        iPhone.call();
        iPhone.changeSIM(new MicroSIMCard());
        iPhone.call();
        
    }
    
}
