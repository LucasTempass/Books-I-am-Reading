package Composite;

public class File implements Accessible {
    private String title;
    private String content;
    
    public File(String iContent, String iTitle) {
        this.content = iContent;
        this.title = iTitle;
    }
    
    public File(String iTitle) {
        this.title = iTitle;
        this.content = "";
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String iTitle) {
        this.title = iTitle;
    }
    
    public String getContent() {
        return this.content;
    }
    
    public void setContent(String iContent) {
        this.content = iContent;
    }
    
    public void getContents() {
        System.out.println();
        System.out.println("File: " + this.title);
        if (!this.content.equals("")) {
            System.out.println("\n" + this.content);
        }
        
    }
}
