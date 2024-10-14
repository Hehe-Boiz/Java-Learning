package InventoryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    private Library<MediaItem<?>> library = new Library<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void borrowItem(User user, MediaItem<?> item) {
        user.borrowItem(item);
    }

    public void returnItem(User user, MediaItem<?> item) {
        user.returnItem(item);
    }

    public List<User> getUsers() {
        return users;
    }

    public Library<MediaItem<?>> getLibrary() {
        return library;
    }
}
