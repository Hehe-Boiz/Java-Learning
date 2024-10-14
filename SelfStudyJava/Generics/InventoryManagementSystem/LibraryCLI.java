package InventoryManagementSystem;
//GIAO DIỆN KHI MUỐN NHẬP 
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
            command = scanner.nextLine();

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
        String type = scanner.nextLine();
        System.out.println("Nhập tiêu đề:");
        String title = scanner.nextLine();
        System.out.println("Nhập tác giả:");
        String author = scanner.nextLine();
        System.out.println("Nhập năm xuất bản:");
        int year = Integer.parseInt(scanner.nextLine());

        switch (type) {
            case "book":
                System.out.println("Nhập số trang:");
                int pages = Integer.parseInt(scanner.nextLine());
                libraryManager.getLibrary().addItem(new Book(title, author, year, pages));
                break;
            case "magazine":
                System.out.println("Nhập số phát hành:");
                int issue = Integer.parseInt(scanner.nextLine());
                libraryManager.getLibrary().addItem(new Magazine(title, author, year, issue));
                break;
            case "cd":
                System.out.println("Nhập thời gian phát:");
                String duration = scanner.nextLine();
                libraryManager.getLibrary().addItem(new CD(title, author, year, duration));
                break;
            case "dvd":
                System.out.println("Nhập đạo diễn:");
                String director = scanner.nextLine();
                libraryManager.getLibrary().addItem(new DVD(title, author, year, director));
                break;
            default:
                System.out.println("Loại tài liệu không hợp lệ.");
        }
        System.out.println("Tài liệu đã được thêm vào thư viện.");
    }

    private void removeItem() {
        // Thêm mã để xóa tài liệu khỏi thư viện
        System.out.println("Nhập tiêu đề tài liệu cần xóa:");
        String title = scanner.nextLine();
        // Tìm tài liệu và xóa
        // Giả sử ta có phương thức xóa theo tiêu đề (cần thêm vào lớp Library)
    }

    private void borrowItem() {
        // Thêm mã để mượn tài liệu
        System.out.println("Nhập tiêu đề tài liệu cần mượn:");
        String title = scanner.nextLine();
        // Tìm tài liệu và thực hiện mượn
    }

    private void returnItem() {
        // Thêm mã để trả tài liệu
        System.out.println("Nhập tiêu đề tài liệu cần trả:");
        String title = scanner.nextLine();
        // Tìm tài liệu và thực hiện trả
    }

    private void reserveItem() {
        // Thêm mã để đặt trước tài liệu
        System.out.println("Nhập tiêu đề tài liệu cần đặt trước:");
        String title = scanner.nextLine();
        // Tìm tài liệu và thực hiện đặt trước
    }

    private void printCatalog() {
        // In danh mục tài liệu
        libraryManager.getLibrary().printCatalog(item -> "Tiêu đề: " + item.getTitle() + ", Tác giả: " + item.getAuthor() + ", Năm: " + item.getYear());
    }
}

