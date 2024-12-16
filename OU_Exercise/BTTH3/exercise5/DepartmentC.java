package exercise5;

public class DepartmentC extends Employee{
    protected String department;

    public DepartmentC(String cCCD, String name, String sex, int sDT, String hometown, String department) {
        super(cCCD, name, sex, sDT, hometown);
        this.department = department;
    }

    @Override
    public double tinhLuong(int soNgayCong) {
        return 2.5 * BASE_SALARY * soNgayCong;
    }
}
