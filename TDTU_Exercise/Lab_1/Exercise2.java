import java.util.Scanner;
public class Exercise2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        AreaTriangle();
    }

    static void AreaTriangle(){
        System.out.print("Nhap height: ");
        double height = sc.nextInt();
        System.out.print("Nhap base: ");
        double base = sc.nextInt();
        System.out.println("The area of a triangle: "+ (height*base)*0.5);
    }
}
