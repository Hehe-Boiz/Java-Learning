# Đề Thi Thực Hành: Hệ Thống Quản Lý Đặt Phòng Khách Sạn

## Mô tả nghiệp vụ
Xây dựng hệ thống quản lý đặt phòng cho một chuỗi khách sạn với các yêu cầu sau:

### Thông tin Khách sạn
- Mỗi khách sạn có mã định danh duy nhất theo format HOTEL-XXXXX (X là số, tự động tăng)
- Thông tin cơ bản: tên, địa chỉ, số sao (3-5 sao), năm thành lập
- Có danh sách các phòng thuộc khách sạn

### Thông tin Phòng
- Mã phòng theo format: ROOM-XXXXX (X là số, tự động tăng)
- Có 3 loại phòng: Standard, Deluxe, Suite
- Mỗi loại phòng có các thuộc tính riêng:
  - Standard: diện tích, số giường đơn
  - Deluxe: diện tích, số giường đôi, có ban công (boolean)
  - Suite: diện tích, số phòng ngủ, có bếp (boolean)
- Giá phòng được tính theo công thức:
  - Standard: 500,000đ/đêm + (100,000đ × số giường)
  - Deluxe: 1,200,000đ/đêm + (200,000đ × số giường) + 300,000đ nếu có ban công
  - Suite: 2,000,000đ/đêm + (500,000đ × số phòng ngủ) + 500,000đ nếu có bếp

### Thông tin Khách hàng
- Có 2 loại khách hàng: trong nước và quốc tế
- Thông tin chung: mã KH (CUST-XXXXX), họ tên, email, số điện thoại, ngày sinh
- Khách trong nước: số CCCD
- Khách quốc tế: số hộ chiếu, quốc tịch, ngày hết hạn visa

### Đặt phòng
- Mã đặt phòng: BOOK-XXXXX
- Thông tin: ngày check-in, ngày check-out, trạng thái (đã đặt/đã hủy/đã check-in/đã check-out)
- Một khách hàng có thể đặt nhiều phòng trong cùng một lần đặt
- Khách hàng phải trên 18 tuổi
- Thời gian đặt phòng tối thiểu 1 đêm, tối đa 30 đêm
- Phải đặt trước ít nhất 1 ngày

## Yêu cầu chức năng
1. Thêm mới khách sạn và phòng với đầy đủ thông tin
2. Hiển thị danh sách các phòng trống theo khách sạn và loại phòng trong khoảng thời gian cụ thể
3. Đặt phòng cho khách hàng với các ràng buộc:
   - Kiểm tra độ tuổi
   - Kiểm tra visa còn hạn (với khách quốc tế)
   - Kiểm tra phòng có trống trong thời gian đặt
4. Thống kê doanh thu theo khách sạn trong khoảng thời gian
5. Hiển thị lịch sử đặt phòng của một khách hàng
6. Tìm kiếm các phòng thỏa mãn tiêu chí (loại phòng, giá, thời gian)
7. Sắp xếp danh sách đặt phòng:
   - Giảm dần theo tổng tiền
   - Nếu cùng tổng tiền thì tăng dần theo ngày đặt
8. Xuất báo cáo tỷ lệ lấp đầy phòng của từng khách sạn theo tháng

## Yêu cầu kỹ thuật
1. Áp dụng đúng các nguyên tắc OOP
2. Sử dụng Collection Framework phù hợp
3. Xử lý ngoại lệ cho các trường hợp đặc biệt
4. Tổ chức code theo các package hợp lý
5. Áp dụng các design pattern phù hợp (ít nhất Factory và Strategy)
