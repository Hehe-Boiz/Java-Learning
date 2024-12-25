package OU_Exercise.MidTerm.Easy;

import java.time.LocalDate;

public abstract class LibaryCard {
    private static int count =0;
    private String id;
    private LocalDate registrationDate;
    private LocalDate expirationDate;

    public LibaryCard(LocalDate registrationDate, LocalDate expirationDate) {
        this.id = String.format("LIB-%05d", ++count);
        this.registrationDate = registrationDate;
        this.expirationDate = expirationDate;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
    public LocalDate getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
    
    public abstract boolean isCheckValid();
    public boolean isCheckDay(){
        return expirationDate.isBefore(LocalDate.now());
    }

    public boolean isCheckYear2024(){
        return expirationDate.getYear() == 2024;
    }

    @Override
    public String toString() {
        return "LibaryCard: " + id + ", Ngày sinh: " + registrationDate + ", Ngày hết hạn: " + expirationDate ;
    }

    
}
