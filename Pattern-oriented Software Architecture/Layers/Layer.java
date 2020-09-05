package Layers;

//||| Also known as tier |||
public abstract class Layer <P, V> {
    
    protected Layer subLayer;
    
    public Layer(Layer iSubLayer) {subLayer = iSubLayer;}
    
    public void setSubLayer(Layer iSubLayer) {
        subLayer = iSubLayer;
    }
    
    public Layer getSubLayer() {
        return subLayer;
    }
    
    public abstract V execute(P parameter);
    
}
