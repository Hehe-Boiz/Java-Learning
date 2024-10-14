
// ràng buộc T là lớp Number hoặc là lớp con của Number
public class BoundedBox <T extends Number> {
    private T width;
    private T height;
    
    public BoundedBox(T width, T height) {
        this.width = width;
        this.height = height;
    }
    
    public T getWidth() {
        return width;
    }

    public void setWidth(T width) {
        this.width = width;
    }

    public T getHeight() {
        return height;
    }

    public void setHeight(T height) {
        this.height = height;
    }

    public double calculateArea() {
        return  width.doubleValue() * height.doubleValue(); 
    }

    public static void main(String[] args) {
        BoundedBox<Integer> box1 = new BoundedBox<>(5, 10);
        System.out.println("Area box1: " + box1.calculateArea());

        BoundedBox<Double> box2 = new BoundedBox<>(5.5, 10.2);
        System.out.println("Area box2: " + box2.calculateArea());
    }
}
