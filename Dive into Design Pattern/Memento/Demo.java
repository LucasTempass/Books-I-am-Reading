package Memento;

public class Demo {
    
    public static void main(String[] args) {
        TextInput iTextInput = new TextInput("Lorem");
        InputHistory iInputHistory = new InputHistory();
        iInputHistory.addMemento(iTextInput.saveMemento());
        System.out.println(iTextInput.getContent());
        iTextInput.setContent("Ipsum");
        System.out.println(iTextInput.getContent());
        iInputHistory.undo(iTextInput);
        System.out.println(iTextInput.getContent());

    }
    
}
