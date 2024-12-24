package OU_Exercise.MidTerm.SoEasy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Borrower {
    private String CCCD;
    private String name;
    private LocalDate sinh;
    private List<Book> list;

    public Borrower(String cCCD, String name, LocalDate sinh) {
        CCCD = cCCD;
        this.name = name;
        this.sinh = sinh;
        this.list = new ArrayList<>();
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String cCCD) {
        CCCD = cCCD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getSinh() {
        return sinh;
    }

    public void setSinh(LocalDate sinh) {
        this.sinh = sinh;
    }

    public List<Book> getList() {
        return list;
    }

    public void setList(List<Book> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Borrower: CCCD=" + CCCD + ", name=" + name + ", sinh=" + sinh + "\n" + "List: "
                + list.stream().map(b -> b.getName()).collect(Collectors.joining(","));
    }

    // Claude đề nghị thêm
    public void borrowBook(Book book) {
        if (list.size() < 3) {
            list.add(book);
            book.setQuantity(book.getQuantity() - 1);
        }
    }
    
    public void returnBook(Book book) {
        if (list.remove(book)) {
            book.setQuantity(book.getQuantity() + 1);
        }
    }
}
