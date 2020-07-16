package Facade;

public class CommentLogger {
    private final CommentSaver commentSaver = new CommentSaver();
    private final CommentUploader commentUploader = new CommentUploader();
    private final CommentPrinter commentPrinter = new CommentPrinter();
    private CommentDecorations commentDecorations;
    
    public CommentLogger(CommentDecorations iCommentDecorations) {
        this.commentDecorations = iCommentDecorations;
    }
    
    public void setCommentDecorations(CommentDecorations iCommentDecorations) {
        this.commentDecorations = iCommentDecorations;
    }
    
    public void printComment(String iComment) {
        System.out.println();
        this.commentUploader.upload();
        this.commentSaver.save();
        this.commentPrinter.printComment(this.commentDecorations, iComment);
        
    }
    
    public void printComment(String[] iComments) {
        this.commentUploader.upload();
        this.commentSaver.save();
        this.commentPrinter.printComments(this.commentDecorations, iComments);
        
    }
}
