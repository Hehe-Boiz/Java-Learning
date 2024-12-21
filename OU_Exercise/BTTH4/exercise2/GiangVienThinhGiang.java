package exercise2;

import java.time.LocalDate;

public class GiangVienThinhGiang extends GiangVien{
    private String local;

    public GiangVienThinhGiang(String name, LocalDate sinh, String hocHam, String hocVi, LocalDate startDate,
            String local) {
        super(name, sinh, hocHam, hocVi, startDate);
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public double tinhLuong() {
        return gio*90000;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "GiangVienThinhGiang: local=" + local ;
    }

    
}
