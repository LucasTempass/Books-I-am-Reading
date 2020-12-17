package Factory;

public class Car implements Drivable {
    
    public Car() {drive(0); }
    
    public void drive(int drivable) {
        System.out.println("Car");
    }
    
}
