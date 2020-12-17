package SUT;

public class Node <E> {
    
    private E element;
    private Node<E> next;
    private Node<E> previous;
    
    public Node(E content) {
        this(content, null, null);
    }
    
    public Node(E element, Node<E> next) {
        this(element, null, next);
    }
    
    public Node(E value, Node<E> previous, Node<E> next) {
        element = value;
        this.next = next;
        if (next != null)
            next.setPrevious(this);
        this.previous = previous;
        if (previous != null)
            previous.setNext(this);
        
    }
    
    public Node<E> getPrevious() {
        return previous;
    }
    
    public void setPrevious(Node<E> previous) {
        this.previous = previous;
    }
    
    public E getElement() {
        return element;
    }
    
    public Node<E> getNext() {
        return next;
    }
    
    public void setElement(E element) {
        this.element = element;
    }
    
    public void setNext(Node<E> next) {
        this.next = next;
    }
    
    public boolean hasNext() {
        return next != null;
    }
    
    public boolean hasPrevious() {
        return previous != null;
    }
    
}
