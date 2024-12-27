
package OU_Exercise.MidTerm.BaiTruoc;

import java.time.LocalDate;

public class TicketYear extends Ticket{
    private double price;

    public TicketYear(String purchaseDate) {
        super(purchaseDate);
        this.price = price;
    }

    @Override
    protected double getPriceMonth() {
        if(this.getExpirationDate().getMonthValue() < LocalDate.now().getMonthValue()){
            return 1200000;
        }
        return 650000;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TicketYear{" + super.toString() + "price=" + price + '}';
    }

    @Override
    public LocalDate plusDay() {
        return this.getPurchaseDate().plusYears(1);
    }
    
    
}
