import java.util.Scanner;

public class Exercise7 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        CheckChar2();
    }

    static void CheckChar1(){ // kiem tra xem co phai la ki tu so hoac chu hay khong

        System.out.print("Nhap vao 1 ki tu: ");
        char character =sc.next().charAt(0); 
        //sc.next(): su dung de lay chuoi tiep theo ma ng dung nhap tu ban phim 
        //charAt(0): phuong thuc cua lop String trong Jva dung de lay ki tu tai vi tri chi
        if(character>='A'&& character<='Z' || character>='a' && character<='z'){
            System.out.println("Day la ki tu chu");
        }
        else if(character>='0' && character<='9'){
            System.out.println("Day la ki tu so");
        }
        else {
            System.out.println("Day khong phai la ki tu");
        }
    }

    static void CheckChar2(){
        char kitu = sc.next().charAt(0);
        if(Character.isLetterOrDigit(kitu)){
            //Character: lop nay cung cap cac phuong thuc de thao tac va kiem tra cac ky tu trong Java
            //isLetterOrDigit: phuong thuc nay lay mot gia tri char don le lam doi so va thuc hien ktra xem co phai la so hay chu khong
            System.out.println("Day la ki tu");
        }
        else{
            System.out.println("Day khong phai la ki tu");
        }
    }
}
