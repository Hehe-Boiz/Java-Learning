package InventoryManagementSystem;

public interface MediaItem <T>{
    public String getTitle();
    public String getAuthor();
    public int getYear();
    public T getSpecificInfo();
} 