package exercise4;

import java.util.Scanner;
import java.util.Vector;
import java.util.Random;

public class Exercise4 {
    public static Vector<Long> calculateFx (Vector<Integer> X){
        Vector<Long> Y = new Vector<>();
        for(Integer x : X){

            Y.add((2L*x*x + 1));
        }
        return Y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        Random random = new Random();
        System.out.println("Enter the size of Vector: ");
        int n = 5;
        
        // trình biên dịch sẽ từ bên trái để xác định kiểu dữ liệu 
        Vector <Integer> X= new Vector<>(n);
        System.out.println("Enter the values of X:");
        for (int i = 0; i < n; i++) {
            int value = random.nextInt(1000); // 0-999
            System.out.println(value);
            X.add(value);
        }

        scanner.close(); // giải phóng tài nguyên
        Vector<Long> Y = calculateFx(X);
        System.out.println("Values of F(x): " + Y);
    }
}
