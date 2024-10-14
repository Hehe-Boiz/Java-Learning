package InventoryManagementSystem;

public class CD implements MediaItem<String>{
    private String title;
    private String artist;
    private int year;
    private String duration;

    public CD(String title, String artist, int year, String duration) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.duration = duration;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return artist;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public String getSpecificInfo() {
        return duration;
    } 
}
