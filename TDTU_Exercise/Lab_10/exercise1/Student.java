package exercise1;

public class Student {
    private String name;
    private String address;
    private String sex;
    private double score;

    public Student(String name, String address, String sex, double score) {
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public static class StudentOperator{
        public void print(Student student){
            System.out.println("Student [" + student.getName() + ", " + student.getAddress() + ", " + student.getSex() + ", " + student.getScore() + "]");
        }

        public String type(Student student){
            if(student.getScore() > 8) return "A";
            else if(student.getScore() >= 5) return "B";
            else return "C";
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Nhut", "Tan Tuc", "Nam", 10);
        Student st2 = new Student("HeheBoiz", "TPHCM", "Nam", 9.9);
        // nếu main không trong cùng class thì phải Student.StudentOperator operator = new Student.StudentOperator(); 
        StudentOperator operator = new StudentOperator();

        operator.print(st1);
        operator.print(st2);
        System.out.println(operator.type(st1));
        System.out.println(operator.type(st2));
    }
    
}
