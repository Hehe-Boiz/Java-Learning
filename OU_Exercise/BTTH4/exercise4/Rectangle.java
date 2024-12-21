package exercise4;

public class Rectangle implements Movable{
    private double x, y, a, b; // a là chiều rộng, b là chiều cao
    
    public Rectangle(double x, double y, double a, double b) {
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
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
        return "Rectangle at (" + x + "," + y + ") with width=" + a + " and height=" + b;
    }
}
