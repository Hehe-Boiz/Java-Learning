package BTTH3.exercise3;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    List<SanPham> products = new ArrayList<>();

    public void addSanPham(SanPham sp) {
        products.add(sp);
    }

    public void removeProductById(String id) {
        products.removeIf(product -> product.getId().equalsIgnoreCase(id));
    }

    public void updateProduct(String id, String name, String description, double price) {
        for (SanPham product : products) {
            if (product.getId().equalsIgnoreCase(id)) {
                if (name != null)
                    product.setName(name);
                if (description != null)
                    product.setDescribe(description);
                if (price > 0)
                    product.setPrice(price);
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm với mã: " + id);
    }

    public void searchProduct(String keyword) {
        for (SanPham product : products) {
            if (product instanceof Sach) {
                Sach pr = (Sach) product;
                if (pr.getName().contains(keyword) || pr.getDescribe().contains(keyword)) {
                    product.displayInfo();
                    System.out.println();
                }
            }

            else if (product instanceof BangDia) {
                BangDia pr = (BangDia) product;
                if (pr.getName().contains(keyword) || pr.getDescribe().contains(keyword)) {
                    product.displayInfo();
                    System.out.println();
                }
            }
        }
    }

    public void searchProduct(double minPrice, double maxPrice) {
        for (SanPham product : products) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                product.displayInfo();
                System.out.println();
            }
        }
    }

    public void sortProductsByPriceDesc() {
        products.sort((p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()));
    }

    public void displayAllProducts() {
        for (SanPham product : products) {
            product.displayInfo();
            System.out.println();
        }
    }
}
