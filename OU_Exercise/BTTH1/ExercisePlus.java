public class ExercisePlus {
    public static void baiPlus(){
        String s= "abc123ncsd   0,fhjds 990";
        String news = s.replaceAll("[a-zA-Z,;\\s]+"," ");
        System.out.println(news);
        String[] a= news.trim().split("[\\s]+");
        int max = Integer.parseInt(a[0]);
        for(String i : a){
            System.out.println(i);
            if(max < Integer.parseInt(i)){
                max = Integer.parseInt(i);
            }
            
        }
        System.out.println("so lon nhat "+ max);
    }
}
