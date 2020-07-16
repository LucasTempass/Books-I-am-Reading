package Facade;

public class CommentPrinter {
    public CommentPrinter() {
    }
    
    void printComment(CommentDecorations iDecorations, String iComment) {
        System.out.println("Displaying stored comment\n");
        iDecorations.printStart();
        iDecorations.printContent(iComment);
        iDecorations.printEnd();
    }
    
    void printComments(CommentDecorations iDecorations, String[] iComments) {
        System.out.println("Displaying stored comments\n");
        iDecorations.printContent(iComments);
    }
}
