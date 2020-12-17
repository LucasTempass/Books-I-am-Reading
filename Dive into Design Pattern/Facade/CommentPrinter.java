package Facade;

public class CommentPrinter {
    
    public CommentPrinter() { }
    
    void printComment(CommentDecorations decorations, String iComment) {
        System.out.println("Displaying stored comment\n");
        decorations.printStart();
        decorations.printContent(iComment);
        decorations.printEnd();
        
    }
    
    void printComments(CommentDecorations decorations, String[] iComments) {
        System.out.println("Displaying stored comments\n");
        decorations.printContent(iComments);
        
    }
    
}
