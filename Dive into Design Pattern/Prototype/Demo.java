package Prototype;

public class Demo {
    
    public static void main(String[] args) {
        Sheep iDolly = new Sheep("Lorem",3,"Black","Me");
        Sheep iClone = (Sheep) iDolly.clone();
        iClone.setName("Ipsum");
        System.out.println(iDolly);
        System.out.println(iClone);
        
    }
    
}
