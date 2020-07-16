package Composite;

public class Demo {
    public Demo() {
    }
    
    public static void main(String[] args) {
        (new Directory(new Accessible[]{new Directory(new Accessible[]{new File("1. The Component interface describes operations that are common to both simple and complex elements of the tree.\n2. The Leaf is a basic element of a tree that doesn’t have sub-elements.\nUsually, leaf components end up doing most of the real work,\nsince they don’t have anyone to delegate the work to.\n3. The Container (aka composite) is an element that has sub-elements: leaves or other containers. A container doesn’t know\nthe concrete classes of its children. It works with all sub-elements only via the component interface.", "composite.txt"), new File("/*||||||||| CONVENTIONS |||||||||||\n||| e prefix = static & global ||||\n||| i prefix = input/argument |||||\n||| no prefix = method/attrib |||||\n||| c_ prefix = constant/final ||||\n|||||||||||||||||||||||||||||||||*/", "Conventions.jpg")}, "Lucas"), new File("empty.txt")}, "Users")).getContents();
    }
}
