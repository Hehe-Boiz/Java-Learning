import java.util.Scanner;

public class Exercise3 {
    static Scanner sc = new Scanner(System.in);
    public static int SumEven(int arr3[]){
        int sum=0;
        for(int num: arr3){
            if(num%2==0){
                sum=sum+num;
            }
        }
        return sum;
    }
}
