package exercise7;

import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        // Khởi tạo đối tượng QuanLiHocVien
        QuanLiHocVien quanLiHocVien = new QuanLiHocVien();

        // Thêm học viên vào danh sách
        HocVien hv1 = new HocVien("Nguyen Thi Lan", "Ha Noi", LocalDate.of(2002, 5, 15));
        hv1.setDiem(8.5, 7.0, 9.0);

        HocVien hv2 = new HocVien("Tran Minh Tu", "Hai Duong", LocalDate.of(2003, 3, 20));
        hv2.setDiem(6.5, 7.5, 8.0);

        HocVien hv3 = new HocVien("Le Thi Mai", "Da Nang", LocalDate.of(2001, 12, 10));
        hv3.setDiem(5.0, 5.5, 6.0);

        quanLiHocVien.addHocVien(hv1, hv2, hv3);

        // Hiển thị danh sách học viên
        System.out.println("Danh sách học viên:");
        quanLiHocVien.hienThiDanhSachHocVien();

        // Nhập điểm cho học viên
        quanLiHocVien.nhapDiemHocVien(2, 8.0f, 7.5f, 7.0f);

        // Hiển thị danh sách học viên sau khi nhập điểm
        System.out.println("\nDanh sách học viên sau khi nhập điểm:");
        quanLiHocVien.hienThiDanhSachHocVien();

        // Sắp xếp học viên theo điểm trung bình
        quanLiHocVien.sortTheoDiem();
        System.out.println("\nDanh sách học viên sau khi sắp xếp theo điểm trung bình:");
        quanLiHocVien.hienThiDanhSachHocVien();

        // Thống kê độ tuổi học viên
        quanLiHocVien.thongKeDoTuoi();
        quanLiHocVien.addHocVienTuFile("OU_Exercise/BTTH2/exercise7/DanhSachSinhVien.txt");
        quanLiHocVien.hienThiDanhSachHocVien();
        quanLiHocVien.nhapDiemHocVien(19, 10, 10, 10);

        // Tìm kiếm học viên theo tên
        System.out.println("\nTìm kiếm học viên theo từ khóa 'Lan':");
        quanLiHocVien.timKiemHocVien("Lan");

        // Ghi danh sách học viên đủ học bổng vào file
        quanLiHocVien.xacDinhHocVienTot("OU_Exercise/BTTH2/exercise7/hocvien_hocbong.txt");
    }
}