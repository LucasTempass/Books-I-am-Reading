package EventNotification;

import java.util.Date;

public class Event {
    
    private String message;
    private String source;
    private Date date;
    
    public Event(String iMessage, String iSource, Date iDate) {
        message = iMessage;
        source = iSource;
        date = iDate;
        
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String iMessage) {
        message = iMessage;
    }
    
    public String getSource() {
        return source;
    }
    
    public void setSource(String iSource) {
        source = iSource;
    }
    
    public Date getDate() {
        return date;
    }
    
    public void setDate(Date iDate) {
        date = iDate;
    }
    
}
