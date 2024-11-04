package exercise6;

import exercise5.PhanSo;

public class Main {
    public static void main(String[] args) {
        DsPhanSo danhSach = new DsPhanSo();

        // Thêm phân số vào danh sách
        danhSach.add(new PhanSo(1, 2));
        danhSach.add(new PhanSo(3, 4));
        danhSach.add(new PhanSo(5, 6));

        // Hiển thị danh sách phân số
        System.out.println("Danh sách phân số:");
        danhSach.display();

        // Tính tổng các phân số
        PhanSo tong = danhSach.sumAllPhanSo();
        System.out.println("Tổng các phân số: " + tong);

        // Tìm phân số lớn nhất và nhỏ nhất
        PhanSo lonNhat = danhSach.findMax();
        PhanSo nhoNhat = danhSach.findMin();
        System.out.println("Phân số lớn nhất: " + lonNhat);
        System.out.println("Phân số nhỏ nhất: " + nhoNhat);

        // Sắp xếp danh sách phân số theo thứ tự tăng dần
        danhSach.arrangeList();
        System.out.println("Danh sách phân số sau khi sắp xếp tăng dần:");
        danhSach.display();

        // Xóa phân số
        danhSach.removeElement(1, 2);
        System.out.println("Danh sách sau khi xóa phân số 1/2:");
        danhSach.display();
    }
}
