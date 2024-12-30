/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OU_Exercise.MidTerm.BaiTruoc.Evaluate;

import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;



/**
 *
 * @author Admin
 */
public class Manager {
    private List<Evaluate> evaluates;
    private List<Student> students;
    private List<Teacher> teachers;

    public Manager() {
        this.evaluates = new ArrayList<>();
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }
    
    public void displayEvaluate(int term, int year){
        List<Evaluate> evs = evaluates.stream().filter(e -> e.getTerm() == term).filter(ef -> ef.getYearOfImplementation() == year).toList();
        if (evs.isEmpty()){
            System.out.println("Không có đánh giá nào trong học kì "+term + " của năm học "+year);
            return;
        }
        evs.forEach(e -> System.out.println(e));
    }
    
    public void addEvaluate(Evaluate ...evaluate){
        evaluates.addAll(Arrays.asList(evaluate));
    }
    
    public List<Evaluate> evaluateFacilityNH(int term){
        if(term > 3 || term < 0){
            throw new IllegalArgumentException("Đối số không phù hợp");
        }
        List<Evaluate> evas = evaluates.stream().filter(e -> e instanceof FacilityEvalute && ((FacilityEvalute) e).getFacility().equals(Facility.NH) && e.getTerm()==term).toList();
        if(evas.isEmpty()){
            System.out.println("Không có đánh giá nào được thực hiện");
            return null;
        }
        return evas;
    }
    
    public double caculatorTeacher(String msGV, int term){
        if(term > 3 || term < 0){
            throw new IllegalArgumentException("Đối số không phù hợp");
        }
        List<Evaluate> evas = evaluates.stream().filter(e -> e instanceof LectureEvaluation).filter(e -> ((LectureEvaluation) e).getGv().getId().equals(msGV)).filter(e -> e.getTerm()== term).toList();
        if(evas.isEmpty()){
            System.out.println("Không có đánh giá nào cho giảng viên này");
            return 0;
        }
        return evas.stream().mapToDouble(e -> ((LectureEvaluation) e).getScore()).average().orElse(0.0);
    }
    
    public void sortStudent(){
        students.sort(Comparator.comparing((Student s) -> s.getBirthDate().getYear())
              .reversed()
              .thenComparing(Student::getName));
    }
    
    public void addTeacher(Teacher ...t){
        teachers.addAll(Arrays.asList(t));
    }
    
    public void addStudents(Student ...s){
        students.addAll(Arrays.asList(s));
    }
    
    public void display(){
        students.forEach(e -> System.out.println(e));
    }
}
