import java.util.Scanner;

public class Exercise1 {
    static Scanner sc = new Scanner(System.in);
    public static void GuessNumber() {
        int num = (int) (Math.random() * 100);
        int doan;

        do {
            System.out.println("Moi ban doan: ");
            doan = sc.nextInt();

            if (doan > num) {
                System.out.println("Lon hon");
            } else if (doan < num) {
                System.out.println("Nho hon");
            } else {
                System.out.println("Chinh xac");
            }
        } while (doan != num);
    }
}
