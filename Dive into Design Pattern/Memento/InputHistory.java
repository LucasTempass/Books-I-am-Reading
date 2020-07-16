package Memento;

import java.util.LinkedList;

public class InputHistory {
    
    private LinkedList<TextInput.Memento> history;
    
    public InputHistory() {
        history = new LinkedList<>();
    }
    
    private InputHistory(LinkedList<TextInput.Memento> iHistory) {
        history = iHistory;
    }
    
    public void undo(TextInput iTextInput) {
        if (history.size() != 0)
            iTextInput.restoreMemento(history.pollLast());
        else System.out.println("History is empty");
        
    }
    
    public void undoAll(TextInput iTextInput) {
        if (history.size() != 0) {
            iTextInput.restoreMemento(history.pollFirst());
            history.clear();
        }
        else System.out.println("History is empty");
        
    }
    
    public void addMemento(TextInput.Memento iMemento) {
        history.add(iMemento);
    }
    
    //||| Useful for a redo command |||
    public InputHistory clone() {
        return new InputHistory(history);
    }
    
}
