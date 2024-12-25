package OU_Exercise.MidTerm.Easy;

import java.time.LocalDate;

public class CardYear extends LibaryCard{
    private double price;

    public CardYear(LocalDate registrationDate, LocalDate expirationDate) {
        super(registrationDate, expirationDate);
        this.price = isCheckValid() ? 350000 : 250000;
    }

    @Override
    public boolean isCheckValid(){
        if(this.getRegistrationDate().isBefore(LocalDate.of(LocalDate.now().getYear(), 8, 15)) ){
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
