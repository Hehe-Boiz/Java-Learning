package exercise2;

import java.time.LocalDate;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        ManagerGiangVien qlgv = new ManagerGiangVien();
        Scanner scanner = new Scanner(System.in);

        // Thêm một số giảng viên để test
        GiangVienCoHuu gvch1 = new GiangVienCoHuu("Nguyễn Văn A", LocalDate.parse("01/01/1980", Config.FORMATTER),
                "PGS", "Tiến sĩ", LocalDate.parse("01/01/2010", Config.FORMATTER), 5000000, 2.5);
        GiangVienThinhGiang gvtg1 = new GiangVienThinhGiang("Trần Thị B", LocalDate.parse("02/02/1985", Config.FORMATTER),
                "Không", "Thạc sĩ", LocalDate.parse("01/06/2015", Config.FORMATTER), "Đại học X");

        qlgv.addGiangVien(gvch1, gvtg1);

        // Nhập số giờ làm
        qlgv.nhapSoGioLam();

        // Hiển thị danh sách theo lương
        qlgv.displayAndTinhLuong();

        // Test tra cứu
        System.out.println("\nTra cứu theo tên 'Nguyễn':");
        qlgv.search("Nguyễn").forEach(h->System.out.println(h));;

        // Test xóa giảng viên
        qlgv.deleteGiangVien("Trần Thị B");

        scanner.close();
    }
}
