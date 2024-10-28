package AssignmentRequire;
import java.util.Date;

public class Reservation {
    private int reservationId;
    private int accId;
    private int roomId;
    private Date checkin;
    private Date checkout;
    
    public Reservation(int reservationId, int accId, int roomId, Date checkin, Date checkout) {
        this.reservationId = reservationId;
        this.accId = accId;
        this.roomId = roomId;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        return "Reservation [reservationId=" + reservationId + ", accId=" + accId + ", roomId=" + roomId + ", checkin="
                + checkin + ", checkout=" + checkout + "]";
    }

    
}
