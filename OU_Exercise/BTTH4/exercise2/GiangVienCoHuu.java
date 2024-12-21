package exercise2;

import java.time.LocalDate;

public class GiangVienCoHuu extends GiangVien {
    private double salary;
    private double coefficient;
    
    public GiangVienCoHuu(String name, LocalDate sinh, String hocHam, String hocVi, LocalDate startDate, double salary,
            double coefficient) {
        super(name, sinh, hocHam, hocVi, startDate);
        this.salary = salary;
        this.coefficient = coefficient;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    @Override
    public double tinhLuong() {
        return gio*90000 + this.salary*this.coefficient;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "GiangVienCoHuu: salary=" + salary + ", coefficient=" + coefficient;
    }

    
}
