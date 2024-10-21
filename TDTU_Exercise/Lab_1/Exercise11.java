import java.util.Scanner;


public class Exercise11 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        countDigits();
    }

    static void countDigits(){
        System.out.print("Moi nhap so: ");
        int number=sc.nextInt();
        int dem=0;
        while(number !=0){
            number = number / 10;
            dem++;
        }
        System.out.println(" Co tat ca "+ dem +" chu so");
    }
}
