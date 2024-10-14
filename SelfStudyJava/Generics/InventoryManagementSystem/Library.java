package InventoryManagementSystem;

import java.util.ArrayList;
import java.util.Date;

//? ở đây có nghĩa là một kiểu không xác định có thể là bất kì kiểu dữ liệu gì 
// kiểu dữ liệu T bị giới hạn là thừa kế của MediaItem 
public class Library <T extends MediaItem<?>> {
    private ArrayList<T> items = new ArrayList<>();
    private ArrayList<Reservation> reservations = new ArrayList<>();

    public void addItem(T item){
        items.add(item);
    }

    public void removeItem(T item){
        items.remove(item);
    }

    public ArrayList<T> searchByTitle(String title){
        ArrayList<T> outList = new ArrayList<>();
        for(T item : items){
            //so sánh không phân biệt chữ hoa hay thường
            if(item.getTitle().equalsIgnoreCase(title)){
                outList.add(item);
            }
        }
        return outList;
    }

    public ArrayList<T> searchByAuthor(String author){
        ArrayList<T> outList = new ArrayList<>();
        for(T item : items){
            if(item.getTitle().equalsIgnoreCase(author)){
                outList.add(item);
            }
        }
        return outList;
    }

    public ArrayList<T> searchByYear(int year){
        ArrayList<T> outList = new ArrayList<>();
        for(T item : items){
            //equals chỉ so sánh dành cho đối tượng
            if(item.getYear() == year){
                outList.add(item);
            }
        }
        return outList;
    }

    // mỗi khi tạo ra 1 lớp mới Java sẽ tự tạo ra 1 đối tượng Class tương ứng để lưu trữ thông tin về lớp đó (mỗi đối tượng Class sẽ đại diện cho 1 lớp)
    // VD: khi viết Class<String> nó sẽ đại diện duy nhất lớp String 
    public ArrayList<T> getItemsByType(Class<? extends MediaItem<?>> type){
        ArrayList<T> result = new ArrayList<>();
        for (T item : items) {
            if (type.isInstance(item)) {
                result.add(item);
            }
        }
        return result;
    }

    public void printCatalog(Formatter<T> formatter) {
        for (T item : items) {
            System.out.println(formatter.format(item));
        }
    }

    @FunctionalInterface
    public interface Formatter<T> {
        String format(T item);
    }

    public void reserveItem(MediaItem<?> item, User user) {
        // Kiểm tra xem tài liệu đã được mượn chưa
        if (!items.contains(item)) {
            reservations.add(new Reservation(item, user, new Date()));
            System.out.println("Tài liệu đã được đặt trước thành công!");
        } else {
            System.out.println("Tài liệu hiện đang được mượn và không thể đặt trước.");
        }
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }
}
