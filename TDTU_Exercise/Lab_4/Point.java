public class Point{
    private float x = 0.0f;
    private float y = 0.0f;

    //constructor
    public Point() {

    }
    
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    //getters and setters
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float d) {
        this.x = d;
    }

    public void setY(float y) {
        this.y = y;
    }
    
    @Override
    public String toString() {
        return "x: " + x + ", y: " + y ;
    }

    public static void main(String[] args) {
        Point point = new Point();
        point.setX(2.5f);
        point.setY(5.5f);
        System.out.println(point.toString());

    }
}