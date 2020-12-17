package Adapter;

public class MicroAdapter implements MicroSIM {
    
    private NanoSIMCard nanoSIMCard;
    
    public MicroAdapter(NanoSIMCard iNanoSIMCard) {
        this.nanoSIMCard = iNanoSIMCard;
    }
    
    public void getData() {
        this.nanoSIMCard.getReception();
    }
    
}
