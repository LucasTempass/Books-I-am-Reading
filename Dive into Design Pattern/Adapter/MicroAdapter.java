package Adapter;

public class MicroAdapter implements MicroSIM {
    
    private NanoSIMCard eNanoSIMCard;
    
    public MicroAdapter(NanoSIMCard iNanoSIMCard) {
        this.eNanoSIMCard = iNanoSIMCard;
    }
    
    public void getData() {
        this.eNanoSIMCard.getReception();
    }
    
}
