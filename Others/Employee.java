package Others;

import java.util.List;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    private List<String> projects;

    public Employee(String firstName, String lastName, double salary, List<String> project) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.projects = project;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public List<String> getProject() {
        return projects;
    }
    public void setProject(List<String> project) {
        this.projects = project;
    }

    @Override
    public String toString() {
        return "Employee {"+
                "firstName= '" + firstName+'\''+
                ", lastName='"+lastName+'\''+
                ", salary="+salary+
                ", projects="+projects+
                '}';
    }

    
}
