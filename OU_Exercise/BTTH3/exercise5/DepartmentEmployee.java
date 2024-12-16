package exercise5;

import java.util.Scanner;

public class DepartmentEmployee extends Employee{
    private Scanner sc = new Scanner(System.in);
    private String department;

    public DepartmentEmployee(String cCCD, String name, String sex, int sDT, String department, String hometown) {
        super(cCCD, name, sex, sDT, hometown);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double calculateSalary(int workingDays) {
        double salary = BASE_SALARY * workingDays;

        switch (getDepartment()) {
            case "A":
                salary *= 1.2;
                break;
            case "B":
                salary *= 1.5;
                break;
            case "C":
                salary *= 2.5;
                break;
            case "D":
                System.out.println("Mời bạn nhập phụ cấp: ");
                double allowance = Integer.parseInt(sc.nextLine());
                salary += allowance;
                break;
            default:
                salary = 0;
                break;
        }

        return salary;
    }
}

