package OU_Exercise.MidTerm.BaiTruoc.TrainTicket;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private static int count =0;
    private String id;
    private String fullName;
    private LocalDate birthDate;
    private String school;
    private List<Ticket> tickets;

    public Student(String fullName, String brithDate, String school) {
        this.id = String.format("STUD-%05d", ++count);
        this.fullName = fullName;
        this.birthDate = LocalDate.parse(brithDate, Config.FORMATTER);
        this.school = school;
        this.tickets = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate brithDate) {
        this.birthDate = brithDate;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", fullName=" + fullName + ", brithDate=" + birthDate + ", school=" + school + ", tickets=" + tickets + '}';
    }
    
    
}
