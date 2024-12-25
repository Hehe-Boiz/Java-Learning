# Hệ Thống Quản Lý Thẻ Thư Viện Trường Học

Hệ thống quản lý thẻ thư viện bằng Java dành cho thư viện trường học. Hệ thống quản lý hai đối tượng: học sinh và sinh viên (gọi chung là người học).

## Thông Tin Hệ Thống

### 1. Thông Tin Thẻ Thư Viện và Người Học
- Định dạng mã thẻ: `LIB-XXXXX` (trong đó X là số nguyên 5 chữ số tăng dần)
- Các loại thẻ:
  - Thẻ học kỳ
  - Thẻ năm học
  - Các loại thông tin cơ bản:
    + Mã thẻ
    + Ngày đăng ký
    + Ngày hết hạn
    + Người học
- Người học:
  + Mã thẻ (theo cú pháp: HVSV-<số nguyên tăng dần có 5 chữ số>)
  + Họ tên
  + Ngày sinh
  + Lớp/Khoa

### 2. Cấu Trúc Phí

#### Thẻ Học Kỳ:
- 100.000đ nếu đăng ký trong tuần đầu của học kỳ
- 75.000đ cho các trường hợp còn lại

#### Thẻ Năm Học:
- 350.000đ nếu đăng ký trước 15/8
- 250.000đ cho các trường hợp còn lại

## Chức Năng Chính

### 1. Đăng Ký Thẻ Mới
- Nhập thông tin người học
- Chọn loại thẻ
- Tính phí theo quy định
- Lưu thông tin đăng ký

### 2. Danh Sách Sinh Nhật Tháng 12
- Hiển thị người học có sinh nhật trong tháng 12
- Hiển thị đầy đủ thông tin cá nhân
- Sắp xếp theo ngày sinh

### 3. Lịch Sử Thẻ Người Dùng
- Tìm kiếm theo mã số người học
- Hiển thị tất cả các thẻ đã đăng ký
- Hiển thị chi tiết thẻ và trạng thái hiện tại

### 4. Tìm Kiếm Người Học
- Tìm kiếm theo mã số
- Hiển thị thông tin chi tiết nếu tìm thấy
- Thông báo nếu không tìm thấy

### 5. Danh Sách Đăng Ký Năm 2024
- Lọc theo năm đăng ký 2024
- Hiển thị đầy đủ thông tin người học và thẻ

### 6. Sắp Xếp Danh Sách Người Học
- Sắp xếp giảm dần theo năm sinh
- Nếu cùng năm sinh thì sắp xếp tăng dần theo tên
- Hiển thị danh sách đã sắp xếp

### 7. Quản Lý Sinh Nhật Tháng 12
- Thêm người học mới
- Xuất danh sách người có sinh nhật tháng 12
- Sắp xếp theo ngày sinh trong tháng

## Yêu Cầu Kỹ Thuật

### 1. Lập Trình Hướng Đối Tượng (OOP)
- Cấu trúc lớp:
  - Lớp cơ sở cho người học và thẻ
  - Kế thừa cho các loại thẻ khác nhau
  - Đóng gói dữ liệu phù hợp
  - Sử dụng access modifier phù hợp

### 2. Xử Lý Ngoại Lệ
- Kiểm tra định dạng mã số
- Kiểm tra định dạng ngày tháng
- Xử lý trường hợp không tìm thấy
- Kiểm tra dữ liệu đầu vào

### 3. Sử Dụng Collection Framework
- Sử dụng ArrayList/LinkedList để quản lý dữ liệu
- Triển khai các phương thức Collection cho:
  - Sắp xếp
  - Tìm kiếm
  - Xử lý dữ liệu

### 4. Định Dạng Dữ Liệu
- Định dạng ngày: dd/MM/yyyy
- Định dạng tiền tệ

## Cấu Trúc Thư Mục

```
Easy
├── models
│   ├── Student (Người học)
│   ├── Card (Thẻ)
│   │   ├── SemesterCard (Thẻ học kỳ)
│   │   └── YearCard (Thẻ năm học)
│   └── Department (Lớp/Khoa)
├── services
│   ├── CardService (Dịch vụ quản lý thẻ)
│   ├── StudentService (Dịch vụ quản lý người học)
│   └── ValidationService (Dịch vụ kiểm tra dữ liệu)
└── utils
    ├── DateFormatter (Định dạng ngày)
    └── CurrencyFormatter (Định dạng tiền)
```

## Quy Tắc Kiểm Tra Dữ Liệu

1. Định dạng mã người học: Phải theo mẫu LIB-XXXXX
2. Ngày tháng phải hợp lệ và đúng định dạng
3. Tên không được để trống
4. Thông tin lớp/khoa là bắt buộc

## Xử Lý Lỗi

Hệ thống xử lý các trường hợp lỗi sau:
- Định dạng đầu vào không hợp lệ
- Thiếu thông tin bắt buộc
- Lỗi kiểm tra ngày tháng
- Tìm kiếm với mã không tồn tại

## Phát Triển Tương Lai

1. Tích hợp cơ sở dữ liệu
2. Phát triển giao diện người dùng
3. Tạo báo cáo thống kê
4. Phát triển API
5. Hỗ trợ đa ngôn ngữ
