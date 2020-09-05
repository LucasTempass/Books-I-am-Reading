package WholePart;

public class Triangle extends GraphicalObject implements Resizable {
    
    private Point[] points;
    
    public Triangle(Point a, Point b, Point c) {
        super((a.getX() + b.getX() + c.getX()) / 3, (a.getY() + b.getY() + c.getY()) / 3);
        points = new Point[]{a, b, c};
        
    }
    
    private void setY() {
        y = (points[0].getY() + points[1].getY() + points[2].getY()) / 3;
    }
    
    private void setX() {
        x = (points[0].getX() + points[1].getX() + points[2].getX()) / 3;
    }
    
    @Override
    public void resize(double factor) {
        for (Point point : points) point.moveBy((int) ((point.getX() - x) * factor) - (point.getX() - x), (int) ((point.getY() - y) * factor) - (point.getY() - y));
    }
    
    @Override
    public void moveBy(int offsetX, int offsetY) {
        for (Point point : points) point.moveBy(offsetX, offsetY);
        setY();
        setX();
        
    }
    
    @Override
    public void moveTo(int x, int y) {
        for (Point point : points) point.moveBy(x - this.x, y - this.y);
        setY();
        setX();
        
    }
    
    public Point getPointA() {
        return points[0];
    }
    
    public Point getPointB() {
        return points[1];
    }
    
    public Point getPointC() {
        return points[2];
    }
    
}
