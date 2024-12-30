/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OU_Exercise.MidTerm.BaiTruoc.Evaluate;

import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public class Tester {

    public static void main(String[] args) {
        Manager manager = new Manager();

        Teacher t1 = new Teacher("GV-1", "Khue", "10/10/1980");
        Teacher t2 = new Teacher("GV-2", "Thanh", "10/08/1990");
        Teacher t3 = new Teacher("GV-3", "Thien", "10/10/1980");
        Teacher t4 = new Teacher("GV-4", "Hoan", "10/10/1980");
        Teacher t5 = new Teacher("GV-5", "Bao", "10/10/1980");
        Teacher t6 = new Teacher("GV-6", "Nhan", "10/10/1980");
        Teacher t7 = new Teacher("GV-7", "Tuan", "10/10/1980");

        Student s1 = new Student("123", "Nhut", "Nam", "15/05/2005");
        Student s2 = new Student("124", "Tan", "Nam", "12/08/2003");
        Student s3 = new Student("125", "Kha", "Nam", "12/03/2002");
        Student s4 = new Student("126", "Long", "Nam", "23/02/2001");
        Student s5 = new Student("127", "Nhan", "Nam", "08/01/2000");
        Student s6 = new Student("128", "Ngan", "Nu", "20/10/2005");
        Student s7 = new Student("129", "Phong", "Nam", "22/10/2005");
        Student s8 = new Student("1210", "Khang", "Nam", "20/12/2005");
        Student s9 = new Student("1211", "Vu", "Nu", "22/10/2005");

        Evaluate e1 = new FacilityEvalute("NH", "Tot", s1, "20/07/2024");
        Evaluate e2 = new FacilityEvalute("VVT", "Ok", s1, "20/12/2024");
        Evaluate e3 = new FacilityEvalute("HHL", "On", s2, "20/03/2024");
        Evaluate e4 = new FacilityEvalute("VVT", "Tot", s3, "20/07/2022");
        Evaluate e5 = new FacilityEvalute("NH", "Tot", s4, "20/10/2023");
        Evaluate e6 = new LectureEvaluation(t1, 3.5, "Hay", s1, "17/01/2023");
        Evaluate e7 = new LectureEvaluation(t2, 3.8, "good", s2, "27/11/2023");
        Evaluate e8 = new LectureEvaluation(t3, 3.0, "Tot", s2, "11/11/2022");
        Evaluate e9 = new LectureEvaluation(t4, 3.6, "Good Job", s3, "09/01/2023");
        Evaluate e10 = new LectureEvaluation(t5, 3.3, "Ngon", s1, "20/07/2024");
        
        manager.addStudents(s1,s2,s3,s4,s5,s6,s7,s8,s9);
        manager.addTeacher(t1,t2,t3,t4,t5,t6,t7);
        
        System.out.println("Cau 2:-------------");
        manager.addEvaluate(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10);
        
        System.out.println("Cau 1:-------------");
        manager.displayEvaluate(1, 2023);
        System.out.println(e9.getTerm() + " " + e9.getYearOfImplementation());
        
        System.out.println("Them Thanh Cong");
        
        System.out.println("Cau 3:-------------");
        manager.evaluateFacilityNH(1).forEach(e -> System.out.println(e));
        
        System.out.println("Cau 4:-------------");
        System.out.println(manager.caculatorTeacher(t1.getId(), 1));
        
        System.out.println("Cau 5:-------------");
        manager.sortStudent();
        manager.display();
    }

}
