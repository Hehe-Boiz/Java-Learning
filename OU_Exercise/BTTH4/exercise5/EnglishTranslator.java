package exercise5;

public class EnglishTranslator implements NumberTranslator{
    private final String[] numbers = {
        "zero", "one", "two", "three", "four", 
        "five", "six", "seven", "eight", "nine"
    };
    
    @Override
    public String getString(int number) {
        if (number >= 0 && number <= 9) {
            return numbers[number];
        }
        return "out of range";
    }
    
    @Override
    public int getNumber(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].equals(str)) {
                return i;
            }
        }
        return -1; // Không tìm thấy
    }
}
