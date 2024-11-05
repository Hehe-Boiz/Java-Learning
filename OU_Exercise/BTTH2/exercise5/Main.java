package exercise5;


public class Main {
    public static void main(String[] args) {
        PhanSo[] mangPhanSo = {
            new PhanSo(-2, -4),
            new PhanSo(3, 4),
            new PhanSo(5, 6),
            new PhanSo(-4,-5),
            new PhanSo(-2,-3)
        };

        // Hiển thị các phân số trong mảng
        System.out.println("Các phân số trong mảng:");
        for (PhanSo ps : mangPhanSo) {
            ps.display();
        }

        // Tính tổng các phân số trong mảng
        PhanSo tong = new PhanSo(0, 1);
        for (PhanSo ps : mangPhanSo) {
            tong = tong.add(ps);
        }
        System.out.print("Tổng các phân số: ");
        tong.display();

        // Tìm phân số lớn nhất trong mảng
        PhanSo max = mangPhanSo[0];
        for (PhanSo ps : mangPhanSo) {
            if (ps.comparePhanSo(max) > 0) {
                max = ps;
            }
        }
        System.out.print("Phân số lớn nhất: ");
        max.display();

        for (int i = 1; i < mangPhanSo.length ; i ++){
            PhanSo x = mangPhanSo[i];
            int j = i-1;
            while(j >= 0 && mangPhanSo[j].comparePhanSo(x) < 0){
                mangPhanSo[j+1] = mangPhanSo[j];
                j--;
            }
            mangPhanSo[j+1] = x;
        }

        for(PhanSo ps : mangPhanSo){
            ps.display();
        }
    }
}
