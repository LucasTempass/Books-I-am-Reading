package Iterator;

import java.util.ArrayList;

//||| Switches between mutable and immutable |||
public class SwitchArray <T> implements Iterable {
    
    private boolean isClosed;
    private ArrayList<T> content;
    
    public boolean switchState() {
        isClosed = !isClosed;
        return isClosed;
        
    }
    
    public SwitchArray() {
        content = new ArrayList<>();
    }
    
    public SwitchArray(ArrayList<T> iContent) {
        content = iContent;
    }
    
    void close() {
        isClosed = true;
    }
    
    void open() {
        isClosed = false;
    }
    
    boolean add(T iItem) {
        if (!isClosed()) content.add(iItem);
        return !isClosed();
        
    }
    
    boolean remove(T iItem) {
        if (!isClosed()) content.remove(iItem);
        return !isClosed();
        
    }
    
    T get(int iPosition) {
        return content.get(iPosition);
    }
    
    public ArrayList<T> asArrayList() {
        return (ArrayList<T>) content.clone();
    }
    
    public boolean isClosed() {
        return isClosed;
    }
    
    @Override
    public Iterator iterator() {
        return new RangeIterator<T>(content);
    }
    
}
