package WholePart;

public abstract class GraphicalObject {
    
    int x;
    int y;
    
    public GraphicalObject(int iX, int iY) {
        x = iX;
        y = iY;
        
    }
    
    public abstract void moveBy(int offsetX, int offsetY);
    
    public abstract void moveTo(int x, int y);
    
    public int getX() {
        return x;
    }
    
    public void setX(int iX) {
        x = iX;
    }
    
    public int getY() {
        return y;
    }
    
    public void setY(int iY) {
        y = iY;
    }
    
}
