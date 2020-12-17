package Visitor;

public class Token implements Exportable {
    
    private double duration;
    private boolean isAdmin;
    private int userId;
    
    public Token(double duration, boolean isAdmin, int userId) {
        this.duration = duration;
        this.isAdmin = isAdmin;
        this.userId = userId;
        
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
    public void accept(Exporter exporter) {
        exporter.export(this);
    }
    
}
