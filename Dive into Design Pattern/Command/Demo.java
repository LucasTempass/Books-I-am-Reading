package Command;

public class Demo {
    
    public static void main(String[] args) {
        Button copyButton = new Button(new CopyTextCommand(), "Lorem Ipsum");
        copyButton.click(new ClipBoard());
        
    }
    
}
