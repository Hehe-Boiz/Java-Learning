package OU_Exercise.MidTerm.EasyMedium;

import java.time.LocalDate;

public class Foreigner extends Customer{
    private String passport;
    private String nationality;
    private LocalDate visaExpirationDate;

    public Foreigner(String fullname, String email, String sdt, String brithDate, String passport, String nationality,
            String visaExpirationDate) {
        super(fullname, email, sdt, brithDate);
        this.passport = passport;
        this.nationality = nationality;
        this.visaExpirationDate = LocalDate.parse(visaExpirationDate, Config.FORMATTER);
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public LocalDate getVisaExpirationDate() {
        return visaExpirationDate;
    }

    public void setVisaExpirationDate(LocalDate visaExpirationDate) {
        this.visaExpirationDate = visaExpirationDate;
    }
}
