package exercise1;


public class Main {
    public static void main(String[] args) { 
        Shape s = new Rectangle(4.0, 3.0, "white"); 
        System.out.println(s.toString()); 
        System.out.println("Area = " + s.getArea()); 
 
        s = new Triangle("black", 8, 7); 
        System.out.println(s.toString()); 
        System.out.println("Area = " + s.getArea()); 
    }
}
