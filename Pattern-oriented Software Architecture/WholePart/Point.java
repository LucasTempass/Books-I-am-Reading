package WholePart;

public class Point extends GraphicalObject {
    
    public Point(int iX, int iY) {
        super(iX, iY);
    }
    
    @Override
    public void moveBy(int offsetX, int offsetY) {
        x += offsetX;
        y += offsetY;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        
    }
    
    @Override
    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
        
    }
    
}
