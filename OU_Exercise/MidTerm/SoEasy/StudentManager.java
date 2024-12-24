package OU_Exercise.MidTerm.SoEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentManager {
    List<Student> listStudents = new ArrayList<>();
    List<Subject> listSubjects = new ArrayList<>();

    public void displayStudent() {
        listStudents.forEach(s -> System.out.println(s));
    }

    public void addStuent(Student... s) {
        listStudents.addAll(Arrays.asList(s));
    }

    public void registerSubject(String subjectId, String studentId) {
        try {
            Subject subject = listSubjects.stream()
                    .filter(s -> s.getId().equals(subjectId))
                    .findFirst()
                    .orElse(null);
            Student student = listStudents.stream()
                    .filter(s -> s.getId().equals(studentId))
                    .findFirst()
                    .orElse(null);

            if (student.getList().contains(subject)) {
                System.out.println("Sinh viên đã đăng ký môn học này!");
                return;
            }

            if (subject.getMax() == subject.getStudentCount()) {
                System.out.println("Môn học đã đủ sinh viên!");
                return;
            }

            student.getList().add(subject);
            subject.setStudentCount(subject.getStudentCount() + 1);
            System.out.println("Đăng ký thành công!");

        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    public boolean isCheckSubject(String id) {
        Student student = listStudents.stream().filter(s -> s.getId().equals(id)).findFirst().orElse(null);
        if (student == null) {
            System.out.println("Không tìm thấy");
            return false;
        }

        return student.getList().stream()
                .mapToDouble(Subject::getTinChi)
                .sum() >= 12;
    }

    public void displaySuject() {
        listSubjects.stream().filter(s -> s.getStudentCount() < s.getMax() * 0.8).forEach(s -> System.out.println(s));
    }

    public void addSubject(Subject... subjects) {
        listSubjects.addAll(Arrays.asList(subjects));
    }
}
