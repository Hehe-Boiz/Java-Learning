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
public class Student {
    private String MSSV;
    private String name;
    private String gender;
    private LocalDate birthDate;

    public Student(String MSSV, String name, String gender, String birthDate) {
        this.MSSV = MSSV;
        this.name = name;
        this.gender = gender;
        this.birthDate = LocalDate.parse(birthDate, Config.FORMATTER);
    }

    /**
     * @return the MSSV
     */
    public String getMSSV() {
        return MSSV;
    }

    /**
     * @param MSSV the MSSV to set
     */
    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the birthDate
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Student{" + "MSSV=" + MSSV + ", name=" + name + ", gender=" + gender + ", birthDate=" + birthDate + '}';
    }
    
    
}
