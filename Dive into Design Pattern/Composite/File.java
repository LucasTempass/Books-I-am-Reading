package Composite;

public class File implements Accessible {
    
    private String title;
    private String content;
    
    public File(String content, String title) {
        this.content = content;
        this.title = title;
    }
    
    public File(String iTitle) {
        this.title = iTitle;
        this.content = "";
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    public void getContents() {
        System.out.println();
        System.out.println("File: " + this.title);
        if (!this.content.equals(""))
            System.out.println("\n" + this.content);
        
    }
    
}
