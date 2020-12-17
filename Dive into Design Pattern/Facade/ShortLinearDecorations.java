package Facade;

public class ShortLinearDecorations implements CommentDecorations {
    
    public ShortLinearDecorations() { }
    
    public void printStart() {
        System.out.print("//||| ");
    }
    
    public void printEnd() {
        System.out.print(" |||");
    }
    
    public void printContent(String content) {
        System.out.print(content);
    }
    
    public void printContent(String[] contents) {
        for (String line : contents) {
            this.printStart();
            this.printContent(line);
            this.printEnd();
            System.out.println();
            
        }
        
    }
    
}
