import java.util.Scanner;

public class Exercise6 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        findMax();
    }
    static void findMax(){ // tim so lon nhat trong 3 so
        System.out.print("Nhap vao 3 so nguyen: ");
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        int max =a;
        if(b> max){
            max =b;
        }
        if (c>max){
            max =c;
        }
        System.out.println("so lon nhat trong 3 so la: "+max);
    }
}
