import java.util.Scanner;

public class Exercise12 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
    }

    static void reverseNumber(){
        System.out.print("Moi nhap so n: ");
        int number=sc.nextInt();
        int luu = number, sodaonguoc=0, dem=0, tam;
        while(number != 0){
            number=number/10;
            dem++;
        }
        int sodemtrong=dem;
        for(int i=0;i<dem;i++){
            tam=luu%10;
            for(int j=1;j<sodemtrong && sodemtrong>0;j++){
                tam=tam*10;
            }
            sodemtrong--;
            luu=luu/10;
            sodaonguoc=tam+sodaonguoc;
        }
        System.out.println("So dao nguoc la: "+sodaonguoc);
    }
}
