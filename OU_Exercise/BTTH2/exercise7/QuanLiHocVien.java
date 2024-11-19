package exercise7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
// import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
// import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuanLiHocVien {
    private static List<HocVien> list = new ArrayList<>();

    public void addHocVienTuFile(String fileName) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String hoTen, queQuan, ngaySinh, line;

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            hoTen = parts[0].trim();
            queQuan = parts[1].trim();
            ngaySinh = parts[2].trim();
            System.out.println("Ngày sinh đọc được: " + ngaySinh);
            list.add(new HocVien(hoTen, queQuan, ngaySinh));
        }
        reader.close();
    }

    public void nhapDiemHocVien(int maHV, float diemToan, float diemLy, float diemHoa) {
        for (HocVien hv : list) {
            if (hv.getMaHV() == maHV) {
                hv.setDiem(diemToan, diemLy, diemHoa);
                return;
            }
        }
        System.out.println("Không tìm thấy học viên với mã số " + maHV);
    }

    public void nhapDiemHocVien(int maHV){
        for(HocVien hv : list){
            if(hv.getMaHV() == maHV){
                double diemHoa = Config.sc.nextDouble();
                double diemLy = Config.sc.nextDouble();
                double diemToan = Config.sc.nextDouble();
                hv.setDiem(diemToan, diemLy, diemHoa);
                return;
            }
        }
        System.out.println("Không tìm thấy học viên với mã số " + maHV);
    }

    public void hienThiDanhSachHocVien() {
        list.forEach(h -> System.out.println(h.toString()));
    }

    public void findHocVien(String keyword) {
        for (HocVien hv : list) {
            if (String.valueOf(hv.getMaHV()).equals(keyword) || hv.getHoTen().contains(keyword)
                    || hv.getQueQuan().contains(keyword)) {
                System.out.println(hv);
            }
        }
    }

    public HocVien findHocVienOptimize(int maHV) {
        return list.stream().filter(h -> h.getMaHV() == maHV).findFirst().get();
    }

    public List<HocVien> findHocVienOptimize(String kw) {
        return list.stream().filter(h -> h.getHoTen().contains(kw)).collect(Collectors.toList());
    }

    public void sortTheoDiem() {
        Collections.sort(list, new Comparator<HocVien>() {
            @Override
            public int compare(HocVien acc1, HocVien acc2) {
                return Double.compare(acc1.tinhDiemTrungBinh(), acc2.tinhDiemTrungBinh());
            }
        });
    }

    public void xacDinhHocVienTot(String fileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        for (HocVien hv : list) {
            if (hv.isScholarship()) {
                double dtb = hv.tinhDiemTrungBinh();
                writer.write(String.format("%d - %s - %.2f%n", hv.getMaHV(), hv.getHoTen(), dtb));
            }
        }
        writer.close();
    }

    public List<HocVien> findHocVienOptimize(){
        return list.stream().filter(h -> h.isScholarship()).collect(Collectors.toList());
    }

    public void xuatHb(String path) throws FileNotFoundException{
        File f = new File(path);

        try (PrintWriter w = new PrintWriter(f)){
            List<HocVien> hb = this.findHocVienOptimize();
            hb.forEach(h -> w.printf("%s - %.1f\n",h.getHoTen(), h.tinhDiemTrungBinh()));
        }
    }

    public void thongKeDoTuoi() {

        int duoi18 = 0, tu18den23 = 0, tren24 = 0;

        for (HocVien hv : list) {
            LocalDate ngaySinh = hv.getNgaySinh();
            int tuoi = Period.between(ngaySinh, LocalDate.now()).getYears();

            if (tuoi < 18)
                duoi18++;
            else if (tuoi <= 23)
                tu18den23++;
            else
                tren24++;
        }

        System.out.println("Thống kê độ tuổi:");
        System.out.println("Dưới 18: " + duoi18);
        System.out.println("Từ 18 đến 23: " + tu18den23);
        System.out.println("Trên 24: " + tren24);
    }

    public long countNhoHon18(){
        return list.stream().filter(h -> h.isNhoHon18()).count();
    }

    public void addHocVien(HocVien... a) {
        list.addAll(Arrays.asList(a));
    }

    // sửa lại cho giống thầy
    public void addHocVienTuFileScanner(String fileName) throws IOException {
        Scanner scanner = new Scanner(new File(fileName));
        String hoTen, queQuan, ngaySinh;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            hoTen = parts[0].trim();
            queQuan = parts[1].trim();
            ngaySinh = parts[2].trim();
            System.out.println("Ngày sinh đọc được: " + ngaySinh);
            list.add(new HocVien(hoTen, queQuan, ngaySinh));
        }
        scanner.close();
    }
}