package Layers;

/** @noinspection ALL*/
public class JavaCompiler extends Layer<String, Integer> {
    
    public JavaCompiler(Layer<String, Integer> iSubLayer) {
        super(iSubLayer);
    }
    
    @Override
    public Integer execute(String file) {
        System.out.println("File compiled to bytecode");
        return (Integer) subLayer.execute(file);
        
    }
    
}
