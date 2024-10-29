package exercise2;
import exercise1.*;

public class DoanThang {
    Diem p1;
    Diem p2;
    
    public DoanThang(Diem p1, Diem p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

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

    @Override
    public String toString() {
        return "DoanThang [("+p1.getX()+","+p1.getY()+")"+"("+p1.getX()+","+p1.getY()+")]";
    }

    public int calculateDistanceTo() {
        return (int) Math.round(Math.sqrt(Math.pow((this.p1.getX() - this.p2.getX()), 2) + Math.pow((this.p1.getY() - this.p2.getY()), 2)));
    }

    public Diem calculateMidpoint() {
        double midX = (this.p1.getX() + this.p2.getX()) / 2;
        double midY = (this.p1.getY() + this.p2.getY()) / 2;
        return new Diem(midX, midY);
    }

    public boolean isParallel(DoanThang other){
        double ab = (this.p1.getX() - this.p2.getX()) / (this.p1.getY() - this.p2.getY());
        double cd = (other.p1.getX() - other.p2.getX()) / (other.p1.getY() - other.p2.getY());

        return ab == cd;
    }
}
