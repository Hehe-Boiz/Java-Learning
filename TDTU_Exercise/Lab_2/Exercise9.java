import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Exercise9 {
    static Scanner sc = new Scanner(System.in);
    public static int[] divisibleNumbersA(int arr[], int k) {
        int dem=0;
        for (int i : arr){
            if(i % k==0){
                dem++;
            }
        }
        int []divisibleArray=new int [dem];
        int index =0;
        for(int i: arr){
            if(i % k ==0){
                divisibleArray [index]=i;
                index++;
            }
        }
        return divisibleArray;
    }

    public static int[] divisibleNumbersB(int arr[], int k){
        List<Integer> divisibleList = new ArrayList<>();
        for( int i : arr){
            if(i % k ==0 ){
                divisibleList.add(i);
            }
        }
        int [] divisibleArray = new int[divisibleList.size()];
        for (int i=0; i<divisibleList.size();i++){
            divisibleArray[i] = divisibleList.get(i);
        }
        return divisibleArray;
    }
    public static void main(String[] args) {
        System.out.print("Moi nhap so luong mang: ");
        int size = sc.nextInt();
        int []array =new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.print("Nhap so: ");
        int so = sc.nextInt();
        int[] divisible = divisibleNumbersA(array, so);
        for(int i: divisible){
            System.out.print(i+" ");

        } 
    }
}
