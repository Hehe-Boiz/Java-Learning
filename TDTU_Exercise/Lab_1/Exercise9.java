import java.util.Scanner;

public class Exercise9 {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        collatzConjecture();
    }

    static void collatzConjecture(){
        System.out.print("Moi nhap so n: ");
        int n=sc.nextInt();
        int tmp;
        do {
            if(n%2 !=0){
                tmp=3*n+1;
                System.out.println(n + " is odd, so we take 3*n+1: "+tmp);
                n=tmp;
            }
            else{
                tmp=n/2;
                System.out.println(n + " is even, so we take n/2: "+tmp);
                n=tmp;
            }
        } while(n>1);
    }
}
