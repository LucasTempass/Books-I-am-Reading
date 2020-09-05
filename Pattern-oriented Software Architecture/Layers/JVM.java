package Layers;

/** @noinspection ALL */
public class JVM extends Layer<String, Integer> {
    
    private String operatingSystem;
    
    public JVM(String iOperatingSystem, Layer iSubLayer) {
        super(iSubLayer);
        operatingSystem = iOperatingSystem;
        
    }
    
    @Override
    public Integer execute(String bytecode) {
        System.out.println("Running bytecode: ");
        System.out.println(bytecode);
        return 0;
        
    }
    
}
