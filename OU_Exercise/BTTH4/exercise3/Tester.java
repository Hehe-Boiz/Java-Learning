package exercise3;

public class Tester {
    public static void main(String[] args) {
        VaccinationSystem system = new VaccinationSystem();
        system.addSampleData();

        // Test các chức năng
        System.out.println("=== TEST CÁC CHỨC NĂNG ===");
        
        // 1. Hiển thị danh sách vắc xin
        System.out.println("HIỂN THỊ DANH SÁCH VACCINE");
        system.displayVacciens();

        // 2. Hiển thị danh sách người nước ngoài
        System.out.println("DANH SÁCH NGƯỜI NƯỚC NGOÀI");
        system.displayForeigner();

        // 3. Ghi nhận tiêm chủng
        System.out.println("TIÊM CHỦNG");
        system.recordVaccination("123456789", 1, "Bệnh viện A");
        system.recordVaccination("123456789", 2, "Bệnh viện B");
        system.recordVaccination("987654321", 1, "Bệnh viện C");
        system.recordVaccination("123456789", 4, "Bệnh viện B");

        // 4. Hiển thị người đã tiêm từ 2 mũi
        System.out.println("DANH SÁCH NGƯỜI ĐÃ TIÊM 2 LẦN");
        system.displayPeopleWithMultipleVaccinations();

        // 5. Kiểm tra điều kiện tiêm
        System.out.println("KIỂM TRA TIÊM CHỦNG: ");
        System.out.println(system.checkVaccinationEligibility("123456789"));

        // 6. Sắp xếp và hiển thị danh sách vắc xin
        System.out.println("SAU KHI SORT");
        system.sortVaccine();
        system.displayVacciens();;
    }
}
