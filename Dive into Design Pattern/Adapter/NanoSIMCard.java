package Adapter;

public class NanoSIMCard implements NanoSIM {
    public NanoSIMCard() {
    }
    
    public void getReception() {
        System.out.println("Getting data from NanoSIM");
    }
}
