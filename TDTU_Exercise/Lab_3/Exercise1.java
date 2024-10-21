import java.util.Scanner;

public class Exercise1 {
    Scanner sc= new Scanner(System.in);
    public static boolean removeElement(int[] array, int k){
        if(array==null || array.length==0){
            return false;
        }
        for(int i=0; i<array.length; i++){
            if(array[i]==k){
                for(int j=i;j<array.length-1;j++){
                    array[j]=array[j+1];
                }
                array[array.length-1]=0;
                return true;
            }
        }
        return false;
    }

    public static void insertElement(int[] array, int index, int k){
        for(int i=array.length-1;i>index;i--){
            array[i]=array[i-1];
        }
        array[index]=k;
    }

    public static int[] findElement(int [] array){
        int[] duplicate= new int[ array.length];
        int count=0;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    duplicate[count++]=array[i];
                    break;
                }
            }
        }
        int[] result= new int[count];
        for(int i=0;i<count;i++){
            result[i]=duplicate[i];
        }
        return result;
    }

    public static int[] removeElementa(int[] array){
        boolean[] co = new boolean[array.length];
        int count=0;
        for(int i=0;i<array.length;i++){
            co[i]=true;
        }
        for(int i=0;i<array.length;i++){
            if(co[i]==false){
                continue;
            }
            for(int j=i+1;j<array.length;j++){
                if(array[i]== array[j]){
                    co[j]=false;
                    
                }
            }
            count++;
        }
        int[] result= new int[count];
        int index=0;
        for(int i=0;i<array.length;i++){
            if(co[i]==true){
                result[index++]=array[i];
            }
        }
        return result;
    }

    public static int[] removeElementb(int[] array){
        int[] remove = new int[array.length];
        int count=0;
        for(int i=0;i<array.length;i++){
            boolean duplicate = false;
            for(int j=0;j<count;j++){
                if(array[i]==remove[j]){
                    duplicate=true;
                    break;
                }
            }
            // khi duplicate la false
            if(!duplicate){
                remove[count++]=array[i];
            }
        }
        int[] result = new int[count];
        for(int i=0;i<count;i++){
            result[i]=remove[i];
        }
        return result;
    }
   public static void main(String[] args) {
        int[] arr1a = { 1, 3, 1, 3, 2, 4};
        System.out.println("Xoa phan tu so 1: "+removeElement(arr1a, 1));
        for(int so : arr1a){
            System.out.print(so+ " ");
        }
        System.out.println();
        int[] arr2= {1, 3, 1, 3, 2, 4};
        insertElement(arr2, 3, 2);
        for(int so : arr2){
            System.out.print(so+ " ");
        }
        System.out.println();
        int[] arr3={1, 3, 1, 3, 2, 4};
        int[] duplicate= findElement(arr3);
        for(int so: duplicate){
            System.out.print(so+ " ");
        }
        System.out.println();
        int[] arr4a ={1, 3, 1, 3, 2, 4};
        int[] removea =removeElementa(arr4a);
        for(int so: removea){
            System.out.print(so +" ");
        }
        System.out.println();
        int[] arr4b ={1, 3, 1, 3, 2, 4};
        int[] removeb =removeElementb(arr4b);
        for(int so: removeb){
            System.out.print(so +" ");
        }
   }
}
