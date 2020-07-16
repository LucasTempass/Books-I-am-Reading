package Visitor;

public class Token implements Exportable {
    
    private double duration;
    private boolean isAdmin;
    private int userId;
    
    public Token(double iDuration, boolean iIsAdmin, int iUserId) {
        duration = iDuration;
        isAdmin = iIsAdmin;
        userId = iUserId;
        
    }
    
    public double getDuration() {
        return duration;
    }
    
    public boolean isAdmin() {
        return isAdmin;
    }
    
    public int getUserId() {
        return userId;
    }
    
    @Override
    public void accept(Exporter iExporter) {
        iExporter.export(this);
    }
    
}
