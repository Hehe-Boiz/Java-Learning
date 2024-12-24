package OU_Exercise.MidTerm.SoEasy;

public class Book {
    protected static int count = 0;
    protected String id;
    protected String name;
    protected String author;
    protected String category;
    protected int quantity;

    public Book(String name, String author, String category, int quantity) {
        this.id = String.format("HeheBoiz-%04d", ++count);
        this.name = name;
        this.author = author;
        this.category = category;
        this.quantity = quantity;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    

    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", author=" + author + ", category=" + category + ", quantity="
                + quantity + "]";
    }

    public static int getCount() {
        return count;
    }

    
}
