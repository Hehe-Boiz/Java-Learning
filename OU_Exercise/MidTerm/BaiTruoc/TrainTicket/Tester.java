package OU_Exercise.MidTerm.BaiTruoc.TrainTicket;

public class Tester {

    public static void main(String[] args) {
        Student st1 = new Student("Lê Minh Nhựt", "15/05/2005", "UIT");
        Student st2 = new Student("Hehe Boiz", "15/12/2004", "OU");
        Student st3 = new Student("Nhựt", "12/12/2012", "HCMUS");
        Student st4 = new Student("Quách Trọng Kha", "01/12/2010", "OU");
        Student st5 = new Student("Nguyễn Bá Tân", "05/05/2005", "OU");

        Manager manager = new Manager();

        manager.addStudents(st1, st2, st3, st4, st5);

        // Câu 1:
        manager.buyTicket(st1.getId(), "15/01/2024", "thang");
        manager.buyTicket(st1.getId(), "01/01/2023", "nam");
        manager.buyTicket(st2.getId(), "01/06/2024", "thang");
        manager.buyTicket(st3.getId(), "06/07/2024", "thang");
        manager.buyTicket(st4.getId(), "15/05/2024", "thang");
        manager.buyTicket(st5.getId(), "12/03/2024", "nam");
        manager.buyTicket(st3.getId(), "19/09/2024", "nam");
        manager.buyTicket(st5.getId(), "12/03/2023", "thang");
        manager.buyTicket(st2.getId(), "12/09/2024", "nam");

        System.out.println("Câu 2:---------------------");
        manager.displayStudentMonth12();

        System.out.println("Câu 3:---------------------");
        manager.displayTicket(st3.getId());

        System.out.println("Câu 4:---------------------");
        System.out.println(manager.searchStudent(st1.getId()));

        System.out.println("Câu 5:---------------------");
        manager.displayBuyYear2024();
        
        System.out.println("Câu 6: ");
        manager.sortList();
        manager.display();
    }
}
