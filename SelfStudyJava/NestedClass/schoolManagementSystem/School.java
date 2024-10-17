package NestedClass.schoolManagementSystem;
import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class School {
    private String name;
    private List<Department> departments;
    private List<Student> students;

    static class Department{
        private String name;
        private List<Teacher> teachers;

        class Teacher {
            private String name;
            private String subject;
            
            public Teacher(String name, String subject) {
                this.name = name;
                this.subject = subject;
            }

            public String getName() {
                return name;
            }

            public String getSubject() {
                return subject;
            }
        }

        public Department(String name) {
            this.name = name;
            teachers = new ArrayList<>();
        }

        public void addTeacher(String name, String subject){
            Teacher teacher = new Teacher(name, subject);
            teachers.add(teacher);
        }

        public String getName() {
            return name;
        }

        public void displayDepartmentInfo() {
            System.out.println("Department: " + name);
            System.out.println("Teachers:");
            for (Teacher teacher : teachers) {
                System.out.println("Teacher: " + teacher.getName() + ", Subject: " + teacher.getSubject());
            }
        }

        
    }

    class Student{
        private String name;
        private int age;
        private Department department;
        
        public Student(String name, int age, Department department) {
            this.name = name;
            this.age = age;
            this.department = department;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public Department getDepartment() {
            return department;
        }

        
    }

    public School(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addDepartment(String name){
        Department department = new Department(name);
        departments.add(department);
    }

    void addStudent(String name, int age, String departmentName) {
        Department department = findDepartment(departmentName);
        if(department != null){
            Student student = new Student(departmentName, age, department);
            students.add(student);
        }
        else {
            throw new NoSuchElementException("Department not found: " + departmentName);
        }
    }
    
    public void displaySchoolInfo(){
        System.out.println("School Name: " + name);
        System.out.println("Departments:");
        for (Department department : departments) {
            department.displayDepartmentInfo();
        }
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge() +
                    ", Department: " + student.getDepartment().getName());
        }
    }

    public Department findDepartment(String departmentName) {
        for (Department department : departments) {
            if (department.getName().equals(departmentName)) {
                return department;
            }
        }
        return null;
    }
}
