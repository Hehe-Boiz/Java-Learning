package exercise4;

public class Circle implements Movable{
    private double x, y, r; // r là bán kính
    
    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
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
        return "Circle at (" + x + "," + y + ") with radius=" + r;
    }
}
