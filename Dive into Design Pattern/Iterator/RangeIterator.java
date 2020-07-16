package Iterator;

import java.util.ArrayList;

public class RangeIterator <T> implements Iterator {
    
    private ArrayList<T> content;
    private int end;
    private int current;
    
    public RangeIterator(ArrayList<T> iContent) {
        content = iContent;
        end = iContent.size() - 1;
        current = -1;
        
    }
    
    public RangeIterator(ArrayList<T> iContent, int iStart, int iEnd) {
        content = iContent;
        end = iEnd;
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
