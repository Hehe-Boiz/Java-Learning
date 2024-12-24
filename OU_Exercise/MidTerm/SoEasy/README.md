# Hệ Thống Quản Lý

Dự án này bao gồm ba hệ thống quản lý riêng biệt: Quản lý Thư viện, Quản lý Khách sạn, và Quản lý Sinh viên.

## 1. Quản Lý Thư Viện

### Mô tả
Hệ thống quản lý thư viện cho phép theo dõi sách và người mượn, quản lý việc mượn trả sách và kiểm soát số lượng sách trong thư viện.

### Cấu trúc dữ liệu

#### Sách
- Mã sách
- Tên sách
- Tác giả
- Thể loại
- Số lượng

#### Người mượn
- Số CCCD
- Họ tên
- Ngày sinh
- Danh sách mã sách đã mượn

### Chức năng chính
1. Hiển thị danh sách sách trong thư viện
2. Hiển thị danh sách người mượn và sách đã mượn
3. Quản lý thông tin sách:
   - Thêm sách mới
   - Cập nhật số lượng sách
4. Kiểm tra điều kiện mượn sách (tối đa 3 cuốn)
5. Sắp xếp sách theo số lượng giảm dần
6. Cảnh báo sách sắp hết (số lượng ≤ 5)

## 2. Quản Lý Khách Sạn

### Mô tả
Hệ thống quản lý khách sạn giúp theo dõi tình trạng phòng, quản lý thông tin khách hàng và tính toán chi phí thuê phòng.

### Cấu trúc dữ liệu

#### Phòng
- Mã phòng
- Loại phòng (đơn/đôi)
- Giá thuê
- Trạng thái (có người/không)

#### Khách
- Số CCCD
- Họ tên
- Ngày nhận phòng
- Mã phòng
- Số ngày ở

### Chức năng chính
1. Hiển thị danh sách phòng trống
2. Quản lý đặt phòng:
   - Thêm thông tin khách thuê
   - Tính tổng tiền thuê phòng
3. Hiển thị danh sách khách đã trả phòng
4. Tìm kiếm phòng theo:
   - Loại phòng
   - Trạng thái

## 3. Quản Lý Sinh Viên và Môn Học

### Mô tả
Hệ thống quản lý sinh viên và môn học giúp theo dõi việc đăng ký môn học của sinh viên và quản lý thông tin môn học.

### Cấu trúc dữ liệu

#### Sinh viên
- Mã sinh viên
- Họ tên
- Lớp
- Danh sách môn học đã đăng ký

#### Môn học
- Mã môn
- Tên môn
- Số tín chỉ
- Số lượng sinh viên tối đa

### Chức năng chính
1. Hiển thị thông tin:
   - Danh sách sinh viên
   - Môn học đã đăng ký
2. Quản lý dữ liệu:
   - Thêm sinh viên mới
   - Cập nhật thông tin môn học
3. Kiểm tra số tín chỉ đăng ký (tối thiểu 12 tín chỉ)
4. Hiển thị môn học chưa đủ sinh viên đăng ký

