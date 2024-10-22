public class Exercise4 {
    public static void main(String[] args) {
        int []n = {1,2,3,-1,-5};
        System.out.println(findPrimeMin(n));
        
        
    }

    public static boolean is_Prime(int num){
        if(num <= 1){
            return false;
        }
        if (num ==2) return true;
        for(int i = 2; i<Math.sqrt(num);i++){
            if(num % i==0){
                return false;
            }
        }
        return true;
    }
    
    public static int SumPrime(int[] n){
        int sum = 0;
        for(var i : n){
            if(is_Prime(i)) sum+=i;
        }
        return sum;
    }
    
    public static void findNumber(int[] n){
        // Integer duong = null;
        // Integer am = null; 
        
        // for(var i : n){
        //     if(i> 0 && duong == null) duong = i;
            
        //     else if(i>duong) duong = i;
            
        //     else if (i< 0 && am == null) am = i;
            
        //     else if (i< am) am = i;
        // }
        // if(duong  == null){
        //     System.out.println("*");
        // }
        // else if(duong  != null){
        //     System.out.println("so duong lon nhat: "+duong);
        // }
        // if(am  == null){
        //     System.out.println("*");
        // }
        // else if(am  != null){
        //     System.out.println("so am be nhat: "+am);
        // }
        Integer duong = null;
        Integer am = null; 
        
        for (var i : n) {
            if (i > 0) {
                if (duong == null || i > duong) {
                    duong = i;
                }
            } else if (i < 0) {
                if (am == null || i < am) {
                    am = i;
                }
            }
        }
        
        System.out.println(duong == null ? "*" : "so duong lon nhat: " + duong);
        System.out.println(am == null ? "*" : "so am be nhat: " + am);

    }
    
    public static int findPrimeMin(int[] n){
       int min = Integer.MAX_VALUE;;
       for(var i : n){
           if(is_Prime(i) && i < min){
               min =i;
           }
       }
       return min;
    }
}
