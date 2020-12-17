package Factory;

public class Truck implements Drivable {
    
    public Truck() { drive(0) ;}
    
    public void drive(int drivable) {
        System.out.println("Truck");
    }
    
}
