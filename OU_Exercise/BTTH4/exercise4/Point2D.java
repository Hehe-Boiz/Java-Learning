package exercise4;

public class Point2D implements Movable{
    private double x, y;
    
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void moveUp() {
        y++;
    }
    
    @Override
    public void moveDown() {
        y--;
    }
    
    @Override
    public void moveLeft() {
        x--;
    }
    
    @Override
    public void moveRight() {
        x++;
    }
    
    @Override
    public String toString() {
        return "Point at (" + x + "," + y + ")";
    }
}
