package InventoryManagementSystem;

public class DVD implements MediaItem<String>{
    private String title;
    private String director;
    private int year;
    private String producer;

    public DVD(String title, String director, int year, String producer) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.producer = producer;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return director;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public String getSpecificInfo() {
        return producer;
    } 
}
