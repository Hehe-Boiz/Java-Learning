package exercise5;

import java.util.HashMap;

public class Exercise5 {
    public static boolean checkWordExist(HashMap<String, String> dictionary, String word){
        return dictionary.containsKey(word);
    }

    public static String findMean(HashMap<String, String> dictionary, String word){
        return (dictionary.containsKey(word)) ? word + ":" + dictionary.get(word) : word+ " does not exist in dictionary";
    }

    public static void main(String[] args) {
        HashMap<String,String> dictionary = new HashMap<>(10);
        dictionary.put("hello","Xin chào");
        dictionary.put("goodbye","Tạm biệt");
        dictionary.put("thank you","Cảm ơn");
        dictionary.put("please","Xin vui lòng");
        dictionary.put("sorry","Xin lỗi");
        dictionary.put("yes","Có");
        dictionary.put("no","Không");
        dictionary.put("help","Giúp đỡ");
        dictionary.put("eat","Ăn");
        dictionary.put("drink","Uống");

        System.out.println("Enter a word:");
        String word = "hello";
        System.out.println(findMean(dictionary,word));
        System.out.println("Enter a word:");
        word = "goodbye";
        System.out.println(findMean(dictionary,word));
        System.out.println("Enter a word:");
        word = "morning";
        System.out.println(findMean(dictionary, word));
    }
}
