public class Rectangle{
    private float width;
    private float length;


    public Rectangle(){
        this.width = 1.0f;
        this.length = 1.0f;
    }

    public Rectangle(float width, float length){
        this.width = width;
        this.length= length;
    }

    public float getWidth(){
        return this.width;
    }

    public float getLenght(){
        return this.length;
    }

    public float getArea(){
        return this.length * this.width;
    }

    public float getPerimeter(){
        return (this.length + this.width)*2;
    }

    public void setWidth(float width){
        this.width = width;
    }

    public void setLength(float length){
        this.length = length;
    }

    @Override
    public String toString(){
        return "width: "+getWidth() + " Length: "+getLenght();
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setLength(10);
        rect.setWidth(20);
        System.out.println("Area: "+rect.getArea());
        System.out.println("Perimeter: "+rect.getPerimeter());
        System.out.println(rect.toString());
    }
}

