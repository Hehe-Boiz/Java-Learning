package OU_Exercise.MidTerm.SoEasy;

import java.util.ArrayList;

public class Student {
    private static int count =0;
    private String id;
    private String name;
    private String classStudent;
    private ArrayList<Subject> list;

    public Student(String name, String classStudent) {
        this.id = String.format("HeheBoiz-Student-%04d", ++count);
        this.name = name;
        this.classStudent = classStudent;
        this.list = new ArrayList<>();
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    public ArrayList<Subject> getList() {
        return list;
    }

    public void setList(ArrayList<Subject> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Student: id: " + id + ", name: " + name + ", Lớp học: " + classStudent + "\n Các môn học đã đăng kí: " + list + "]";
    }

    public double getTotalCredits() {
        return list.stream()
                   .mapToDouble(Subject::getTinChi)
                   .sum();
    }
}
