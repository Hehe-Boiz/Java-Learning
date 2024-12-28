package OU_Exercise.MidTerm.BaiTruoc.TrainTicket;

import java.time.LocalDate;
import java.util.HashMap;

public abstract class Ticket {
    private static int count = 0;
    private String id;
    private LocalDate purchaseDate;
    private LocalDate expirationDate;

    public Ticket(String purchaseDate) {
        this.id = String.format("TUD-%05d", ++count);
        this.purchaseDate = LocalDate.parse(purchaseDate, Config.FORMATTER);
        this.expirationDate = plusDay();
    }

    public String getId() {
        return id;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
    
    protected abstract double getPriceMonth();

    @Override
    public String toString() {
        return  "id=" + id + ", purchaseDate=" + purchaseDate + ", expirationDate=" + expirationDate;
    }
    
    public abstract LocalDate plusDay();

}
