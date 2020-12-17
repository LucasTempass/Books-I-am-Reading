package Memento;

public class Demo {
    
    public static void main(String[] args) {
        TextInput txtInput = new TextInput("Lorem");
        InputHistory inputHistory = new InputHistory();
        inputHistory.addMemento(txtInput.saveMemento());
        System.out.println(txtInput.getContent());
        txtInput.setContent("Ipsum");
        System.out.println(txtInput.getContent());
        inputHistory.undo(txtInput);
        System.out.println(txtInput.getContent());
    
    }
    
}
