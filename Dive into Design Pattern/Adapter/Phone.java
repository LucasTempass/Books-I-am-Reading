package Adapter;

public class Phone {
    
    private MicroSIM microSIM;
    
    public Phone(MicroSIM iMicroSIM) {
        this.microSIM = iMicroSIM;
    }
    
    public void changeSIM(MicroSIM iSIM) {
        this.microSIM = iSIM;
    }
    
    public void call() {
        this.microSIM.getData();
        System.out.println("Calling...");
    }
}
