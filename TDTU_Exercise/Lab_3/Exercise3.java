
public class Exercise3 {
    public static String getLastNameandFirstName(String fullname){
        String [] name = fullname.split(" ");
        String lastName = name[name.length-1];
        String firstName = name[0];
        return firstName + " "+ lastName;

    }
    public static String getMiddleName(String fullname){
        String[] name= fullname.split(" ");
        String middleName ="";
        for(int i=1;i<name.length-1;i++){
            middleName+=name[i];
            if(i<name.length-2){
                middleName+=" ";
            }
        }
        return middleName;
    }
    public static String CapitalizeNamea(String fullname){
        String[] name = fullname.split(" ");
        String CapitalizeName ="";
        for(int i=0;i<name.length;i++){
            CapitalizeName+=name[i].substring(0,1).toUpperCase()+name[i].substring(1).toLowerCase()+" ";
        }
        return CapitalizeName;
    }
    public static String CapitalizeNameb(String fullname){
        String[] name = fullname.split(" ");
        for(int i=0;i<name.length;i++){
            name[i] = name[i].substring(0,1).toUpperCase()+name[i].substring(1).toLowerCase();
        }
        String CapitalizeName = String.join(" ", fullname);
        return CapitalizeName;
    }
    public static String upperCaseVowel(String fullname){
        char[] string = new char[fullname.length()];
        String CharVowel ="aoeui";
        for(int i=0;i<fullname.length();i++){
            char c = fullname.charAt(i);
            if(Character.isLetter(c)){
                if(CharVowel.contains(String.valueOf(c))){
                    string[i]=Character.toUpperCase(c);
                }
                else{
                    string[i]=Character.toLowerCase(c);
                }
            }
            else{
                string[i] = c;
            }
        }
        return String.valueOf(string);
    }
    public static void main(String[] args) {
        String fullname ="Le Minh Nhut";

        //3a
        System.out.println("Full name: "+fullname);
        String LastandFirst = getLastNameandFirstName(fullname);
        System.out.println("Last name and First name: "+LastandFirst);
        //3b
        String middleName = getMiddleName(fullname);
        System.out.println("Middle name: "+middleName);
        //3c cach 1
        fullname.toLowerCase();
        String Capitalizea = CapitalizeNamea(fullname);
        System.out.println("Capitalize name cach 1: "+Capitalizea);
        //3c cach 2
        fullname.toLowerCase();
        String Capitalizeb = CapitalizeNameb(fullname);
        System.out.println("Capitalize name cach 2: "+Capitalizeb);
        //3d
        fullname.toLowerCase();
        String vowel = upperCaseVowel(fullname);
        System.out.println("Uppercase vowel: "+vowel);
    }
}
