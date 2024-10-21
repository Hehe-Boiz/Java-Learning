package exercise2;

public class ImageLoader {
    private static ImageLoader img = null;

    private ImageLoader(){
    }

    public static ImageLoader getInstance(){
        if(img == null){
            img = new ImageLoader();
        }
        return img;
    }

    public String loadImage(){
        return "Loaded Successfully";
    }

    public static void main(String[] args) {
        ImageLoader imageloader = ImageLoader.getInstance();
        System.out.println(imageloader.loadImage());
    }
}
