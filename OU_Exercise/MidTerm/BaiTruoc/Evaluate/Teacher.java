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
public class Teacher {
    private String id;
    private String name;
    private LocalDate birthDate;

    public Teacher(String id, String name, String birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = LocalDate.parse(birthDate, Config.FORMATTER);
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
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
        return "Teacher{" + "id=" + id + ", name=" + name + ", birthDate=" + birthDate + '}';
    }
    
    
}
