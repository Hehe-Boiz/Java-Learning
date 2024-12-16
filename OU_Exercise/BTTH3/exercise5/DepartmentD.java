package exercise5;

public class DepartmentD extends Employee{
    protected String department;
    protected double allowance;

    public DepartmentD(String cCCD, String name, String sex, int sDT, String hometown, String department, double allowance) {
        super(cCCD, name, sex, sDT, hometown);
        this.department = department;
        this.allowance = allowance;
    }

    @Override
    public double tinhLuong(int soNgayCong) {
        return BASE_SALARY * soNgayCong + this.allowance;
    }
}
