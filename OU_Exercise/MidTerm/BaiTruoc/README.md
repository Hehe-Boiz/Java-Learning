# Tài Liệu Yêu Cầu Hệ Thống

## 1. Hệ Thống Quản Lý Vé Tàu

### Thông Tin Người Học
- Đối tượng: Sinh viên và học sinh (gọi chung là người học)
- Định dạng mã sinh viên: `STUD-XXXXX` (số nguyên 5 chữ số tăng dần)
- Thông tin cơ bản bao gồm:
  - Mã sinh viên
  - Họ tên
  - Ngày sinh
  - Tên trường

### Loại Vé
1. Thông tin cơ bản:
   - Mã vé
   - Ngày mua vé
   - Ngày hết hạn 
2. Vé Tháng
   - Giá: 70.000đ/vé nếu mua trước ngày 15
   - Giá: 35.000đ/vé nếu mua sau ngày 15

3. Vé Năm
   - Giá: 1.200.000đ/vé nếu mua trước tháng 6
   - Giá: 650.000đ/vé nếu mua sau tháng 6

### Chức Năng Yêu Cầu
1. Sinh viên mua vé
2. In danh sách người học trong tháng 12
3. Hiển thị danh sách vé của một người học bằng mã số
4. Tìm kiếm người học theo mã số
5. In danh sách người học mua vé trong năm 2024
6. Sắp xếp:
   - Giảm dần theo năm sinh
   - Nếu cùng năm sinh thì tăng dần theo tên
7. Thêm người học và xuất người học có tháng sinh trong tháng 12

## 2. Hệ Thống Quản Lý Phương Tiện

### Lớp Phương Tiện Cơ Bản
- Định dạng mã phương tiện: `TRAN-XXXXX` (số nguyên 5 chữ số tự tăng)
- Thuộc tính chung:
  - Mã phương tiện
  - Tên phương tiện
  - Năm sản xuất
  - Ngày đưa vào hoạt động
  - Hãng sản xuất
  - Nhiên liệu (điện, xăng,...)

### Các Loại Phương Tiện
1. Taxi
   - Số ghế
   - Khu vực hoạt động

2. Bus
   - Số ghế
   - Tuyến

3. Tàu Điện
   - Số toa
   - Điểm đón
   - Điểm đến

### Lớp Khách Hàng
- Thuộc tính:
  - Tên
  - Giới tính
  - Danh sách phương tiện yêu thích

### Chức Năng Yêu Cầu
1. Thêm xóa phương tiện
2. Hiển thị danh sách phương tiện đưa vào hoạt động dưới 20 năm
3. Quản lý phương tiện yêu thích:
   - Thêm nhiều phương tiện vào danh sách yêu thích
   - In danh sách khách hàng có yêu thích tàu điện
4. Hiển thị những phương tiện có trên 2 người thích
5. Sắp xếp:
   - Giảm dần theo số lượt yêu thích
   - Nếu cùng số lượt yêu thích thì xếp tăng theo mã

## 3. Hệ Thống Đánh Giá Sinh Viên OU

### Mô tả: 
Để đảm bảo chất lượng đào tạo, trường Đại học OU đều thực hiện khảo sát sinh viên để phản hồi ý kiến về tổ chức đào tạo. Sinh viên bao gồm thông tin MSSV, họ tên, giới tính, ngày sinh. Sinh viên có thể thực hiện nhiều đánh giá trong học kỳ, mỗi đánh giá ghi nhận mã đánh giá (tự nguyên tăng tự động), nội dung đánh giá, sinh viên thực hiện đánh giá, ngày thực hiện đánh giá học kỳ và năm học thực hiện đánh giá. Hiện tại, sinh viên có thể thực hiện các đánh giá thuộc hai nhóm chính:
   - Đánh giá giảng viên: với đánh giá này, sinh viên cần chọn thông tin giảng viên đánh giá, điểm đánh giá (trên thang 4), mỗi giảng viên gồm thông tin mã giảng viên, họ tên, giới tính, ngày sinh.
   - Đánh giá cơ sở vật chất: với đánh giá này tên cơ sở được đánh giá (VVT, HHL, NH).
### Chức Năng Yêu Cầu
1. Hiển thị danh sách đánh giá trong học kỳ và năm học chỉ định
2. Thêm đánh giá mới (giảng viên hoặc cơ sở vật chất)
3. Xác định danh sách đánh giá cơ sở vật chất tại NH trong học kỳ chỉ định
4. Tính điểm trung bình giảng viên trong học kỳ chỉ định
5. Sắp xếp sinh viên:
   - Giảm dần theo năm sinh
   - Nếu cùng năm sinh thì tăng dần theo họ tên

### Lưu Ý Triển Khai
- Phải kiểm tra tất cả chức năng trong hàm main
- Định dạng ngày tháng: dd/MM/yyyy
