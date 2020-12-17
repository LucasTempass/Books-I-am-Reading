package SUT;

public class DoublyLinkedDeque <E> {
    
    private Node<E> head;
    private Node<E> tail;
    private int size;
    
    public DoublyLinkedDeque() { }
    
    private boolean isOutOfBounds(int pos) {
        return pos >= size || pos < 0;
    }
    
    public E get(int pos) {
        Node<E> result = getNode(pos);
        if (result == null)
            return null;
        return result.getElement();
        
    }
    
    public E peekLast() {
        if (tail == null)
            return null;
        return tail.getElement();
        
    }
    
    public E peekFirst() {
        if (head == null)
            return null;
        return head.getElement();
        
    }
    
    private Node<E> getNode(int pos) {
        if (isOutOfBounds(pos))
            throw new IndexOutOfBoundsException();
        Node<E> result = head;
        for (int i = 0; i < pos; i++)
            result = result.getNext();
        return result;
        
    }
    
    public int size() {
        return size;
    }
    
    public void enqueue(E element) {
        if (element == null)
            throw new NullPointerException();
        if (size == 1)
            tail = head;
        head = new Node<>(element, head);
        if (size == 0)
            tail = head;
        size++;
        
    }
    
    public void push(E element) {
        if (element == null)
            throw new NullPointerException();
        if (size == 0)
            head = (tail = new Node<>(element));
        else tail = new Node<>(element, tail, null);
        size++;
        
    }
    
    public E pop() {
        if (size == 0)
            throw new ArrayIndexOutOfBoundsException();
        Node<E> oldTail = tail;
        tail = tail.getPrevious();
        size--;
        if (tail == null)
            clear();
        else
            tail.setNext(null);
        return oldTail.getElement();
        
    }
    
    public E dequeue() {
        if (size == 0)
            throw new ArrayIndexOutOfBoundsException();
        Node<E> removed = head;
        head = head.getNext();
        size--;
        if (head == null)
            clear();
        else
            head.setPrevious(null);
        return removed.getElement();
        
    }
    
    public void clear() {
        head = null;
        tail = null;
        size = 0;
        
    }
    
}
