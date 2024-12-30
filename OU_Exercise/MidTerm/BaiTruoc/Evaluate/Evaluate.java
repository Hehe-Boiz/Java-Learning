/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OU_Exercise.MidTerm.BaiTruoc.Evaluate;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Admin
 */
public abstract class Evaluate {

    private static int count = 0;
    private String id;
    private String content;
    private Student student;
    private LocalDate dateOfImplementation;
    private int yearOfImplementation;
    private int term;

    public Evaluate(String content, Student student, String dateOfImplementation) {
        this.id = String.format("%04d", ++count);
        this.content = content;
        this.student = student;
        this.dateOfImplementation = LocalDate.parse(dateOfImplementation, Config.FORMATTER);
        this.yearOfImplementation = this.dateOfImplementation.getYear();
        this.term = caculatorTerm();
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the student
     */
    public Student getStudent() {
        return student;
    }

    /**
     * @param student the student to set
     */
    public void setStudent(Student student) {
        this.student = student;
    }

    /**
     * @return the dateOfImplementation
     */
    public LocalDate getDateOfImplementation() {
        return dateOfImplementation;
    }

    /**
     * @param dateOfImplementation the dateOfImplementation to set
     */
    public void setDateOfImplementation(LocalDate dateOfImplementation) {
        this.dateOfImplementation = dateOfImplementation;
    }

    /**
     * @return the yearOfImplementation
     */
    public int getYearOfImplementation() {
        return yearOfImplementation;
    }

    /**
     * @param yearOfImplementation the yearOfImplementation to set
     */
    public void setYearOfImplementation(int yearOfImplementation) {
        this.yearOfImplementation = yearOfImplementation;
    }

    private int caculatorTerm() {
        LocalDate implementationDate = this.dateOfImplementation;
        int year = implementationDate.getYear();

        if (implementationDate.isAfter(LocalDate.of(year, 9, 10))
                || implementationDate.isBefore(LocalDate.of(year, 1, 20))) {
            return 1;
        }

        if (implementationDate.isAfter(LocalDate.of(year, 1, 20))
                && implementationDate.isBefore(LocalDate.of(year, 5, 10))) {
            return 2;
        }

        if (implementationDate.isAfter(LocalDate.of(year, 5, 10))
                && implementationDate.isBefore(LocalDate.of(year, 9, 10))) {
            return 3;
        }

        return 1;
    }

    /**
     * @return the term
     */
    public int getTerm() {
        return caculatorTerm();
    }

    /**
     * @param term the term to set
     */
    public void setTerm(int term) {
        this.term = term;
    }

    @Override
    public String toString() {
        return "id=" + id + ", content=" + content + ", student=" + student + ", dateOfImplementation=" + dateOfImplementation + ", yearOfImplementation=" + yearOfImplementation + ", term=" + term;
    }

}
