
public class MyString1 {

    //1a
    public static String shortName(String str){
        String[] words = str.split("\\s+");
        return words[words.length-1] + " " + words[0];
    }

    //1b
    public static String hashtagName(String str){
        String[] words = str.split("\\s+");
        return "#" + words[words.length-1] + words[0];
    }

    //1c
    public static String upperCaseAllVowel(String str){
        String vowel = "ueoai";
        StringBuilder newStr = new StringBuilder();

        for(int i = 0;i<str.length();i++){
            char c= str.charAt(i);
            if(vowel.contains(String.valueOf(c))){
                newStr.append(Character.toUpperCase(c));
            }
            else {
                newStr.append(c);
            }
        }
        return newStr.toString();
    }

    //1d
    public static String upperCaseAllN(String str){
        return str.replaceAll("n","N");
    }

    public static void main(String[] args) {
        String str = "Le Minh Nhut";
        System.out.println("Short name: " + shortName(str));
        System.out.println("Hashtag name: "+hashtagName(str));
        System.out.println("Upper case the vowel: "+upperCaseAllVowel(str));
        System.out.println("Upper case letter n: "+ upperCaseAllN(str));

    }
}
