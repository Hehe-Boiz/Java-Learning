package NestedClass;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private String className;
    private List<Student> students;

    public Classroom(String className) {
        this.className = className;
        this.students = new ArrayList<>(); 
    }

    public void addStudent(String name, String rollNumber) {
        Student student = new Student(name, rollNumber);
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("Class: " + className);
        System.out.println("Student List:");
        for (Student student : students) {
            System.out.println("Name: " + student.name + ", Roll Number: " + student.rollNumber);
        }
    }

    class Student {
        private String name;
        private String rollNumber;

        public Student(String name, String rollNumber) {
            this.name = name;
            this.rollNumber = rollNumber;
        }
    }

    public static void main(String[] args) {
        // Tạo một đối tượng Classroom
        Classroom classroom = new Classroom("Class 10A");

        // Thêm một số sinh viên vào lớp học
        classroom.addStudent("Alice", "R001");
        classroom.addStudent("Bob", "R002");
        classroom.addStudent("Charlie", "R003");

        // Hiển thị danh sách sinh viên
        classroom.displayStudents();
    }
}
