import java.util.Scanner;

public class Exercise13 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){  
        isPalindrome1();
    }

    static void isPalindrome1(){
        
        System.out.print("Moi nhap so: ");
        int so=sc.nextInt();
        int dem=0, trai, phai, luu, luu1=so, pali=0;
        while(so != 0){
            so=so/10;
            dem++;
        }
        int dem1=dem/2;
        for(int i=0;i<dem1;i++){
            luu=luu1;
            phai=luu%10;
            for(int j=1;j<dem;j++){
                luu= luu/10;
            }
            trai=luu;
            // phai=luu2%10;
            if(trai == phai && dem>0){
                for(int k=1;k<dem;k++){
                    trai=trai*10;
                }
                luu1=luu1-trai;
            }
            else{
                System.out.println("Day khong phai la palindrome");
                pali++;
                break;
            }
            dem--;

        }
        if(pali==0){
            System.out.println("Day la Palindrome");
        }
    }

    public static void isPalindrome2() {
        System.out.print("Nhap so: ");
        int n=sc.nextInt();
        int originalN = n;
        int reverseN = 0;

        while (n != 0) {
            int digit = n % 10;
            reverseN = reverseN * 10 + digit;
            n /= 10;
        }

        if(originalN == reverseN){
            System.out.println("Day la Palindrome");
        }
        else{
            System.out.println("Day khong phai Palindrome");
        }
    }
}
