package InventoryManagementSystem;
import java.util.ArrayList;
import java.util.NoSuchElementException;
//GIAO DIỆN KHI MUỐN NHẬP THỰC TẾ 
import java.util.Scanner;

public class LibraryCLI {
    private LibraryManager libraryManager;
    private Scanner scanner;

    public LibraryCLI(LibraryManager libraryManager) {
        this.libraryManager = libraryManager;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        String command;
        System.out.println("Chào mừng đến với Hệ thống Quản lý Thư viện!");
        while (true) {
            System.out.println("\nNhập lệnh (add, remove, borrow, return, reserve, print, exit):");
            command = scanner.nextLine().trim();

            switch (command) {
                case "add":
                    addItem();
                    break;
                case "remove":
                    removeItem();
                    break;
                case "borrow":
                    borrowItem();
                    break;
                case "return":
                    returnItem();
                    break;
                case "reserve":
                    reserveItem();
                    break;
                case "print":
                    printCatalog();
                    break;
                case "exit":
                    System.out.println("Thoát khỏi chương trình.");
                    return;
                default:
                    System.out.println("Lệnh không hợp lệ. Vui lòng thử lại.");
            }
        }
    }

    private void addItem() {
        // Thêm mã để thêm tài liệu vào thư viện
        System.out.println("Nhập loại tài liệu (book, magazine, cd, dvd):");
        String type = scanner.nextLine().trim();
        System.out.println("Nhập tiêu đề:");
        String title = scanner.nextLine().trim();
        System.out.println("Nhập tác giả:");
        String author = scanner.nextLine().trim();
        
        int year = 0;
        while (true) {
            System.out.println("Nhập năm xuất bản:");
            try {
                year = Integer.parseInt(scanner.nextLine().trim());
                break; // Thoát khỏi vòng lặp nếu chuyển đổi thành công
            } catch (NumberFormatException e) {
                System.out.println("Năm xuất bản không hợp lệ, vui lòng nhập lại:");
            }
        }

        System.out.println("Nhập thông tin cụ thể (số trang, số phát hành, thời gian phát, đạo diễn):");
        String specificInfo = scanner.nextLine();
        try {

            if (type.isEmpty() || title.isEmpty() || author.isEmpty() || specificInfo.isEmpty()) {
                System.out.println("Các trường không được để trống.");
                return;
            }

            MediaItem<?> mediaItem = MediaItemFactory.createMediaItem(type, title, author, year, specificInfo);
            libraryManager.getLibrary().addItem(mediaItem);
            System.out.println("Tài liệu đã được thêm vào thư viện.");
        } catch(IllegalArgumentException e){
            System.out.println(e);
        }
    }

    private void removeItem() {
        // Thêm mã để xóa tài liệu khỏi thư viện
        System.out.println("Nhập tiêu đề tài liệu cần xóa:");
        String title = scanner.nextLine();
        ArrayList<MediaItem<?>> foundItems = libraryManager.getLibrary().searchByTitle(title);
        if(foundItems.isEmpty()){
            System.out.println("Không tìm thấy tài liệu với tiêu đề: " + title);
            return;
        }
        for(MediaItem<?> item : foundItems){
            libraryManager.getLibrary().removeItem(item);
            System.out.println("Tài liệu '" + title + "' đã được xóa.");
        }
    }

    private void borrowItem() {
        // Thêm mã để mượn tài liệu
        System.out.println("Nhập tiêu đề tài liệu cần mượn:");
        String title = scanner.nextLine();
        System.out.println("Người mượn: ");
        String userName = scanner.nextLine();
        System.out.println("ID người mượn: ");
        int ID = scanner.nextInt();
        scanner.nextLine();

        try{
            User user = libraryManager.getUserByName(userName, ID);
            ArrayList<MediaItem<?>> foundItems = libraryManager.getLibrary().searchByTitle(title);

            if(foundItems.isEmpty()){
                System.out.println("Không tìm thấy tài liệu với tiêu đề: " + title);
                return;
            }

            for(MediaItem<?> item : foundItems){
                libraryManager.borrowItem(user, item);;
                libraryManager.getLibrary().removeItem(item);
            }
            System.out.println("Tài liệu đã được trả thành công!");
        } catch(NoSuchElementException e){
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }
    }

    private void returnItem() {
        // Thêm mã để trả tài liệu
        System.out.println("Nhập tiêu đề tài liệu cần trả:");
        String title = scanner.nextLine();
        System.out.println("Người trả: ");
        String userName = scanner.nextLine();
        System.out.println("ID người trả: ");
        int ID = scanner.nextInt();
        scanner.nextLine(); // Dọn dẹp bộ đệm

        try{
            User user = libraryManager.getUserByName(userName, ID);
            ArrayList<MediaItem<?>> foundItems = libraryManager.getLibrary().searchByTitle(title);

            if(foundItems.isEmpty()){
                System.out.println("Không tìm thấy tài liệu với tiêu đề: " + title);
                return;
            }

            for(MediaItem<?> item : foundItems){
                libraryManager.returnItem(user, item);;
                libraryManager.getLibrary().addItem(item);
            }
            System.out.println("Tài liệu đã được trả thành công!");
        } catch(NoSuchElementException e){
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }
    }

    private void reserveItem() {
        // Thêm mã để đặt trước tài liệu
        System.out.println("Nhập tiêu đề tài liệu cần đặt trước:");
        String title = scanner.nextLine();
        System.out.println("Người đặt trước: ");
        String userName = scanner.nextLine();
        System.out.println("ID người đặt trước: ");
        int ID = scanner.nextInt();
        scanner.nextLine(); 
        try{
            User user = libraryManager.getUserByName(userName, ID);
            ArrayList<MediaItem<?>> foundItems = libraryManager.getLibrary().searchByTitle(title);

            if(foundItems.isEmpty()){
                System.out.println("Không tìm thấy tài liệu với tiêu đề: " + title);
                return;
            }

            for(MediaItem<?> item : foundItems){
                boolean reserved = libraryManager.getLibrary().reserveItem(item, user);
                if (reserved) {
                    System.out.println("Tài liệu đã được đặt trước.");
                } else {
                    System.out.println("Không thể đặt trước tài liệu này. Có thể tài liệu đang được mượn.");
                }
            }
        } catch(NoSuchElementException e){
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }
        // Tìm tài liệu và thực hiện đặt trước
    }

    private void printCatalog() {
        // In danh mục tài liệu
        libraryManager.getLibrary().printCatalog(item -> "Tiêu đề: " + item.getTitle() + ", Tác giả: " + item.getAuthor() + ", Năm: " + item.getYear());
    }
}

