package exercise2;

import java.time.LocalDate;

public abstract class GiangVien{
    private String name;
    private LocalDate sinh;
    private String hocHam;
    private String hocVi;
    private LocalDate startDate;
    protected double gio;

    public GiangVien(String name, LocalDate sinh, String hocHam, String hocVi, LocalDate startDate) {
        this.name = name;
        this.sinh = sinh;
        this.hocHam = hocHam;
        this.hocVi = hocVi;
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getSinh() {
        return sinh;
    }

    public void setSinh(LocalDate sinh) {
        this.sinh = sinh;
    }

    public String getHocVi() {
        return hocVi;
    }

    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getHocHam() {
        return hocHam;
    }

    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    public abstract double tinhLuong();

    @Override
    public String toString() {
        return "name: " + name + ", sinh=" + sinh + ", hocHam=" + hocHam + ", hocVi=" + hocVi + ", startDate="
                + startDate;
    }

    public void setSoGio(double soGio) {
        this.gio = soGio;
    }

    
}
