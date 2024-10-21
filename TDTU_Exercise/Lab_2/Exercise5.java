
public class Exercise5 {
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<n/2;i++){
            if(n%2==0){
                return false;
            }
        }
        return true;
    }
    
    public static int countPrime(int arr5[]){
        int dem=0;
        for(int i:arr5){
            if(isPrime(i)){
                dem++;
            }
        }
        return dem;
    }
}
