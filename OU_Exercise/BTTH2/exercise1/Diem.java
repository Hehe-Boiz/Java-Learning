package exercise1;
public class Diem {
    private double x;
    private double y;
    
    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Diem [x=" + x + ", y=" + y + "]";
    }

    public int calculateDistanceTo(Diem other) {
        return (int) Math.round(Math.sqrt(Math.pow((this.x - other.x), 2) + Math.pow((this.y - other.y), 2)));
    }
}
