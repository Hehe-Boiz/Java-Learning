package exercise3;

public class MovableCircle extends MoveablePoint implements Movable {
    int radius;
    MoveablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
        this.center = new MoveablePoint(x,y,xSpeed,ySpeed);
    }

    @Override
    public void moveDown() {
        center.y -= center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x += center.xSpeed;
    }

    @Override
    public void moveUp() {
        center.y += center.ySpeed;
    }

    @Override
    public String toString() {
        return "MovableCircle [radius=" + radius + ", center=" + center + "]";
    }
    
}
