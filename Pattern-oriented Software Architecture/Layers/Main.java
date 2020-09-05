package Layers;

public class Main {
    
    /** The Layers (aka Multitier) architecture allows a system to be modular,
     also providing maintainability and a cleaner usability. The use of an abstract class
     was an implementation detail for brevity **/
    
    public static void main(String[] args) {
        var jvm = new JVM("Windows", null);
        var javac = new JavaCompiler(jvm);
        var logger = new JavaSourceFile(javac);
        int exitCode = logger.execute(new String[]{"Hello World"});
        System.out.println("Program finished with exit code " + exitCode);
        
    }
    
}
