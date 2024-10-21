import java.util.Scanner;

public class Exercise2 {
    Scanner sc= new Scanner(System.in);
    public static int[][] addMatrices (int m1[][], int m2[][]){
        //moi hang cua mang 2 chieu la 1 mang 1 chieu
        if(m1.length != m2.length || m1[0].length != m2[0].length){
            System.out.println("Matrix no equal");
            return null;
        }
        int[][] sumMatrix = new int[m1.length][m1[0].length];
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[0].length;j++){
                sumMatrix[i][j]=m1[i][j] + m2[i][j];
            }
        }
        return sumMatrix;
    }
    public static int[][] multiplyMatrices (int m1[][], int m2[][]){
        //so sanh so cot mang m1 va so hang mang m2
        if(m1[0].length != m2.length){
            System.out.println("Multiplition not possible");
            return null;
        }
        int[][] multiplyMatrices =new int[m1.length][m2[0].length];
        //lay cot mang m1 nhan hang mang m2
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m2[0].length;j++){
                for(int k=0;k<m2.length;k++){
                    //multiplyMatrices[i][j]=multiplyMatrices +m1[i][k]*m2[k][j]
                    multiplyMatrices[i][j]+=m1[i][k] * m2[k][j];
                }
            }
        }
        return multiplyMatrices;
    }
    public static void printMatrix(int[][] array){
        for(int i=0;i<array.length;i++){
            System.out.print("\t");
            for(int j=0;j<array[0].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] m1 = {{1,2,3},{4,5,6}};
        int [][] m2 = {{7,8,9},{10,11,12}};
        int [][] m3 = {{7,8},{9,10},{11,12}};
        //2a
        System.out.println("2a:");
        System.out.println("Matrix A:");
        printMatrix(m1);
        System.out.println("+");
        System.out.println("Maxtrix B: ");
        printMatrix(m2);
        System.out.println("=");
        int[][] addMatrices = addMatrices(m1, m2);
        printMatrix(addMatrices);
        //2b
        System.out.println("2b:");
        System.out.println("Maxtrix A:");
        printMatrix(m1);
        System.out.println("*");
        System.out.println("Maxtrix B:");
        printMatrix(m3);
        System.out.println("=");
        int[][] multiplyMatrices =multiplyMatrices(m1, m3);
        printMatrix(multiplyMatrices);
    }
}
