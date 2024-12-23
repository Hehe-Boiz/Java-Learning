package OU_Exercise.MidTerm.BaiThayDat;

public class Tester {
    public static void main(String[] args) {
        QLKH ql = new QLKH("OU_Exercise/MidTerm/BaiThayDat/DeBai/KhachHang.txt");

        System.out.println("Danh sách khách hàng:");
        ql.getList().forEach(kh -> System.out.println(kh));

        System.out.println("\nTìm kiếm khách hàng có họ 'Nguyen':");
        ql.searchName("Nguyen");

        System.out.println("Danh sách sau khi sort: ");
        ql.sort();
        ql.getList().forEach(kh -> System.out.println(kh));

        ql.inputFileTop10();
        System.out.println("\nĐã ghi top 10 khách hàng vào file Top10.txt");
    }
}
