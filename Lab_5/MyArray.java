import java.util.Scanner;

public class MyArray {

    //1a
    public static int maxEven(int[] a){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < a.length; i++){
            if(a[i] > max && a[i]%2 == 0){
                max = a[i];
            }
        }
        return max;
    }

    //1b
    public static int minOdd(int[] a){
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < a.length; i++){
            if(a[i] < min && a[i]%2 != 0){
                min = a[i];
            }
        }
        return min;
    }

    public static int sumMEMO(int[] a){
        return maxEven(a) + minOdd(a);
    }

    //1c
    public  static  int  sumEven(int[]  a){
        int sum = 0;
        for(int i : a){
            if(i % 2 == 0){
                sum+=i;
            }
        }
        return sum;
    }

    //1d
    public  static  int  prodOdd(int[]  a){
        int prod = 1;
        for(int num : a){
            if(num % 2 != 0){
                prod*=num;
            }
        }
        return prod;
    }
    
    //1e
    public static int idxFirstEven(int[] a){
        for(int i=0;i<a.length; i++){
            if(a[i] % 2 == 0){
                return i;
            }
        }
        return -1;
    }

    //1f
    public static int idxLastOdd(int[] a){
        for(int i=a.length-1;i>0; i--){
            if(a[i] % 2 != 0){
                return i;
            }
        }
        return -1;
    }

    //1h
    public  static  int[]  input(int  n){
        int[] a = new int[n];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }
        scanner.close();
        return a;
    }

    // 1i
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of elements of array: ");
        int n = scanner.nextInt();
        System.out.println("Input elements:");
        int[]a = input(n);
        scanner.close();
        System.out.println("Max even: " + maxEven(a));
        System.out.println("Min odd: " + minOdd(a));
        System.out.println("Sum MEMO:" + sumMEMO(a));
        System.out.println("Sum Even: "+ sumEven(a));
        System.out.println("Product odd: "+prodOdd(a));
        System.out.println("First index of even number: "+idxFirstEven(a));
        System.out.println("Last index of odd number: "+idxLastOdd(a));
    }
}
