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

    @Override
    public String toString() {
        return "Reservation [reservationId=" + reservationId + ", accId=" + accId + ", roomId=" + roomId + ", checkin="
                + checkin + ", checkout=" + checkout + "]";
    }

    
}
