package InventoryManagementSystem;

public class Magazine implements MediaItem<Integer>{
    private String title;
    private String author;
    private int year;
    private int isSueNumber;

    public Magazine(String title, String author, int year, int isSueNumber) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isSueNumber = isSueNumber;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public Integer getSpecificInfo() {
        return isSueNumber;
    }
}
