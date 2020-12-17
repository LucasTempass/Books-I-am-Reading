package Iterator;

import java.util.ArrayList;

public class RangeIterator <T> implements Iterator<T> {
    
    private ArrayList<T> content;
    private int end;
    private int current;
    
    public RangeIterator(ArrayList<T> content) {
        this.content = content;
        end = content.size() - 1;
        current = -1;
        
    }
    
    public RangeIterator(ArrayList<T> content, int iStart, int end) {
        this.content = content;
        this.end = end;
        current = iStart - 1;
        
    }
    
    @Override
    public boolean hasNext() {
        return current < end;
    }
    
    @Override
    public T next() {
        if (!hasNext()) throw new IndexOutOfBoundsException();
        return content.get(++current);
        
    }
    
}
