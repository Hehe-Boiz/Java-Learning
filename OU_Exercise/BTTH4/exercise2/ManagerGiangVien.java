package exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManagerGiangVien {
    private static List<GiangVien> list = new ArrayList<>();
    private Scanner sc= new Scanner(System.in);

    public void addGiangVien(GiangVien... a) {
        list.addAll(Arrays.asList(a));
    }

    public boolean deleteGiangVien(String name) {
        return list.removeIf(gv -> gv.getName().equalsIgnoreCase(name));
    }

    public List<GiangVien> search(String keyWord) {
        return list.stream().filter(
                h -> h.getHocHam().equals(keyWord) || h.getHocVi().equals(keyWord) || h.getName().toLowerCase().contains(keyWord.toLowerCase()))
                .collect(Collectors.toList());
    }

    public void nhapSoGioLam() {
        for (GiangVien gv : list) {
            System.out.print("Nhập số giờ làm cho giảng viên " + gv.getName() + ": ");
            double soGio = Double.parseDouble(sc.nextLine());
            gv.setSoGio(soGio);
        }
    }

    public void displayAndTinhLuong(){
        List<GiangVien> listDum = new ArrayList<>(list);

        listDum.sort((gv1, gv2) -> Double.compare(gv2.tinhLuong(), gv1.tinhLuong()));
        System.out.println("\nDanh sách giảng viên theo lương giảm dần:");
        for (GiangVien gv : listDum) {
            System.out.println(gv.toString());
            System.out.println("Lương: " + String.format("%,.0f", gv.tinhLuong()) + " VNĐ");
            System.out.println("------------------------");
        }
    }
}
