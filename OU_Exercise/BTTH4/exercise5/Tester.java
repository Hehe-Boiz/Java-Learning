package exercise5;

public class Tester {
    public static void main(String[] args) {
        // Tạo đối tượng cho cả hai loại translator
        NumberTranslator englishTranslator = new EnglishTranslator();
        NumberTranslator vietnameseTranslator = new VietnameseTranslator();
        
        System.out.println("===== Kiểm tra English Translator =====");
        // Kiểm tra chuyển số sang chữ
        System.out.println("Số sang chữ:");
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " -> " + englishTranslator.getString(i));
        }
        
        // Kiểm tra chuyển chữ sang số
        System.out.println("\nChữ sang số:");
        String[] englishTests = {"one", "three", "five"};
        for (String test : englishTests) {
            System.out.println(test + " -> " + englishTranslator.getNumber(test));
        }
        
        System.out.println("\n===== Kiểm tra Vietnamese Translator =====");
        // Kiểm tra chuyển số sang chữ
        System.out.println("Số sang chữ:");
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " -> " + vietnameseTranslator.getString(i));
        }
        
        // Kiểm tra chuyển chữ sang số
        System.out.println("\nChữ sang số:");
        String[] vietnameseTests = {"một", "ba", "năm"};
        for (String test : vietnameseTests) {
            System.out.println(test + " -> " + vietnameseTranslator.getNumber(test));
        }
    }
}
