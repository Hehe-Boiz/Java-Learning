package exercise1;

public class Employee extends Person{
    private String id;
    private double salary;

    public Employee(){

    }
    public Employee(String id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    public Employee(String name, int birthYear, String id, double salary) {
        super(name, birthYear);
        this.id = id;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", salary=" + salary +
                '}';
    }
}