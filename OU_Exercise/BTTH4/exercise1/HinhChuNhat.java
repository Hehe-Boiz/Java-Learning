package exercise1;

public class HinhChuNhat extends Hinh {
    protected double chieuDai;
    protected double chieuRong;

    public HinhChuNhat(double dai, double rong, String name) {
        super(name);
        this.chieuDai = dai;
        this.chieuRong = rong;
    }

    @Override
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    @Override
    public double tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    @Override
    public String toString() {
        return String.format("%s - Chiều dài: %.1f - Chiều rộng: %.1f", super.toString(), this.chieuDai,
                this.chieuRong);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(chieuDai);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(chieuRong);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof HinhChuNhat) {
            HinhChuNhat h = (HinhChuNhat) obj;
            return super.equals(obj) && Double.compare(this.chieuDai, h.chieuDai) == 0 &&
                    Double.compare(this.chieuRong, h.chieuRong) == 0;
        }
        return false;
    }

}
