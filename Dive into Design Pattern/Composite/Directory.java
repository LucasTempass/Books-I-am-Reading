package Composite;

public class Directory implements Accessible {
    private String title;
    private Accessible[] content;
    
    public Directory(Accessible[] iContent, String iTitle) {
        this.content = iContent;
        this.title = iTitle;
    }
    
    public Directory(String iTitle) {
        this.title = iTitle;
        this.content = new Accessible[0];
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String iTitle) {
        this.title = iTitle;
    }
    
    public Accessible[] getContent() {
        return this.content;
    }
    
    public void setContent(Accessible[] iContent) {
        this.content = iContent;
    }
    
    public void getContents() {
        System.out.println("\nContent in " + this.title + ": ");
        Accessible[] var1 = this.content;
        int var2 = var1.length;
        
        for(int var3 = 0; var3 < var2; ++var3) {
            Accessible item = var1[var3];
            item.getContents();
        }
        
        System.out.println();
        System.out.println("//||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
    }
}
