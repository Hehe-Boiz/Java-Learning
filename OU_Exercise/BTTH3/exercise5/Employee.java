package exercise5;

public abstract class Employee {
    private static int count = 0;
    protected int id;
    protected String CCCD;
    protected String name;
    protected String sex;
    protected int SDT;
    protected String hometown;
    protected static final double BASE_SALARY = 100000;

    {
        id = count++;
    }

    public Employee(String cCCD, String name, String sex, int sDT, String hometown) {
        CCCD = cCCD;
        this.name = name;
        this.sex = sex;
        SDT = sDT;
        this.hometown = hometown;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String cCCD) {
        CCCD = cCCD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int sDT) {
        SDT = sDT;
    }

    public double calculateSalary(int workingDays) {
        double salary = BASE_SALARY * workingDays;
        return salary;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", CCCD=" + CCCD + ", name=" + name + ", sex=" + sex + ", SDT=" + SDT + "]";
    }

    public abstract double tinhLuong(int soNgayCong);
}
