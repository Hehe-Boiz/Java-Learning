package InventoryManagementSystem;

public class Main {
    public static void main(String[] args) {
        // LibraryManager libraryManager = new LibraryManager();
        // LibraryCLI libraryCLI = new LibraryCLI(libraryManager);
        // libraryCLI.start();
        // Tạo quản lý thư viện
        LibraryManager libraryManager = new LibraryManager();

        // Sử dụng MediaItemFactory để tạo các tài liệu
        MediaItem<?> book1 = MediaItemFactory.createMediaItem("book", "Java Programming", "John Doe", 2020, "300");
        MediaItem<?> magazine1 = MediaItemFactory.createMediaItem("magazine", "Tech Today", "Jane Smith", 2021, "5");
        MediaItem<?> cd1 = MediaItemFactory.createMediaItem("cd", "Greatest Hits", "Artist A", 2019, "3:30");
        MediaItem<?> dvd1 = MediaItemFactory.createMediaItem("dvd", "Inception", "Christopher Nolan", 2010, "2:28");

        // Thêm tài liệu vào thư viện
        libraryManager.getLibrary().addItem(book1);
        libraryManager.getLibrary().addItem(magazine1);
        libraryManager.getLibrary().addItem(cd1);
        libraryManager.getLibrary().addItem(dvd1);

        // Tạo người dùng
        User user1 = new User("Alice", 1);
        User user2 = new User("Bob", 2);

        // Thêm người dùng vào quản lý thư viện
        libraryManager.addUser(user1);
        libraryManager.addUser(user2);

        // Mượn tài liệu
        user1.borrowItem((Book) book1); // Ép kiểu cho book1
        libraryManager.getLibrary().removeItem(book1);

        // In danh mục
        System.out.println("Danh mục sau khi mượn:");
        libraryManager.getLibrary().printCatalog(item -> "Tiêu đề: " + item.getTitle() + ", Tác giả: " + item.getAuthor() + ", Năm: " + item.getYear());

        // Đặt trước tài liệu
        boolean reserved = libraryManager.getLibrary().reserveItem(magazine1, user2);
        if (reserved) {
            System.out.println("Tài liệu đã được đặt trước.");
        } else {
            System.out.println("Không thể đặt trước tài liệu này. Có thể tài liệu đang được mượn.");
        }
        
        // Cố gắng đặt trước một tài liệu đã được mượn
        libraryManager.getLibrary().reserveItem(book1, user2); // Nên thông báo rằng tài liệu đang được mượn

        // Trả tài liệu
        user1.returnItem((Book) book1); // Ép kiểu cho book1
        libraryManager.getLibrary().addItem(book1); // Thêm lại vào thư viện
        System.out.println("Danh mục sau khi trả:");
        libraryManager.getLibrary().printCatalog(item -> "Tiêu đề: " + item.getTitle() + ", Tác giả: " + item.getAuthor() + ", Năm: " + item.getYear());
    }
}
