import java.util.Scanner;

public class Exercise2 {
    static Scanner sc = new Scanner(System.in);
    
    public static void Equation() {
        int result = 0;

        System.out.println("Moi ban nhap bac cua da thuc: ");
        int n = sc.nextInt();

        System.out.println("Moi ban nhap x: ");
        int x = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            int tmp = sc.nextInt();
            result += tmp * Math.pow(x, i);

        }
        System.out.println("Ket qua: " + result);
    }
}
