package exercise2;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side,String color,boolean filled){
        super(color,filled, side,side);
    }

    // getter and setter
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    
    @Override
    public void setLength(double length) {
        super.setLength(length);
    }
    
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }
}
