package exercise5;

public class VietnameseTranslator implements NumberTranslator{
    private final String[] numbers = {
        "không", "một", "hai", "ba", "bốn", 
        "năm", "sáu", "bảy", "tám", "chín"
    };
    
    @Override
    public String getString(int number) {
        if (number >= 0 && number <= 9) {
            return numbers[number];
        }
        return "ngoài phạm vi";
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
