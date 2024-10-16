package restaurantManagementSystem;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo và cấu hình nhà hàng
        RestaurantConfig config = RestaurantConfig.getInstance();
        config.setRestaurantInfo("Nhà hàng Ngon", "123 Đường ABC, TP.HCM", "0123456789");

        // Tạo các món ăn bằng DishFactory
        Dish appetizer1 = DishFactory.createDish("appetizer", "Gỏi cuốn", 50000, "Gỏi cuốn tôm thịt");
        Dish appetizer2 = DishFactory.createDish("appetizer", "Chả giò", 40000, "Chả giò rán giòn");
        Dish mainCourse1 = DishFactory.createDish("maincourse", "Phở bò", 75000, "Phở bò tái nạm");
        Dish mainCourse2 = DishFactory.createDish("maincourse", "Cơm gà", 65000, "Cơm gà xối mỡ");
        Dish dessert1 = DishFactory.createDish("dessert", "Chè thái", 30000, "Chè thái nhiều topping");
        Dish dessert2 = DishFactory.createDish("dessert", "Trái cây", 25000, "Đĩa trái cây tổng hợp");

        // Tạo menu và thêm món ăn vào menu
        Menu menu = new Menu();
        menu.addDish(appetizer1);
        menu.addDish(appetizer2);
        menu.addDish(mainCourse1);
        menu.addDish(mainCourse2);
        menu.addDish(dessert1);
        menu.addDish(dessert2);

        // In ra toàn bộ menu
        System.out.println("===== MENU NHÀ HÀNG =====");
        for (Dish dish : menu.getAllDishes()) {
            System.out.printf("%s - %,d VND - %s%n", dish.getName(), (int)dish.getPrice(), dish.getDescription());
        }

        // Tạo một đơn hàng mới
        Order order = new Order();
        order.addDish(appetizer1);
        order.addDish(mainCourse1);
        order.addDish(dessert1);

        // In ra thông tin đơn hàng
        System.out.println("\n===== ĐƠN HÀNG =====");
        for (Dish dish : order.getOrderedDishes()) {
            System.out.printf("%s - %,d VND%n", dish.getName(), (int)dish.getPrice());
        }
        System.out.printf("Tổng cộng: %,d VND%n", (int)order.calculateTotalPrice());

        // Tìm món ăn đắt nhất trong menu
        Dish mostExpensiveDish = menu.getAllDishes().stream()
                .max(Comparator.comparing(Dish::getPrice))
                .orElse(null);
        
        if (mostExpensiveDish != null) {
            System.out.printf("%nMón ăn đắt nhất: %s - %,d VND%n", 
                    mostExpensiveDish.getName(), (int)mostExpensiveDish.getPrice());
        }

        // In thông tin nhà hàng
        System.out.println("\n===== THÔNG TIN NHÀ HÀNG =====");
        System.out.println("Tên: " + config.getRestaurantName());
        System.out.println("Địa chỉ: " + config.getAddress());
        System.out.println("Số điện thoại: " + config.getPhoneNumber());
    }
}
