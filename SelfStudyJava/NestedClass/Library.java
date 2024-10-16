package NestedClass;

import java.util.ArrayList;
import java.util.List;


public class Library {
    private List<Book> books = new ArrayList<>();

    public Library() {
        books = new ArrayList<>(); // Khởi tạo danh sách sách
    }

    public void addBook(String title, String author){
        class Book {
            private String title;
            private String author;

            public Book(String title, String author) {
                this.title = title;
                this.author = author;
            }

            public void displayInfo() {
                System.out.println("Title: " + title + ", Author: " + author);
            }
        }

        Book book = new Book(title, author);
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Books in the Library:");
        for (Book book : books) {
            book.displayInfo();
        }
    }
}
