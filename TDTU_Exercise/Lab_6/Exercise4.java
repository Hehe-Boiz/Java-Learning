class Shape{
    private String color;
    private boolean filled;

    public Shape(){
        this.color = "red";
        this.filled = true;
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return this.filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape [color=" + color + ", filled=" + filled + "]";
    }
}

class Circle extends Shape{
    private double radius;

    public Circle(){
        super();
        this.radius = 1.0;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double width){
        // this.radius = radius;
        this.radius = width/2;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle [color=" + super.getColor() + ", filled=" + super.isFilled() + ", radius=" + radius + ", area=" + getArea() + "]";
    }
}

class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width,double length, String color, boolean filled ){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return this.width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return this.length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return (width+length)*2;
    }

    @Override
    public String toString() {
        return "Rectangle [color=" + super.getColor() + ", filled=" + super.isFilled() + ", width=" + width + ", length=" + length + ", area=" + getArea() + ", perimeter=" + getPerimeter() + "]";
    }
}

class Square extends Rectangle{
    public Square(){
        super();
    }

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return getWidth();
    }

    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width){
        super.width = width;
    }

    @Override
    public void setLength(double length){
        super.length = length;
    }

    @Override
    public String toString() {
        return "Square [color=" + getColor() + ", filled=" + isFilled() + ", side=" + getSide() + ", area=" + getArea() + ", perimeter=" + getPerimeter() + "]";
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        
    }
}
