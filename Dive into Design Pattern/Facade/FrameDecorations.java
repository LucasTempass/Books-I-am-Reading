package Facade;

public class FrameDecorations implements CommentDecorations {
    
    private int eLongestLineLength = 0;
    
    public FrameDecorations() { }
    
    public void printStart() {
        System.out.print("/*");
    }
    
    public void printEnd() {
        System.out.print("*/\n");
    }
    
    public void printContent(String content) {
        eLongestLineLength = content.length();
        fillLine(eLongestLineLength + 6);
        System.out.print("\n||| " + content + " |||\n");
        fillLine(eLongestLineLength + 6);
        
    }
    
    private void fillLine(int iMeasure) {
        for (int i = 0; i < iMeasure; ++i) System.out.print("|");
    }
    
    public void printContent(String[] contents) {
        printStart();
        getLongestLine(contents);
        fillLine(eLongestLineLength + 6);
        for (String line : contents) {
            int pipeAmount = eLongestLineLength + 6 - line.length() >> 1;
            System.out.println();
            fillLine(pipeAmount);
            System.out.print(" " + line + " ");
            fillLine(line.length() % 2 != 0 ? pipeAmount : pipeAmount + 1);
        }
        System.out.println();
        fillLine(eLongestLineLength + 6);
        printEnd();
        
    }
    
    private void getLongestLine(String[] content) {
        for (String line : content)
            if (line.length() > eLongestLineLength)
                eLongestLineLength = line.length();
        
    }
    
}
