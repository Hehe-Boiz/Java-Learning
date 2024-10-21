class Manager extends Employee{
    private String position;
    private String department;
    private double salaryCoefficientPosition;

    public Manager(){
        super();
        super.setCoefficientsSalary(5.0);
    }

    public Manager(String ID, String fullName, double coefficientsSalary, String position, double salaryCoefficientPosition){
        super(ID, fullName, coefficientsSalary);
        this.position = position;
        this.salaryCoefficientPosition = salaryCoefficientPosition;
    }

    public Manager(String ID, String fullName, int yearJoined, double coefficientsSalary, int numDaysOff,
            String position, String department, double salaryCoefficientPosition) {
        super(ID, fullName, coefficientsSalary, yearJoined, numDaysOff);
        this.position = position;
        this.department = department;
        this.salaryCoefficientPosition = salaryCoefficientPosition;
    }

    public String getPosition(){
        return this.position;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public String getDepartment(){
        return this.department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public double getSalaryCoefficientPosition(){
        return this.salaryCoefficientPosition;
    }

    public void setSalaryCoefficientPosition(double salaryCoefficientPosition){
        this.salaryCoefficientPosition = salaryCoefficientPosition;
    }

    @Override
    public  String  considerEmulation(){
        return "A";
    }

    public double bonusByPosition(){
        return getBasicSalary()*salaryCoefficientPosition;
    }

    @Override
    public double getSalary(){
        return getBasicSalary()*getCoefficientsSalary()*getCoefficientsEmulation()*bonusByPosition();
    }
}


public class Exercise6 {
    public static void main(String[] args) {
        Employee employee = new Employee("2351050128","Le Minh Nhut",2,2005,2);
        Manager manager = new Manager("251050128","Le Minh Nhut",2,2000,2,"CEO","AI Engineer",10);
        System.out.println(employee);
        System.out.println(employee.getSalary());
        System.out.println(employee.getSenioritySalary());
        System.out.println(employee.getCoefficientsEmulation());
        System.out.println(manager);
        System.out.println(manager.getSalary());
    }
}
