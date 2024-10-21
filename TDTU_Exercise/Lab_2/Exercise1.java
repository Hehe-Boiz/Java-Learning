import java.util.Scanner;
public class Exercise1 {
    Scanner sc = new Scanner(System.in);
    public static int findMax(int arr1[]) {
        int max_value=arr1[0];
        for(int num : arr1){
            if(num>max_value){
                max_value=num;
            }
        }
        return max_value;
    }
}
