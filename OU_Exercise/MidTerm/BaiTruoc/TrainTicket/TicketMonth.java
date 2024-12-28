package OU_Exercise.MidTerm.BaiTruoc.TrainTicket;

import java.time.LocalDate;

public class TicketMonth extends Ticket{
    private double price;

    public TicketMonth(String purchaseDate) {
        super(purchaseDate);
        this.price = getPriceMonth();
    }
    
    @Override
    protected double getPriceMonth(){
        if(this.getPurchaseDate().isBefore(LocalDate.of(LocalDate.now().getYear(), LocalDate.now().getMonthValue(), 15))){
            return 70000;
        }
        return 35000;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TicketMonth{" + super.toString() + "price=" + price + '}';
    }

    @Override
    public LocalDate plusDay() {
        return this.getPurchaseDate().plusMonths(1);
    }
    
    
}
