import java.util.Scanner;

public class Exercise4 {
   static Scanner sc = new Scanner(System.in);

    public static int countNumberFind(int arr[], int k){
        int dem=0;
        for(int i=0;i<arr.length;i++){
            if(k==arr[i]){
                dem++;
            }
        }
        return dem;
    }

    
}
