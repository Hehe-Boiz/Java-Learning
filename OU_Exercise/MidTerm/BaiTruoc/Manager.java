package OU_Exercise.MidTerm.BaiTruoc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Manager {

    private static List<Student> students = new ArrayList<>();

    public void addStudents(Student ...student) {
        students.addAll(Arrays.asList(student));
    }

    public void buyTicket(String msSt, String start, String loai) {
        Student st = students.stream().filter(s -> s.getId().equals(msSt)).findFirst().orElse(null);
        if (st == null) {
            System.out.println("Người học không tồn tại");
            return;
        }
        if (loai.equalsIgnoreCase("Thang")) {
            st.getTickets().add(new TicketMonth(start));
            return;
        }
        else if(loai.equalsIgnoreCase("Nam")){
            st.getTickets().add(new TicketYear(start));
            return;
        }
        
        System.out.println("Loại vé không hợp lệ");
    }
    
    public void displayStudentMonth12(){
        List<Student> sts = students.stream().filter(s -> s.getBirthDate().getMonthValue()==12).toList();
        if(sts == null){
            System.out.println("Không có người học nào sinh tháng 12");
            return;
        }
        sts.stream().forEach(s -> System.out.println(s));
    }
    
    public void displayTicket(String ms){
        Student st = students.stream().filter(s -> s.getId().equals(ms)).findFirst().orElse(null);
        if (st == null){
            System.out.println("Người học này không tồn tại trong hệ thống");
            return;
        }
        st.getTickets().stream().forEach(s -> System.out.println(s));
    }
    
    public Student searchStudent(String ms){
        Student st= students.stream().filter(s -> s.getId().equals(ms)).findFirst().orElse(null);
        if(st == null){
            System.out.println("Người học không tồn tại trong hệ thống");
            return null;
        }
        return st;
    }
    
    public void displayBuyYear2024(){
        List<Student> sts2024 = students.stream().filter(s -> s.getTickets().stream().anyMatch(t -> t.getPurchaseDate().getYear()==2024)).toList();
        if(sts2024 == null){
            System.out.println("Không có người học nào trong hệ thống mua vé năm 2024");
            return;
        }
        sts2024.stream().forEach(s -> System.out.println(s));
    }
    
    public void sortList(){
        students.sort(Comparator.comparing((Student s) -> s.getBirthDate().getYear()).reversed().thenComparing(Student::getFullName));
    }
    
    public void display(){
        students.forEach(s -> System.out.println(s));
    }
}
