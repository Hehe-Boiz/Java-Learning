package exercise7;

import java.time.LocalDate;
// import java.util.Date;
import java.util.stream.DoubleStream;

public class HocVien {
    private static int dem = 0;
    private int maHV;
    private String hoTen;
    private String queQuan;
    private LocalDate ngaySinh;
    private Double diemToan;
    private Double diemLy;
    private Double diemHoa;

    {
        dem++;
        this.maHV = dem;
    }

    public HocVien(String hoTen, String queQuan, LocalDate ngaySinh) {
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
        this.diemToan = null;
        this.diemLy = null;
        this.diemHoa = null;
    }

    public HocVien(String hoTen, String queQuan, String ngaySinh) {
        this(hoTen, queQuan, LocalDate.parse(ngaySinh, Config.FORMATTER));
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

    public LocalDate getNgaySinh() {
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

    public double tinhDiemTrungBinhOptimize() {
        if (diemToan != null && diemLy != null && diemHoa != null) {
            return DoubleStream.of(diemHoa, diemLy, diemToan).average().getAsDouble();
        }
        return 0;
    }

    public boolean isScholarship() {
        return tinhDiemTrungBinh() >= 8.0 && diemToan >= 5 && diemLy >= 5 && diemHoa >= 5;
    }
    public boolean isNhoHon18(){
        return this.ngaySinh.plusYears(18).compareTo(LocalDate.now()) > 0;
    }

    @Override
    public String toString() {
        String ngaySinhStr = Config.FORMATTER.format(ngaySinh);
        return "MaHV: " + maHV + " - Ho Ten: " + hoTen + " - Que Quan: " + queQuan + " - Ngay Sinh: " + ngaySinhStr
                + " - Diem Toan: " + diemToan + " - Diem Ly: " + diemLy + " - Diem Hoa: " + diemHoa;
    }
}