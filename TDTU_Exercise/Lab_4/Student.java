
public class Student{
    private int id;
    private String firstName;
    private String lastName;

    Student(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getID(){
        return this.id;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setID(int id){
        this.id = id;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getName(){
        return "Name: " + getLastName() +getFirstName();
    }

    @Override
    public String toString(){
        return  "Last name: "+getLastName() +" first name: "+getFirstName() ;
    }

    public static void main(String[] args) {
        Student student = new Student(123456, "Minh","Nhut");
        System.out.println(student.toString());
    }
}
