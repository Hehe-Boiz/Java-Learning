package exercise1;

import java.util.ArrayList;

public class PersonModel <T>{
    private ArrayList<T> a1 = new ArrayList<>();

    public void add(T obj){
        a1.add(obj);
    }

    public void display(){
        for(T obj : a1){
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        PersonModel<Student> pm1 = new PersonModel<>();
        Student st1 = new Student("HeheBoiz",19,"1111111",10);
        pm1.add(new Student("Nhut",18,"523H0164",9.37));
        pm1.add(new Student("Bien",20,"29199999",8.2));
        pm1.add(st1);
        pm1.display();

        PersonModel<Employee> pm2 = new PersonModel<>();
        pm2.add(new Employee("Le",30,"12345",40000));
        pm2.add(new Employee("Minh",12,"none",0));
        pm2.display();

        PersonModel<Person> pm3 = new PersonModel<>();
        pm3.add(new Person("Nguyen Van A",40));
        pm3.add(new Person("Nguyen Van B",50));
        pm3.display();
    }
}