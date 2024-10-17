package NestedClass;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    static class Publisher{
        private String publisherName;
        private String publisherAddress;
        private String phoneNumber;

        public Publisher(String publisherName, String publisherAddress, String phoneNumber) {
            this.publisherName = publisherName;
            this.publisherAddress = publisherAddress;
            this.phoneNumber = phoneNumber;
        }

        public void displayPublisherInfo() {
            System.out.println("Publisher Name: " + publisherName);
            System.out.println("Address: " + publisherAddress);
            System.out.println("Phone: " + phoneNumber);
        }
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Book book = new Book("Java Programming", "John Doe", 49.99);
        Book.Publisher publisher = new Book.Publisher("TechBooks", "123 Elm St", "555-1234");

        book.displayBookInfo();
        publisher.displayPublisherInfo();
    }
}
