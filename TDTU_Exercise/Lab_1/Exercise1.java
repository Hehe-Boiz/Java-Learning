import java.util.Scanner;

public class Exercise1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){  
        getAndDisplayInformation();
        System.out.println("heheboiz");
    } 
    static void getAndDisplayInformation(){
        System.out.print("Moi ban nhap ten: ");
        String name = sc.nextLine();
        System.out.print("Moi ban nhap ID: ");
        int id = sc.nextInt();
        System.out.print("Moi ban nhap ngay sinh: ");
        int date = sc.nextInt();
        System.out.println("Ten: "+name);
        System.out.println("ID: "+id);
        System.out.println("Ngay sinh: "+date);
    }
}
