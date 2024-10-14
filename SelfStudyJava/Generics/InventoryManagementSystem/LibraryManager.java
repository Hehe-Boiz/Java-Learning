package InventoryManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

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

    public User getUserByName(String userName,int ID ){
        for(User user : users){
            if(user.getName().equals(userName) && user.getId() == ID){
                return user;
            }
        }
        throw new NoSuchElementException("Không tìm thấy đối tượng: Name= " +userName + " Id= " + ID );
    }
}
