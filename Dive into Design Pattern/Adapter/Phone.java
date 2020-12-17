package Adapter;

public class Phone {
    
    private MicroSIM microSIM;
    
    public Phone(MicroSIM microSIM) {
        this.microSIM = microSIM;
    }
    
    public void changeSIM(MicroSIM sim) {
        this.microSIM = sim;
    }
    
    public void call() {
        this.microSIM.getData();
        System.out.println("Calling...");
        
    }
    
}
