package Memento;

import java.util.LinkedList;

public class InputHistory {
    
    private LinkedList<TextInput.Memento> history;
    
    public InputHistory() {
        history = new LinkedList<>();
    }
    
    private InputHistory(LinkedList<TextInput.Memento> history) {
        this.history = history;
    }
    
    public void undo(TextInput textInput) {
        if (history.size() != 0)
            textInput.restoreMemento(history.pollLast());
        else System.out.println("History is empty");
        
    }
    
    public void undoAll(TextInput textInput) {
        if (history.size() != 0) {
            textInput.restoreMemento(history.pollFirst());
            history.clear();
        }
        else System.out.println("History is empty");
        
    }
    
    public void addMemento(TextInput.Memento memento) {
        history.add(memento);
    }
    
}
