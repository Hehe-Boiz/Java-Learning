import java.util.Scanner;

public class Exercise4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Fahrenheit();
    }
    static void Fahrenheit(){ //doi nhiet do F -> C
        System.out.print("input temperature Fahrenheit: ");
        double Fahrenheit = sc.nextDouble();
        System.out.println("convert the temperature Fahrenheit to Celsius: " +(Fahrenheit - 32)*5/9);
    }
    static void Celsius(){ //doi nhiet do C -> F
        System.out.print("input temperature Celsius: ");
        double Celsius = sc.nextDouble();
        double convertF=Celsius*9/5+32;
        System.out.println("convert the temperature Celsius to Fahrenheit: "+convertF);
    }
}
