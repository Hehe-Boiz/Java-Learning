package exercise3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Person {
    private String CCCD;
    private String name;
    private String gender;
    private String sdt;
    private LocalDate sinh;
    private List<Vaccination> vaccinations;
    
    public Person(String cCCD, String name, String gender, String sdt, LocalDate sinh) {
        CCCD = cCCD;
        this.name = name;
        this.gender = gender;
        this.sdt = sdt;
        this.sinh = sinh;
        this.vaccinations = new ArrayList<>();
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String cCCD) {
        CCCD = cCCD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public LocalDate getSinh() {
        return sinh;
    }

    public void setSinh(LocalDate sinh) {
        this.sinh = sinh;
    }

    public List<Vaccination> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(List<Vaccination> vaccinations) {
        this.vaccinations = vaccinations;
    }

    public int getAge() {
        return LocalDate.now().getYear()-sinh.getYear();
    }

    public boolean canGetNextVaccination() {
        if (vaccinations.size() >= 3) return false;
        if (vaccinations.isEmpty()) return getAge() >= 18;
        
        LocalDate lastVaccinationDate = vaccinations.get(vaccinations.size() - 1).getInjectionDate();
        return (LocalDate.now().getMonth().getValue() - lastVaccinationDate.getMonth().getValue())  >= 3;
    }

    @Override
    public String toString() {
        return "Person: CCCD=" + CCCD + ", name=" + name + ", gender=" + gender + ", sdt=" + sdt + ", sinh=" + sinh
                + ", vaccinations=" + vaccinations;
    }

    
}
