
public interface Shape {
    public void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

class ShapeFactory{
    public Shape getShape(String shapeType){
        if(shapeType == null){
            throw new IllegalArgumentException("Shape type cannot be null");
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")) return new Circle();
        else if(shapeType.equalsIgnoreCase("RECTANGLE")) return new Rectangle();
        else if (shapeType.equalsIgnoreCase("SQUARE")) return new Square();
        else throw new IllegalArgumentException("Unknown shape type: " + shapeType);
    }

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Kiểm thử các trường hợp hợp lệ
        try {
            System.out.println("Testing valid shapes:");

            // Tạo Circle
            Shape shape1 = shapeFactory.getShape("CIRCLE");
            shape1.draw();  // Kết quả: Drawing a Circle

            // Tạo Rectangle
            Shape shape2 = shapeFactory.getShape("RECTANGLE");
            shape2.draw();  // Kết quả: Drawing a Rectangle

            // Tạo Square
            Shape shape3 = shapeFactory.getShape("SQUARE");
            shape3.draw();  // Kết quả: Drawing a Square
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        // Kiểm thử trường hợp ném ngoại lệ
        try {
            System.out.println("\nTesting invalid shape:");

            // Cố gắng tạo một hình dạng không hợp lệ
            Shape shape4 = shapeFactory.getShape("TRIANGLE");  // Gây ra lỗi
            shape4.draw();
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an exception: " + e.getMessage());  // Kết quả: Unknown shape type: TRIANGLE
        }
    }
}