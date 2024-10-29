package exercise4;

import exercise1.*;

public class HinhTron {
    private Diem p;
    private double radius;

    public Diem getP() {
        return p;
    }

    public void setP(Diem p) {
        this.p = p;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public HinhTron(Diem p, double radius) {
        this.p = p;
        this.radius = radius;
    }

    public double areaCircle() {
        return 2 * Math.PI * radius;
    }

    public double perimeterCircle() {
        return Math.PI * Math.pow(radius, 2);
    }

    public String checkPointRelationToCircle(Diem pOther) {
        double distance = pOther.calculateDistanceTo(this.p);

        if (distance > radius)
            return "Nằm ngoài đường tròn";
        else if (distance == radius)
            return "Nằm trên đường tròn";
        else
            return "Nằm trong đường tròn";
    }

    public String checkCirclesPositionRelative(HinhTron other){
        double d = Math.sqrt(Math.pow((other.getP().getX() - this.p.getX()), 2) + Math.pow((other.getP().getY() - this.p.getY()), 2));

        if (d > this.radius + other.getRadius()) {
            return "Hai hình tròn không giao nhau.";
        } else if (d == this.radius + other.getRadius()) {
            return "Hai hình tròn chạm nhau.";
        } else if (Math.abs(this.radius - other.getRadius()) < d && d < this.radius + other.getRadius()) {
            return "Hai hình tròn giao nhau.";
        } else if (d < Math.abs(this.radius - other.getRadius())) {
            return "Một hình tròn nằm trong hình tròn khác.";
        } else {
            return "Tình huống không xác định.";
        }
    }
}
