package OU_Exercise.MidTerm.Easy;

import java.time.LocalDate;

public class CardTerm extends LibaryCard{
    private double price;

    public CardTerm(LocalDate registrationDate, LocalDate expirationDate) {
        super(registrationDate, expirationDate);
        this.price = isCheckValid() ? 100000 : 75000;
    }

    @Override
    public boolean isCheckValid(){
        if(this.getRegistrationDate().isBefore(LocalDate.of(LocalDate.now().getYear(), 2, 27)) && this.getRegistrationDate().isAfter(LocalDate.of(LocalDate.now().getYear(), 2, 10))){
            return true;
        }
        else if(this.getRegistrationDate().isAfter(LocalDate.of(LocalDate.now().getYear(), 6, 10)) && this.getRegistrationDate().isBefore(LocalDate.of(LocalDate.now().getYear(), 6, 26))){
            return true;
        }
        else if(this.getRegistrationDate().isAfter(LocalDate.of(LocalDate.now().getYear(), 10, 1)) && this.getRegistrationDate().isBefore(LocalDate.of(LocalDate.now().getYear(), 10, 25))){
            return true;
        }
        return false;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
}
