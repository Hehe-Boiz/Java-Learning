import java.math.BigDecimal;

public class Exercise8 {
    public static BigDecimal findMax(BigDecimal[] arr) {
        BigDecimal max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            // tra ve 0 neu 2 doi tuong bang nhau
            // gia tri duong neu doi tuong hien tai lon hon doi tuong duoc so sanh
            // gia tri am neu doi tuong hien tai nho hon doi tuong duoc so sanh
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        BigDecimal[] arr = {new BigDecimal("12.9"), new BigDecimal(3.5), new BigDecimal(5.6)};
        System.out.println("Maximum value: " + findMax(arr));
    }
}
