class Circle{
    private double radius;
    private String color;

    public Circle(){
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius){
        this.radius = radius;
        this.color = "red";
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return this.radius;
    }

    public String getColor(){
        return this.color;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + "]";
    }
}

class Cylinder extends Circle{
    private double height;

    public Cylinder(){
        super();
        this.height = 1.0;
    }

    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    // tính thể tích khối trụ 
    public double getVolume(){
        return getArea()* height; 
    }

    @Override
    public String toString() {
        return "Cylinder [height=" + height + "]";
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        
    }
}
