package NestedClass;

public class Calculator {
    public void calculate(int a, int b, String operation) {
        class Operation {
            public int execute() {
                if (operation.equals("add")) {
                    return a + b;
                } else if (operation.equals("subtract")) {
                    return a - b;
                } else {
                    throw new IllegalArgumentException("Operation không hợp lệ");
                }
            }
        }
        Operation op = new Operation();
        int result = op.execute();
        System.out.println("Kết quả: " + result);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.calculate(10, 5, "add");      
        calc.calculate(10, 5, "subtract"); 
    }
}
