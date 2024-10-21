public class MyString2 {

    // 2a
    public static int countWords(String paragraph) {
        String[] words = paragraph.split(" ");
        return words.length;
    }

    // 2b
    public static int countSentences(String paragraph) {
        // String[] words = paragraph.split("\\.");
        // return words.length;

        int count = 0;
        for(int i = 0; i < paragraph.length(); i++){
            if(paragraph.charAt(i) == '.') count++;
        }
        return count;
    }

    // 2c
    public static int countAppear(String paragraph, String word) {
        int count = 0;
        String[] words = paragraph.split(" ");
        for (String w : words) {
            if (w.equals(word))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String paragraph = "The Edge Surf is of course also a whole lot better, which will hopefully win Microsoft some converts. It offers time trial, support for other input methods like touch and gamepads, accessibility improvements, high scores, and remastered visuals.";

        System.out.println("Number of Words: " + countWords(paragraph));
        System.out.println("Number of Sentences: " + countSentences(paragraph));
        String word = "and";
        System.out.println("The number of '" + word + "': " + countAppear(paragraph, word));
    }
}
