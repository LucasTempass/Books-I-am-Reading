package Facade;

public class Demo {
    
    public static void main(String[] args) {
        CommentLogger commentLogger = new CommentLogger(new ShortLinearDecorations());
        commentLogger.printComment("Lorem Ipsum");
        commentLogger.setCommentDecorations(new FrameDecorations());
        commentLogger.printComment("Lorem Ipsum");
        
    }
    
}
