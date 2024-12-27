# Hệ thống Quản lý Trung tâm Đào tạo Lái xe

## Mô tả dự án
Hệ thống quản lý toàn diện cho trung tâm đào tạo lái xe, bao gồm việc quản lý học viên, giáo viên, khóa học, xe tập lái và lịch học thực hành. Hệ thống được thiết kế để tối ưu hóa quy trình đào tạo và nâng cao chất lượng dịch vụ.

## Cấu trúc hệ thống

### 1. Quản lý Học viên (Student)
- **Định danh**: 
  - Mã học viên: STD-XXXXX (X là số, tự động tăng)
  - Số CCCD/CMND (duy nhất trong hệ thống)

- **Thông tin cá nhân**:
  - Họ tên
  - Ngày sinh
  - Địa chỉ
  - Số điện thoại

- **Thông tin đào tạo**:
  - Hạng bằng đăng ký (B1, B2, C)
  - Trạng thái học viên: PENDING, IN_PROGRESS, COMPLETED, FAILED
  - Danh sách buổi thực hành
  - Kết quả kiểm tra

### 2. Quản lý Giáo viên (Instructor)
- **Định danh**:
  - Mã giáo viên: INS-XXXXX
  - Số CCCD (duy nhất trong hệ thống)

- **Thông tin cá nhân**:
  - Họ tên
  - Ngày sinh
  - Thâm niên (năm)

- **Thông tin chuyên môn**:
  - Danh sách hạng bằng được phép dạy
  - Lịch dạy
  - Tỷ lệ học viên đậu/rớt

### 3. Quản lý Xe tập lái (TrainingCar)
- **Định danh**:
  - Mã xe: CAR-XXXXX

- **Thông tin xe**:
  - Loại xe (số sàn/số tự động)
  - Hạng đào tạo (B1, B2, C)
  - Năm sản xuất
  - Trạng thái: AVAILABLE, IN_USE, MAINTENANCE

- **Thông tin bảo dưỡng**:
  - Lịch bảo dưỡng định kỳ
  - Lịch sử sửa chữa
  - Chi phí bảo dưỡng

### 4. Quản lý Buổi học thực hành (PracticeSession)
- **Định danh**:
  - Mã buổi học: PRC-XXXXX

- **Thông tin buổi học**:
  - Thời gian (ngày và ca học)
  - Học viên tham gia
  - Giáo viên phụ trách
  - Xe được sử dụng
  - Trạng thái: SCHEDULED, COMPLETED, CANCELLED
  - Đánh giá của giáo viên

## Yêu cầu chức năng

### 1. Đăng ký học viên
- Kiểm tra điều kiện đăng ký:
  - B1: ≥18 tuổi
  - B2: ≥20 tuổi
  - C: ≥21 tuổi
- Xác minh không có hồ sơ tại trung tâm khác
- Kiểm tra sức khỏe đủ điều kiện

### 2. Quản lý lịch thực hành
- Mỗi buổi học: 2 tiếng
- Ca học trong ngày:
  - Ca 1: 7:00 - 9:00
  - Ca 2: 9:00 - 11:00
  - Ca 3: 14:00 - 16:00
  - Ca 4: 16:00 - 18:00
- Ràng buộc đăng ký:
  - Không xung đột lịch giáo viên
  - Không xung đột lịch xe
  - Tối đa 2 buổi/ngày/học viên

### 3. Tìm kiếm và thống kê
- **Tìm kiếm**:
  - Học viên theo trạng thái
  - Học viên theo hạng bằng
  - Giáo viên theo chuyên môn

- **Thống kê**:
  - Tỷ lệ đậu/rớt theo giáo viên
  - Số giờ thực hành của học viên
  - Tần suất sử dụng xe
  - Chi phí bảo dưỡng xe

### 4. Sắp xếp và phân tích
- **Sắp xếp**:
  - Giáo viên: theo thâm niên + tỷ lệ học viên đậu
  - Học viên: theo số giờ thực hành + kết quả
  - Xe: theo tần suất sử dụng

- **Phân tích**:
  - Thời gian học trung bình mỗi hạng bằng
  - Hiệu suất giáo viên
  - Chi phí vận hành xe

### 5. Bảo dưỡng xe
- Thông báo tự động lịch bảo dưỡng
- Theo dõi lịch sử sửa chữa
- Báo cáo chi phí bảo dưỡng

## Yêu cầu kỹ thuật

### Nguyên tắc thiết kế
1. Áp dụng nguyên lý SOLID
2. Sử dụng design patterns phù hợp
3. Xử lý ngoại lệ đầy đủ
4. Validation dữ liệu chặt chẽ

### Kiến trúc đề xuất
1. Sử dụng Repository pattern
2. Implement Observer pattern cho hệ thống thông báo
3. Strategy pattern cho tính toán học phí
4. Factory pattern cho khởi tạo đối tượng

### Các mối quan hệ chính
1. Học viên - Buổi học: Một-nhiều
2. Giáo viên - Buổi học: Một-nhiều
3. Xe - Buổi học: Một-nhiều
4. Giáo viên - Hạng bằng: Nhiều-nhiều

## Tiêu chí đánh giá
1. Thiết kế lớp và quan hệ hợp lý
2. Xử lý nghiệp vụ đúng yêu cầu
3. Khả năng mở rộng của hệ thống
4. Chất lượng mã nguồn
5. Xử lý ngoại lệ và validation
