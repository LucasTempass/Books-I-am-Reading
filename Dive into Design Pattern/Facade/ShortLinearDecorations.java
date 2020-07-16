package Facade;

public class ShortLinearDecorations implements CommentDecorations {
    public ShortLinearDecorations() {
    }
    
    public void printStart() {
        System.out.print("//||| ");
    }
    
    public void printEnd() {
        System.out.print(" |||");
    }
    
    public void printContent(String iContent) {
        System.out.print(iContent);
    }
    
    public void printContent(String[] iContent) {
        String[] var2 = iContent;
        int var3 = iContent.length;
        
        for(int var4 = 0; var4 < var3; ++var4) {
            String line = var2[var4];
            this.printStart();
            this.printContent(line);
            this.printEnd();
            System.out.println();
        }
        
    }
}
