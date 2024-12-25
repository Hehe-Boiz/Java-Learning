package OU_Exercise.MidTerm.Easy;

import java.time.LocalDate;

public class Learner {
    private static int count =0;
    private String id;  
    private String name;
    private LocalDate date;
    private String department;

    public Learner(String name, LocalDate birthDate, String department) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Tên không được để trống");
        }
        if (birthDate == null) {
            throw new IllegalArgumentException("Ngày sinh không được để trống");
        }
        if (department == null || department.trim().isEmpty()) {
            throw new IllegalArgumentException("Khoa/Viện không được để trống");
        }
        
        this.id = String.format("HVSV-%05d", ++count);
        this.name = name;
        this.date = birthDate;
        this.department = department;
    }

    // Getters và setters
    public String getId() { return id; }
    public String getName() { return name; }
    public LocalDate getBirthDate() { return date; }
    public String getDepartment() { return department; }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }
    
    public void setBirthDate(LocalDate birthDate) {
        if (birthDate != null) {
            this.date = birthDate;
        }
    }
    
    public void setDepartment(String department) {
        if (department != null && !department.trim().isEmpty()) {
            this.department = department;
        }
    }

    @Override
    public String toString() {
        return String.format("Người học: ID: %s, Họ tên: %s, Ngày sinh: %s, Khoa/Viện: %s",
                id, name, date, department);
    }   
}
