# Chương Trình Quản Lý Mua Vé Và Phương Tiện

## Quản Lý Mua Vé

### Thông tin chung
1. **Người học:**
   - Loại: Sinh viên, học sinh.
   - Thông tin vé bao gồm:
     - Mã sinh viên: `STUD-<số nguyên 5 chữ số>`.
     - Họ tên.
     - Ngày sinh.
     - Trường.
2. **Loại vé:**
   - **Vé tháng:**
     - 70k/vé nếu mua trước ngày 15.
     - 35k/vé nếu mua sau ngày 15.
   - **Vé năm:**
     - 1200k/vé nếu mua trước tháng 6.
     - 650k/vé nếu mua từ tháng 6 trở đi.

### Chức năng
1. **Sinh viên mua vé.**
2. **In danh sách người học sinh trong tháng 12.**
3. **Hiển thị danh sách vé của một người học bằng mã số.**
4. **Tìm kiếm người học theo mã số.**
5. **In danh sách người học mua vé trong năm 2024.**
6. **Sắp xếp người học giảm dần theo năm sinh, nếu trùng năm sinh thì tăng dần theo tên.**
7. **Thêm người học và in danh sách người học có tháng sinh trong tháng 12.**

---

## Quản Lý Phương Tiện

### Thông tin chung
1. **Phương tiện:**
   - Thuộc tính chung:
     - Mã phương tiện: `TRAN-<số nguyên 5 chữ số>`.
     - Tên phương tiện.
     - Năm sản xuất.
     - Ngày đưa vào hoạt động.
     - Hãng.
     - Nhiên liệu (xăng, điện, ...).
   - **Taxi:**
     - Số ghế.
     - Khu vực hoạt động.
   - **Bus:**
     - Số ghế.
     - Tuyến.
   - **Tàu điện:**
     - Số toa.
     - Điểm đón, điểm đến.

2. **Khách hàng:**
   - Thuộc tính:
     - Tên.
     - Giới tính.
     - Danh sách phương tiện yêu thích.

### Chức năng
1. **Thêm, xóa phương tiện.**
2. **Hiển thị danh sách phương tiện đưa vào hoạt động dưới 20 năm.**
3. **Cho khách hàng thêm phương tiện vào danh sách yêu thích, có thể thêm nhiều phương tiện. In danh sách khách hàng yêu thích tàu điện.**
4. **Hiển thị những phương tiện có trên 2 người thích.**
5. **Sắp xếp danh sách phương tiện giảm dần theo số lượt yêu thích. Nếu trùng số lượt yêu thích, sắp tăng dần theo mã phương tiện.**

