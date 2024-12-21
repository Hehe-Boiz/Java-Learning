package exercise4;

public class Tester {
    public static void main(String[] args) {
        // Tạo các đối tượng
        Point2D point = new Point2D(0, 0);
        Rectangle rect = new Rectangle(2, 3, 4, 5);
        Circle circle = new Circle(1, 1, 3);
        
        // Di chuyển và in kết quả
        System.out.println("Ban đầu:");
        System.out.println(point);
        System.out.println(rect);
        System.out.println(circle);
        
        // Di chuyển các hình
        point.moveRight();
        rect.moveUp();
        circle.moveLeft();
        
        System.out.println("\nSau khi di chuyển:");
        System.out.println(point);
        System.out.println(rect);
        System.out.println(circle);
    }
}
