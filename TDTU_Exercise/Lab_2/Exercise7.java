
public class Exercise7 {
    public static void square (int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i] * arr[i];
        }
    }
    public static void bai7(int arr[]){
        square(arr);
        for(int i : arr){
            System.out.print(i);
        }
    }
}
