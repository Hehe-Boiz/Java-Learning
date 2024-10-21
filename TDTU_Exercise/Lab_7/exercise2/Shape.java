package exercise2;

public abstract class Shape{
    private String color;
    private boolean filled;
    
    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || this.getClass() != obj.getClass()) return false;
        if(obj instanceof Shape){
            Shape tmp = (Shape) obj;
            if(this.getArea() == tmp.getArea()){
                return true;
            }
        }
        return false;
    };

    public abstract  double getArea();

    public abstract double getPerimeter();

    public abstract String toString();
}