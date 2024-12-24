package OU_Exercise.MidTerm.SoEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class LibaryManager {
    private ArrayList<Book> listBooks = new ArrayList<>();
    private ArrayList<Borrower> listBorrowers = new ArrayList<>();

    public void displayBook(){
        listBooks.forEach(b->System.out.println(b));
    }

    public void displayBorrower(){
        listBorrowers.forEach(b->System.out.println(b));
    }

    public void addBook(Book ...a){
        listBooks.addAll(Arrays.asList(a));
    }

    public boolean isCheckBook(Borrower p){
        return p.getList().size()<3;
    }

    public void sort(){
        listBooks.sort(Comparator.comparing(Book::getQuantity).reversed());
    }

    public void displayBookLess5(){
        listBooks.stream().filter(b->b.getQuantity() <=5).forEach(b->System.out.println(b));
    }

    // Claude đề nghị thêm
    public void addBorrower(Borrower... borrowers) {
        listBorrowers.addAll(Arrays.asList(borrowers));
    }

    public boolean borrowBook(String cccd, String bookId) {
        Borrower borrower = listBorrowers.stream()
                .filter(b -> b.getCCCD().equals(cccd))
                .findFirst()
                .orElse(null);
                
        Book book = listBooks.stream()
                .filter(b -> b.getId().equals(bookId))
                .findFirst()
                .orElse(null);
                
        if (borrower != null && book != null && isCheckBook(borrower) && book.getQuantity() > 0) {
            borrower.borrowBook(book);
            return true;
        }
        return false;
    }

    public Book findBook(String id) {
        return listBooks.stream()
                .filter(b -> b.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
    
    public Borrower findBorrower(String cccd) {
        return listBorrowers.stream()
                .filter(b -> b.getCCCD().equals(cccd))
                .findFirst()
                .orElse(null);
    }
}
