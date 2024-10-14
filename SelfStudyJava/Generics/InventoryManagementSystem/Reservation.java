package InventoryManagementSystem;

import java.util.Date;

public class Reservation {
    private MediaItem<?> item;
    private User user;
    private Date reservationDate;

    public Reservation(MediaItem<?> item, User user, Date reservationDate) {
        this.item = item;
        this.user = user;
        this.reservationDate = reservationDate;
    }

    public MediaItem<?> getItem() {
        return item;
    }

    public User getUser() {
        return user;
    }

    public Date getReservationDate() {
        return reservationDate;
    }
}
