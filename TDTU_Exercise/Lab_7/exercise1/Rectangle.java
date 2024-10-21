package exercise1;

public class Rectangle extends Shape {
    private double length; 
    private double width; 
 
    public Rectangle() { 
        super(); 
        this.length = 0; 
        this.width = 0; 
    } 
 
    public Rectangle(double length, double width, String color) { 
        super(color); 
        this.length = length; 
        this.width = width; 
    } 
 
    @Override 
    public double getArea() { 
        return this. length * this.width; 
    } 
 
    public double getPerimeter() { 
        return (this.length + this.width) * 2.0; 
    } 
 
    public String toString() { 
        return "Rectangle{" + "length=" + length +  
               ", width=" + width + 
               ", color=" + color + '}'; 
    }
}
