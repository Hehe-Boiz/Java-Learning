package exercise4;

public class Circle implements GeometricObject{
    protected double radius;

    public Circle() {
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius; 
    }

    @Override
    public double getPerimeter(){
        return Math.PI*radius;
    }
}
