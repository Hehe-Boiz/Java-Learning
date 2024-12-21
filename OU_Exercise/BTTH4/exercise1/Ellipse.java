package exercise1;

public class Ellipse extends Hinh {
    private double trucLon;
    private double trucNho;

    public Ellipse(double lon, double nho, String name) {
        super(name);
        this.trucLon = lon;
        this.trucNho = nho;
    }

    public double getTrucLon() {
        return trucLon;
    }

    public void setTrucLon(double trucLon) {
        this.trucLon = trucLon;
    }

    public double getTrucNho() {
        return trucNho;
    }

    public void setTrucNho(double trucNho) {
        this.trucNho = trucNho;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * trucLon * trucNho;
    }

    @Override
    public double tinhChuVi() {
        return Math.PI * (3 * (trucLon + trucNho) - Math.sqrt((3 * trucLon + trucNho) * (trucLon + 3 * trucNho)));
    }

    @Override
    public String toString() {
        return String.format("%s - Trục lớn: %.1f - Trục nhỏ: %.1f", super.toString(), this.trucLon, this.trucNho);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(trucLon);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(trucNho);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Ellipse) {
            Ellipse h = (Ellipse) obj;

            return super.equals(obj) && Double.compare(this.trucNho, h.trucNho) == 0
                    && Double.compare(this.trucLon, h.trucLon) == 0;
        }
        return false;
    }

}
