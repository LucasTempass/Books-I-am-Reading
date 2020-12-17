package Composite;

public class Directory implements Accessible {
    
    private String title;
    private Accessible[] content;
    
    public Directory(Accessible[] content, String title) {
        this.content = content;
        this.title = title;
    }
    
    public Directory(String title) {
        this.title = title;
        this.content = new Accessible[0];
    }
    
    public Accessible[] getContent() {
        return this.content;
    }
    
    public void setContent(Accessible[] content) {
        this.content = content;
    }
    
    public void getContents() {
        System.out.println("\nContent in " + this.title + ": ");
        Accessible[] var1 = this.content;
        for (Accessible item : var1)
            item.getContents();
        System.out.println();
        System.out.println("//||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        
    }
    
}
