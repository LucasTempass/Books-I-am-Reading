package Factory;

public class DrivableFactory {
    
    public static final int C_CAR = 0;
    public static final int C_TRUCK = 1;
    
    public DrivableFactory() { }
    
    public Drivable makeDrivable(int type) {
        return switch (type) {
            case C_CAR -> new Car();
            case C_TRUCK -> new Truck();
            default -> null;
        };
        
    }
    
    public Drivable makeDrivable(DrivableTypes type) {
        return switch (type) {
            case CAR -> new Car();
            case TRUCK -> new Truck();
        };
        
    }
    
}
