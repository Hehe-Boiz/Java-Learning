
public class Exercise6 {
    public static int findNumber (int bai6a[],int k){
        for(int i=0;i<bai6a.length;i++){
            if(k==bai6a[i]){
                return i;
            }
        }
        return -1;
    }
       
}
