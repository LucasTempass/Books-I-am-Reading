package Layers;

import java.util.Arrays;

/** @noinspection ALL*/
public class JavaSourceFile extends Layer<String[], Integer> {
    
    public JavaSourceFile(Layer iSubLayer) { super(iSubLayer); }
    
    @Override
    public Integer execute(String[] args) {
        System.out.println("Args recieved: " + Arrays.toString(args));
        return (Integer) subLayer.execute(args[0]);
        
    }
    
}
