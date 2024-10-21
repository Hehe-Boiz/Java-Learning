import java.util.Scanner;

public class Exercise8 {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        sumFromOneToN();
        MulFromOneToN();
        sumOfPowersOfTwo();
        sumOfEvenNumbersUpToN();
        sumOfSquaresUpToN();
    }

    static void sumFromOneToN(){
        System.out.print("moi nhap so n: ");
        int n = sc.nextInt();
        int sum =0;
        for (int i=0; i<=n;i++){
            sum = i + sum;
        }
        System.out.println("tong tu 1 toi n la: "+sum);
    }
    static void MulFromOneToN(){
        System.out.print("Moi nhap so n: ");
        int n = sc.nextInt();
        int result= 1;
        for(int i=1;i<=n;i++){
            result = i*result;
        }
        System.out.println("Nhan tu 1 toi n la: "+result);
    }
    static void sumOfPowersOfTwo(){
        System.out.print("Moi nhap so n: ");
        int n=sc.nextInt();
        int result =1;
        for(int i=1;i<=n;i++){
            int luu=2;
            for(int j=1;j<i;j++){
                luu=luu*2;
            }
            result=luu+result;
        }
        System.out.println("ket qua cuoi la: "+result);
    }
    static void sumOfEvenNumbersUpToN(){
        System.out.print("Moi nhap so n: ");
        int n=sc.nextInt();
        double sum=0;
        for(int i=1; i<=n;i++){
            sum = sum + (double) 1/(2*i);
        }
        System.out.println("Tong tat ca la: "+sum);
    }
    static void sumOfSquaresUpToN(){
        System.out.print("Moi nhap so n: ");
        int n=sc.nextInt();
        int tong =1;
        for(int i=2;i<=n;i++){
            tong =tong + (i*i);
        }
        System.out.println("Tong tat ca i mu la: "+tong);
    }
}
