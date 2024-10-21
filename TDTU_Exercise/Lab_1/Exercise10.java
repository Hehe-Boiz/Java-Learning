import java.util.Scanner;

public class Exercise10 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        sumHeadAndEnd();
    }

    static void sumHeadAndEnd(){
        System.out.print("Moi nhap so: ");
        int so=sc.nextInt();
        int tong=so/10+so%10;
        System.out.println("tong so dau va so cuoi la: "+tong);
    }
}
