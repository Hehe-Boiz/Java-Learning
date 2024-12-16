package exercise5;

public class DepartmentA extends Employee{
    protected String department;

    public DepartmentA(String cCCD, String name, String sex, int sDT, String hometown, String department) {
        super(cCCD, name, sex, sDT, hometown);
        this.department = department;
    }

    @Override
    public double tinhLuong(int soNgayCong) {
        return 1.2 * BASE_SALARY * soNgayCong;
    }
}
