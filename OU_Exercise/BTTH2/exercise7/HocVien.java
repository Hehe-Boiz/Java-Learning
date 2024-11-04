package exercise7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HocVien {
    private static int dem = 0;
    private int maHV;
    private String hoTen;
    private String queQuan;
    private Date ngaySinh;
    private Double diemToan;
    private Double diemLy;
    private Double diemHoa;

    {
        dem++;
        this.maHV = dem;
    }

    public HocVien(String hoTen, String queQuan, String ngaySinh) throws ParseException {
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.diemToan = null;
        this.diemLy = null;
        this.diemHoa = null;
    }

    public int getMaHV() {
        return maHV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setDiem(double diemToan, double diemLy, double diemHoa) {
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public double tinhDiemTrungBinh() {
        if (diemToan != null && diemLy != null && diemHoa != null) {
            return (diemToan + diemLy + diemHoa) / 3;
        }
        return 0.0;
    }

    public boolean isScholarship() {
        return tinhDiemTrungBinh() >= 8.0 && diemToan >= 5 && diemLy >= 5 && diemHoa >= 5;
    }

    @Override
    public String toString() {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        String ngaySinhStr = f.format(ngaySinh);
        return "MaHV: " + maHV + " - Ho Ten: " + hoTen + " - Que Quan: " + queQuan + " - Ngay Sinh: " + ngaySinhStr
                + " - Diem Toan: " + diemToan + " - Diem Ly: " + diemLy + " - Diem Hoa: " + diemHoa;
    }
}
