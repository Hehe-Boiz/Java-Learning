# Bài tập thực hành OOP: Hệ thống quản lý Nhà hàng

## Mô tả

Bạn được yêu cầu phát triển một hệ thống quản lý đơn giản cho một chuỗi nhà hàng. Hệ thống này cần áp dụng Singleton Pattern cho việc quản lý cấu hình toàn cục và Factory Method Pattern cho việc tạo các loại món ăn khác nhau.

## Yêu cầu

1. Sử dụng Singleton Pattern:
   - Tạo một lớp `RestaurantConfig` để lưu trữ các cài đặt toàn cục như tên nhà hàng, địa chỉ, và số điện thoại.
   - Đảm bảo rằng chỉ có một thể hiện của `RestaurantConfig` trong toàn bộ ứng dụng.

2. Sử dụng Factory Method Pattern:
   - Tạo một interface `Dish` đại diện cho các món ăn.
   - Tạo các lớp cụ thể cho các loại món ăn khác nhau (ví dụ: `Appetizer`, `MainCourse`, `Dessert`) kế thừa từ interface `Dish`.
   - Tạo một lớp `DishFactory` với một phương thức factory để tạo ra các đối tượng món ăn dựa trên loại được chỉ định.

3. Chức năng bổ sung:
   - Tạo một lớp `Menu` để quản lý danh sách các món ăn.
   - Tạo một lớp `Order` để đại diện cho đơn hàng của khách hàng.

## Chi tiết các lớp

### 1. RestaurantConfig (Singleton)

Thuộc tính:
- `private static RestaurantConfig instance`
- `private String restaurantName`
- `private String address`
- `private String phoneNumber`

Phương thức:
- `private RestaurantConfig()` (Constructor riêng tư)
- `public static RestaurantConfig getInstance()`
- `public void setRestaurantInfo(String name, String address, String phone)`
- `public String getRestaurantName()`
- `public String getAddress()`
- `public String getPhoneNumber()`

### 2. Dish (Interface)

Phương thức:
- `String getName()`
- `double getPrice()`
- `String getDescription()`

### 3. Appetizer, MainCourse, Dessert (implement Dish)

Thuộc tính:
- `private String name`
- `private double price`
- `private String description`

Phương thức:
- Constructor
- Implement các phương thức từ interface Dish

### 4. DishFactory

Phương thức:
- `public static Dish createDish(String type, String name, double price, String description)`

### 5. Menu

Thuộc tính:
- `private List<Dish> dishes`

Phương thức:
- `public void addDish(Dish dish)`
- `public void removeDish(Dish dish)`
- `public List<Dish> getAllDishes()`
- `public Dish getDishByName(String name)`

### 6. Order

Thuộc tính:
- `private List<Dish> orderedDishes`
- `private double totalPrice`

Phương thức:
- `public void addDish(Dish dish)`
- `public void removeDish(Dish dish)`
- `public List<Dish> getOrderedDishes()`
- `public double calculateTotalPrice()`

## Hướng dẫn thực hiện

1. Triển khai Singleton Pattern:
   - Tạo lớp `RestaurantConfig` với các thuộc tính cần thiết.
   - Sử dụng phương pháp khởi tạo private và cung cấp một phương thức static để truy cập thể hiện duy nhất.

2. Triển khai Factory Method Pattern:
   - Định nghĩa interface `Dish` với các phương thức như `getName()`, `getPrice()`, `getDescription()`.
   - Tạo các lớp con cụ thể cho từng loại món ăn.
   - Tạo lớp `DishFactory` với phương thức `createDish(String type, String name, double price, String description)` để tạo ra các đối tượng món ăn.

3. Triển khai các lớp bổ sung:
   - Tạo lớp `Menu` với các phương thức để thêm, xóa và hiển thị các món ăn.
   - Tạo lớp `Order` để lưu trữ thông tin về đơn hàng của khách hàng.

4. Tạo một lớp `Main` để kiểm tra chức năng của hệ thống:
   - Sử dụng `RestaurantConfig` để thiết lập và truy xuất thông tin nhà hàng.
   - Sử dụng `DishFactory` để tạo ra các món ăn khác nhau.
   - Tạo một `Menu` và thêm các món ăn vào đó.
   - Tạo một `Order` và thêm các món ăn từ menu vào đơn hàng.

## Đánh giá

Bài tập của bạn sẽ được đánh giá dựa trên:
- Việc áp dụng chính xác Singleton Pattern và Factory Method Pattern.
- Tính linh hoạt và khả năng mở rộng của thiết kế.
- Chất lượng và tính rõ ràng của mã nguồn.
- Khả năng xử lý các trường hợp đặc biệt (ví dụ: loại món ăn không tồn tại).
