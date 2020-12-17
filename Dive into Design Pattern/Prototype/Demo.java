package Prototype;

public class Demo {
    
    public static void main(String[] args) {
        Sheep dolly = new Sheep("Lorem", 3, "Black", "Me");
        Sheep clone = (Sheep) dolly.clone();
        clone.setName("Ipsum");
        System.out.println(dolly);
        System.out.println(clone);
    
    }
    
}
