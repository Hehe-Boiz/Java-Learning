package exercise3;

import exercise1.Diem;

public class Main {
    public static void main(String[] args) {
        // Tạo hai điểm p1 và p2
        Diem p1 = new Diem(1, 2); // Giả sử Diem có constructor Diem(int x, int y)
        Diem p2 = new Diem(4, 5); // Tạo điểm thứ hai

        // Khởi tạo hình chữ nhật
        HinhChuNhat hinhChuNhat = new HinhChuNhat(p1, p2);

        // In thông tin hình chữ nhật
        System.out.println(hinhChuNhat.toString());
    }
}
