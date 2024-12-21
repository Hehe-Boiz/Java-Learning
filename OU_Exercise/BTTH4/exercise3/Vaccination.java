package exercise3;

import java.time.LocalDate;

public class Vaccination {
    private Vaccine vaccine;
    private LocalDate injectionDate;
    private String local;
    
    public Vaccination(Vaccine vaccine, LocalDate injectionDate, String local) {
        this.vaccine = vaccine;
        this.injectionDate = injectionDate;
        this.local = local;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public LocalDate getInjectionDate() {
        return injectionDate;
    }

    public void setInjectionDate(LocalDate injectionDate) {
        this.injectionDate = injectionDate;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Vaccination: vaccine=" + vaccine + ", injectionDate=" + injectionDate.format(Config.FORMATTER) + ", local=" + local;
    }
}
