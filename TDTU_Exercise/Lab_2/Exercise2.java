import java.util.Scanner;

public class Exercise2 {
   static Scanner sc = new Scanner(System.in);
   public static int findMin(int arr2[]){
        int min_value=arr2[0];
        for(int num: arr2){
            if(num<min_value){
                min_value=num;
            }
        }
        return min_value;
    }
    
}
