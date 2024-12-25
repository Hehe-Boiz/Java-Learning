package OU_Exercise.MidTerm.Easy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Learner {
    private static int count =0;
    private String id;  
    private String name;
    private LocalDate date;
    private String department;
    private List<LibaryCard> list;

    public Learner(String name, LocalDate date, String department) {
        this.id = String.format("HVSV-%05d", ++count);
        this.name = name;
        this.date = date;
        this.department = department;
        this.list = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<LibaryCard> getList() {
        return list;
    }

    public void setList(List<LibaryCard> list) {
        this.list = list;
    }

    public boolean isCheckYear2024(){
        return this.list.stream().anyMatch(l -> l.isCheckYear2024());
    }

    @Override
    public String toString() {
        return "Learner: id: " + id + ", Họ tên: " + name + ", Ngày sinh: " + date + ", Khoa/Viện: " + department ;
    }   
}
