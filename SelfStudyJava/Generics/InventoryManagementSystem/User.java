package InventoryManagementSystem;

import java.util.ArrayList;

public class User {
    private String name;
    private int id;
    private ArrayList<MediaItem<?>> borrowedItems = new ArrayList<>();

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void borrowItem(MediaItem<?> item) {
        borrowedItems.add(item);
    }

    public void returnItem(MediaItem<?> item) {
        borrowedItems.remove(item);
    }

    public ArrayList<MediaItem<?>> getBorrowedItems() {
        return borrowedItems;
    }
}
