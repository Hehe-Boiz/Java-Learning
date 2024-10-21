package exercise1;

public class Calculator {
    public double divide(int a, int b){
        if(b == 0){
            throw new ArithmeticException("Divide by zero");
        }
        return (double) a/b;
    }

    public int multiply(int a, int b) throws NumberOutOfRangeException{
        if(a > 1000 || a < -1000 || b > 1000 || b < -1000){
            throw new NumberOutOfRangeException("Number is outside the computaion");
        }
        return a*b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        try{
            System.out.println(calc.divide(0, 2));
            System.out.println(calc.multiply(-1111, 3));
        }
        catch(NumberOutOfRangeException | ArithmeticException e){
            System.err.println("Error: " + e.getMessage());
        }

    }
}
