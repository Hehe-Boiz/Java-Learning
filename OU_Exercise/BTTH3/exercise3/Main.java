package BTTH3.exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Thêm sản phẩm.");
            System.out.println("2. Xoá sản phẩm.");
            System.out.println("3. Cập nhật sản phẩm.");
            System.out.println("4. Tìm kiếm sản phẩm.");
            System.out.println("5. Sắp xếp sản phẩm giảm dần theo giá.");
            System.out.println("6. Xem danh sách sản phẩm.");
            System.out.println("7. Thoát.");
            System.out.print("Chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1 -> {
                    System.out.print("Nhập loại sản phẩm (book/disk): ");
                    String type = scanner.nextLine();
                    System.out.print("Nhập mã sản phẩm: ");
                    String id = scanner.nextLine();
                    System.out.print("Nhập tên sản phẩm: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập mô tả: ");
                    String description = scanner.nextLine();
                    System.out.print("Nhập nhà sản xuất: ");
                    String manufacturer = scanner.nextLine();
                    System.out.print("Nhập giá bán: ");
                    double price = scanner.nextDouble();

                    if (type.equalsIgnoreCase("book")) {
                        System.out.print("Nhập số trang: ");
                        int pageCount = scanner.nextInt();
                        manager.addSanPham(new Sach(id, name, description, manufacturer, price, pageCount));
                    } else if (type.equalsIgnoreCase("disk")) {
                        System.out.print("Nhập độ dài thời gian phát: ");
                        double duration = scanner.nextDouble();
                        manager.addSanPham(new BangDia(id, name, description, manufacturer, price, duration));
                    } else {
                        System.out.println("Loại sản phẩm không hợp lệ.");
                    }
                }
                case 2 -> {
                    System.out.print("Nhập mã sản phẩm cần xoá: ");
                    String id = scanner.nextLine();
                    manager.removeProductById(id);
                }
                case 3 -> {
                    System.out.print("Nhập mã sản phẩm cần cập nhật: ");
                    String id = scanner.nextLine();
                    System.out.print("Nhập tên mới (bỏ qua nếu không cập nhật): ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập mô tả mới (bỏ qua nếu không cập nhật): ");
                    String description = scanner.nextLine();
                    System.out.print("Nhập giá mới (nhập -1 nếu không cập nhật): ");
                    double price = scanner.nextDouble();
                    manager.updateProduct(id, name.isEmpty() ? null : name, description.isEmpty() ? null : description,
                            price);
                }
                case 4 -> {
                    System.out.print("Nhập từ khoá tìm kiếm: ");
                    String keyword = scanner.nextLine();
                    manager.searchProduct(keyword);
                }
                case 5 -> {
                    manager.sortProductsByPriceDesc();
                    System.out.println("Sản phẩm đã được sắp xếp.");
                }
                case 6 -> manager.displayAllProducts();
                case 7 -> System.out.println("Thoát chương trình.");
                default -> System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 7);

        scanner.close();
    }
}
