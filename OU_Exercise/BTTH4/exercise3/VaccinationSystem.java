package exercise3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class VaccinationSystem {
    private static List<Vaccine> listVaccines = new ArrayList<>();
    private static List<Person> listPersons = new ArrayList<>();

    public void displayVacciens() {
        listVaccines.forEach(v -> System.out.println(v));
    }

    public void displayForeigner() {
        listPersons.stream().filter(p -> p instanceof Foreigner).forEach(f -> System.out.println(f));
    }

    public void recordVaccination(String CCCD, int id, String local) {
        if (CCCD == null || CCCD.isEmpty() || local == null || local.isEmpty()) {
            System.out.println("Thông tin không hợp lệ!");
            return;
        }
        Vaccine vac = listVaccines.stream().filter(v -> v.getId() == id).findFirst().orElse(null);
        if (vac == null || vac.getSoLuong() <= 0)
            return;

        Person person = listPersons.stream().filter(p -> p.getCCCD().equals(CCCD)).findFirst().orElse(null);
        if (person == null || !person.canGetNextVaccination())
            return;

        if (person.getVaccinations() == null) {
            person.setVaccinations(new ArrayList<>());
        }
        person.getVaccinations().add(new Vaccination(vac, LocalDate.now(), local));
        vac.setSoLuong(vac.getSoLuong() - 1);
        vac.setUsedCount(vac.getUsedCount() + 1);
    }

    public void displayPeopleWithMultipleVaccinations() {
        System.out.println("\nDanh sách người đã tiêm từ 2 mũi trở lên:");

        listPersons.stream().filter(p -> p.getVaccinations().size() >= 2).forEach(p -> {
            System.out.println(p);
            p.getVaccinations().forEach(v -> System.out.println(v));
        });
    }

    public boolean checkVaccinationEligibility(String CCCD){
        Person p =listPersons.stream().filter(per->per.getCCCD().equals(CCCD)).findFirst().orElse(null);
        if (p == null) return false;

        return p.canGetNextVaccination();
    }

    public void sortVaccine(){
        listVaccines.sort(Comparator.comparing(Vaccine::getXuatXu).thenComparing(Vaccine::getUsedCount, Comparator.reverseOrder()));
    }

    public void addSampleData() {
        // Thêm vắc xin
        listVaccines.add(new Vaccine("AstraZeneca", "Anh", 1000));
        listVaccines.add(new Vaccine("Pfizer", "Mỹ", 2000));
        listVaccines.add(new Vaccine("Moderna", "Mỹ", 1500));
        listVaccines.add(new Vaccine("Sinopharm", "Trung Quốc", 3000));

        // Thêm người Việt Nam
        Person vietnamese = new Vietnamese("123456789", "Nguyễn Văn A", "Nam", 
            "0123456789", LocalDate.of(1990, 1, 1));
        listPersons.add(vietnamese);

        // Thêm người nước ngoài
        Foreigner foreigner = new Foreigner("987654321", "John Smith", "Nam",
            "0987654321", LocalDate.of(1985, 6, 15),
            "AB123456", "Mỹ");
        listPersons.add(foreigner);
    }

    public static List<Vaccine> getListVaccines() {
        return listVaccines;
    }

    public static void setListVaccines(List<Vaccine> listVaccines) {
        VaccinationSystem.listVaccines = listVaccines;
    }

    public static List<Person> getListPersons() {
        return listPersons;
    }

    public static void setListPersons(List<Person> listPersons) {
        VaccinationSystem.listPersons = listPersons;
    }

    
}
