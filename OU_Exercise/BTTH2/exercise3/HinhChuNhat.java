package exercise3;
import exercise1.*;

public class HinhChuNhat {
    private Diem p1;
    private Diem p2;

    public Diem getP1() {
        return p1;
    }

    public void setP1(Diem p1) {
        this.p1 = p1;
    }

    public Diem getP2() {
        return p2;
    }
    
    public void setP2(Diem p2) {
        this.p2 = p2;
    }

    public HinhChuNhat(Diem p1, Diem p2) throws Exception {
        if(p1.getX() <= p2.getX() && p1.getY() >= p2.getY()){
            this.p1 = p1;
            this.p2 = p2;
        }
        else throw new Exception("Giá trị không hợp lệ.");
    }

    public double perimeterRectangle(){
        double wide = Math.abs(this.p1.getY() - this.p2.getY());
        double length = Math.abs(this.p1.getX() - this.p2.getX());

        return (wide + length) *2;
    }

    public double areaRectangle(){
        double wide = Math.abs(this.p1.getY() - this.p2.getY());
        double length = Math.abs(this.p1.getX() - this.p2.getX());

        return wide*length;
    }

    @Override
    public String toString() {
        return "HinhChuNhat [p1=" + p1 + ", p2=" + p2 + ", Perimeter=" + perimeterRectangle()
                + ", Area=" + areaRectangle() + "]";
    }

    
}
