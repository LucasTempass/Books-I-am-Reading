package Broker;

public class Client {
    
    private int id;
    
    public Client(int id) { this.id = id; }
    
    public void displayDateTime() {
        var dateTime = DateTimeBroker.getBroker().retrieveLocation();
        if (dateTime == null)
            System.out.println("||| Request failed |||");
        else System.out.println("||| " + dateTime + " |||");
        
    }
    
    
    
}
