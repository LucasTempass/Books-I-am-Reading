package Iterator;

import java.util.ArrayList;
import java.util.Collections;

//||| Switches between mutable and immutable |||
public class SwitchArray <T> implements Iterable<T> {
    
    private boolean isClosed;
    private ArrayList<T> content;
    
    public SwitchArray() {
        content = new ArrayList<>();
    }
    
    public SwitchArray(ArrayList<T> content) {
        this.content = content;
    }
    
    public boolean switchState() {
        return (isClosed = !isClosed);
    }
    
    void close() {
        isClosed = true;
    }
    
    void open() {
        isClosed = false;
    }
    
    boolean add(T item) {
        if (isOpen()) content.add(item);
        return isOpen();
        
    }
    
    boolean remove(T item) {
        if (isOpen())
            content.remove(item);
        return isOpen();
        
    }
    
    T get(int iPosition) {
        return content.get(iPosition);
    }
    
    public ArrayList<T> asArrayList() {
        var clone = new ArrayList<T>();
        Collections.copy(clone, content);
        return clone;
        
    }
    
    public boolean isOpen() {
        return !isClosed;
    }
    
    @Override
    public Iterator<T> iterator() {
        return new RangeIterator<>(content);
    }
    
}
