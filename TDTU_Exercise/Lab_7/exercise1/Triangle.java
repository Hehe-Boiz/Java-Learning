package exercise1;


public class Triangle extends Shape {
    private double base;
    private double height;
    
    public Triangle() {
    }

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }



    @Override
    public double getArea() {
        return height*base;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Triangle other = (Triangle) obj;
        if (base != other.base)
            return false;
        if (height != other.height)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Triangle [base=" + base + ", height=" + height + "]";
    }
}
