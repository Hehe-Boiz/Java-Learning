package exercise1;

public class Ellipse {
    private double bkTrucLon;
    private double bkTrucNho;

    public Ellipse(double bkTrucLon, double bkTrucNho) {
        this.bkTrucLon = bkTrucLon;
        this.bkTrucNho = bkTrucNho;
    }

    public double getBkTrucLon() {
        return bkTrucLon;
    }
    public void setBkTrucLon(double bkTrucLon) {
        this.bkTrucLon = bkTrucLon;
    }
    public double getBkTrucNho() {
        return bkTrucNho;
    }
    public void setBkTrucNho(double bkTrucNho) {
        this.bkTrucNho = bkTrucNho;
    }

    public double tinhDienTich(){
        return Math.PI*bkTrucLon*bkTrucNho;
    }

    public double tinhChuVi(){
        return 2*Math.PI*Math.sqrt((Math.pow(bkTrucLon,2)+ Math.pow(bkTrucNho,2))/2);
    }

    @Override
    public String toString() {
        return "Hinh Ellipse\nDien tich: "+ tinhDienTich() +"\nChu vi: "+tinhChuVi()+"\n";
    }
}
