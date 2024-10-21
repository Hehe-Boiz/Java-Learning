import java.util.Scanner;

public class Exercise5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LeapYear();
    }

    static void LeapYear(){ // tinh nam nhuan
        System.out.print("Nhap nam ban muon tinh: ");
        int nam = sc.nextInt();
        if(nam %4 !=0){
            System.out.println("Khong phai nam nhuan");
        }
        else{
            System.out.println("Nam " + nam + " la nam nhuan");
        }
    }
}
