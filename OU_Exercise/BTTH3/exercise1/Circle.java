package exercise1;

public class Circle extends Ellipse {
    public Circle(double bk) {
        super(bk,bk);
    }
    
    @Override
    public String toString() {
        return "Hinh Circle\nDien tich: "+ tinhDienTich() +"\nChu vi: "+tinhChuVi()+"\n";
    }
}
