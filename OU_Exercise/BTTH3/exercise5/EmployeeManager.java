package exercise5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addEmployee(Employee... employee){
        employees.addAll(Arrays.asList(employee));
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void addEmployee() {
        System.out.println("Nhập thông tin nhân viên:");
        System.out.print("CMND: ");
        String cmnd = sc.nextLine();
        System.out.print("Họ tên: ");
        String hoTen = sc.nextLine();
        System.out.print("Quê quán: ");
        String queQuan = sc.nextLine();
        System.out.print("Giới tính: ");
        String gioiTinh = sc.nextLine();
        System.out.print("Số điện thoại: ");
        int soDienThoai = Integer.parseInt(sc.nextLine());
        System.out.print("Bộ phận (A/B/C/D): ");
        String boPhan = sc.nextLine();
        
        Employee nhanVien = null;
        switch (boPhan.toUpperCase()) {
            case "A":
                nhanVien = new DepartmentA(cmnd, hoTen, gioiTinh, soDienThoai, queQuan, boPhan);
                break;
            case "B":
                nhanVien = new DepartmentB(cmnd, hoTen, gioiTinh, soDienThoai, queQuan, boPhan);
                break;
            case "C":
                nhanVien = new DepartmentC(cmnd, hoTen, gioiTinh, soDienThoai, queQuan, boPhan);
                break;
            case "D":
                System.out.print("Nhập phụ cấp: ");
                double phuCap = sc.nextDouble();
                sc.nextLine(); // Consume newline
                nhanVien = new DepartmentD(cmnd, hoTen, gioiTinh, soDienThoai, queQuan, boPhan, phuCap);
                break;
            case "":
                nhanVien = new RegularEmployee(cmnd, hoTen, gioiTinh, soDienThoai, queQuan);
                break;
            default:
                System.out.println("Bộ phận không hợp lệ!");
                return;
        }
        
        employees.add(nhanVien);
        System.out.println("Thêm nhân viên thành công!");
    }

    public void display(){
        employees.stream().forEach(employee -> System.out.println(employee.toString()));
    }

    public void searchEmployee(String keyWord){
        Employee result = employees.stream()
            .filter(employee -> employee.getHometown().equals(keyWord) || 
                               employee.getName().equals(keyWord) || 
                               employee.getCCCD().equals(keyWord))
            .findFirst()
            .orElse(null);
        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("Không tìm thấy nhân viên!");
        }
    }

    public void calculateSalaries() {
        for (Employee employee : employees) {
            System.out.print("Enter working days for " + employee.getName() + ": ");
            int workingDays = Integer.parseInt(sc.nextLine());
            double salary = employee.tinhLuong(workingDays);
            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName() + ", Working Days: " + workingDays + ", Salary: " + salary);
        }
    }

    public void xoaNhanVien() {
        System.out.print("Nhập CMND nhân viên cần xóa: ");
        String cmnd = sc.nextLine();
        
        employees.removeIf(nv -> nv.getCCCD().equals(cmnd));
        System.out.println("Đã xóa nhân viên có CMND: " + cmnd);
    }

    public void menu() {
        while (true) {
            System.out.println("\n--- QUẢN LÝ NHÂN VIÊN CÔNG TY XYZ ---");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Xóa nhân viên");
            System.out.println("3. Tra cứu nhân viên");
            System.out.println("4. Hiển thị danh sách nhân viên");
            System.out.println("5. Tính lương nhân viên");
            System.out.println("6. Thoát");
            
            System.out.print("Nhập lựa chọn: ");
            String luaChon = sc.nextLine();
            
            switch (luaChon) {
                case "1":
                    addEmployee();
                    break;
                case "2":
                    xoaNhanVien();
                    break;
                case "3":
                    System.out.println("Mời bạn nhập tiêu chí: ");
                    String keyWord = sc.nextLine();
                    searchEmployee(keyWord);
                    break;
                case "4":
                    display();
                    break;
                case "5":
                    calculateSalaries();
                    break;
                case "6":
                    System.out.println("Kết thúc chương trình!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
