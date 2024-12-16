package exercise5;

public class DepartmentB extends Employee{
    protected String department;

    public DepartmentB(String cCCD, String name, String sex, int sDT, String hometown, String department) {
        super(cCCD, name, sex, sDT, hometown);
        this.department = department;
    }

    @Override
    public double tinhLuong(int soNgayCong) {
        return 1.5 * BASE_SALARY * soNgayCong;
    }
}
