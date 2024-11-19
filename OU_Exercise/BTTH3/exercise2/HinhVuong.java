package exercise2;

public class HinhVuong extends HinhChuNhat{
    public HinhVuong(double canh){
        super(canh, canh);
    }

    @Override
    public String toString() {
        return "HinhVuong [chieuDai=" + this.getChieuDai() + ", chieuRong=" + this.getChieuRong() + "]";
    }
}
