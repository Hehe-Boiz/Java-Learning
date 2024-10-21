import java.util.Scanner;
import java.util.Arrays;

public class Exercise10 {
    public static int findThirdNumberA(int arr[]){
        int first, second, third;
        first = second = third = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                third =second;
                second=first;
                first=arr[i];
            }
            else if (arr[i]>second){
                third = second;
                second =arr[i];
            }

            else if (arr[i]>third){
                third = arr[i];
            }
        }
        return third;
    }

    public static int findThirdNumberB(int arr[]){
        Arrays.sort(arr);
        int dem=0;
        for(int i=arr.length-2; i>=0 ; i--){
            if(arr[i] != arr[i+1]){
                dem++;
            }
            if(dem==2){
                return arr[i];
            }
        }
        return -1;
    }

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Moi nhap so luong mang: ");
        int size = sc.nextInt();
        int []array =new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("so lon thu 3 trong mang: "+findThirdNumberA(array));
    }
}
