import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercise3 {
    static Scanner sc = new Scanner(System.in);

    public static void SubEmail() {
        
        System.out.println("Moi ban nhap dia chi email: ");
        String s = sc.nextLine();

        String s_after = s.substring(0, s.indexOf("@"));
        System.out.println(s_after);
    }

    public static void CountUpperCase() {
        System.out.println("Moi ban nhap chuoi: ");
        String s = sc.nextLine();

        int dem = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                dem += 1;
            }
        }
        System.out.println("So chu viet hoa la: " + dem);
    }

    public static void ReplaceString() {
        try ( BufferedReader br = new BufferedReader(new FileReader("src/main/resources/input.txt"));  PrintWriter bw = new PrintWriter(new FileWriter("src/main/resources/output.txt"))) {

            String line = br.readLine();
            String newline = line.replaceAll("\\{file\\}", "Tap tin");
            System.out.println(newline);

            bw.println(newline);

        } catch (IOException e) {
            System.out.println("Error br1 Req1: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void findStringLongest() {
        String s = " Java ;, is, Simple , ";

        s = s.trim();
        String[] a = s.split("[\\s,;.]+");
        String daiNhat = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i].length() > daiNhat.length()) {
                daiNhat = a[i];
            }
        }
        System.out.println("So tu trong xau = " + a.length);
        System.out.println(daiNhat);
    }

    public static void CapitalizeLetter() {
        String s = " Java is siMPle ";
        s = s.trim();
        String[] b = s.split("\\s+");

        String result = "";

        for (int i = 0; i < b.length; i++) {
            result += b[i].substring(0, 1).toUpperCase() + b[i].substring(1).toLowerCase() + " ";
        }

        System.out.println(result.trim());

    }
}
