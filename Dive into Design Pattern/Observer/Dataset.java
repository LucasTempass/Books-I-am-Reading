package Observer;

import java.util.ArrayList;

public class Dataset <T> {
    
    private ArrayList<Listener> subscribers;
    private ArrayList<T> content;
    
    public Dataset() {
        content = new ArrayList<>();
        subscribers = new ArrayList<>();
        
    }
    
    public Dataset(ArrayList<Listener> iSubscribers) {
        subscribers = iSubscribers;
        content = new ArrayList<>();
        
    }
    
    public ArrayList<T> getContent() {
        return content;
    }
    
    public void setContent(ArrayList<T> content) {
        this.content = content;
        notifyEvery();
        
    }
    
    public void setSubscribers(ArrayList<Listener> iSubscribers) {
        subscribers = iSubscribers;
    }
    
    public ArrayList<Listener> getSubscribers() {
        return subscribers;
    }
    
    public void subscribe(Listener iListener) {
        subscribers.add(iListener);
    }
    
    public void unsubscribe(Listener iListener) {
        subscribers.remove(iListener);
    }
    
    public void notifyEvery() {
        for (Listener listener : subscribers)
            listener.update();
        
    }
    
    public void notifySingle(Listener iListener) {
        iListener.update();
    }
    
}
