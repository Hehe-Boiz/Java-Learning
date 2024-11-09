# Hệ thống Quản lý Thư viện Đa phương tiện

## Đề bài
Thiết kế và triển khai một hệ thống quản lý thư viện đa phương tiện sử dụng OOP và generic trong Java. Hệ thống này sẽ quản lý các loại tài liệu khác nhau như sách, tạp chí, đĩa CD và DVD.

## Yêu cầu chi tiết

### 1. Interface MediaItem<T>
Tạo một interface generic với các phương thức:
- `String getTitle()`
- `String getAuthor()`
- `int getYear()`
- `T getSpecificInfo()` (thông tin đặc trưng cho từng loại tài liệu)

### 2. Các lớp cụ thể
Tạo các lớp triển khai interface `MediaItem<T>`:
- `Book` (với thông tin về số trang)
- `Magazine` (với thông tin về số phát hành)
- `CD` (với thông tin về thời lượng phát)
- `DVD` (với thông tin về đạo diễn)

### 3. Lớp Library<T>
Tạo một lớp generic `Library<T extends MediaItem<?>>` với các phương thức:
- `void addItem(T item)`
- `void removeItem(T item)`
- `List<T> searchByTitle(String title)`
- `List<T> searchByAuthor(String author)`
- `List<T> searchByYear(int year)`
- `List<T> getItemsByType(Class<? extends MediaItem<?>> type)`

### 4. Phương thức printCatalog
Triển khai phương thức generic để in ra danh mục tất cả các tài liệu, sử dụng interface functional để định dạng thông tin.

### 5. Lớp User
Tạo lớp với các thuộc tính:
- Tên
- ID
- Danh sách các tài liệu đã mượn
- Các phương thức mượn và trả tài liệu

### 6. Hệ thống đặt trước
Triển khai hệ thống đặt trước đơn giản cho các tài liệu đang được mượn.

### 7. Lớp LibraryManager
Tạo lớp để quản lý:
- Hoạt động của thư viện
- Quản lý người dùng
- Quản lý tài liệu

### 8. Xử lý ngoại lệ (Tùy chọn)
Thêm xử lý cho các trường hợp:
- Tài liệu không tồn tại
- Người dùng mượn quá số lượng cho phép
- Các trường hợp khác

### 9. Giao diện dòng lệnh (Tùy chọn)
Triển khai giao diện đơn giản để tương tác với hệ thống.

## Yêu cầu bổ sung

### Thiết kế
- Sử dụng các nguyên tắc SOLID
- Áp dụng ít nhất một mẫu thiết kế (design pattern) phù hợp

### Kiểm thử
- Viết các unit test cho các chức năng chính

## Mục tiêu học tập
Bài tập này giúp thực hành:
- Sử dụng generic trong Java
- Áp dụng các nguyên tắc OOP
- Thiết kế và triển khai các interface và lớp abstract
- Sử dụng các cấu trúc dữ liệu phù hợp
- Xử lý các tình huống phức tạp trong một hệ thống thực tế
