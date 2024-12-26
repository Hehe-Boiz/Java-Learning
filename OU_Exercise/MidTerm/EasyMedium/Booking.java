package OU_Exercise.MidTerm.EasyMedium;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Booking {
    private static int count =0;
    private String id;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private State state;
    private String idHotel;
    private Customer customer;
    private List<Room> rooms;

    public Booking(String checkIn, String checkOut, String state, Customer customer, List<Room> rooms, String idHotel) {
        if(!isCheckEnum(state)){
            throw new IllegalAccessError("Thiết lập trạng thái đã sai");
        }
        if (customer == null || rooms == null || rooms.isEmpty()) {
            throw new IllegalArgumentException("Khách hàng và danh sách phòng không được để trống");
        }
        this.id = String.format("BOOK-%05d", ++count);
        this.checkIn = LocalDate.parse(checkIn, Config.FORMATTER);
        this.checkOut = LocalDate.parse(checkOut, Config.FORMATTER);
        if (!isBookRoomDay() || !isCheckBookBefore1Day()) {
            throw new IllegalAccessError("Thông tin đặt phòng không hợp lệ");
        }
        this.state = State.valueOf(state);
        this.customer = customer;
        this.rooms = rooms;
        this.idHotel= idHotel;
    }
    
    private boolean isCheckEnum(String check) {
        return check.equals("BOOKED") || check.equals("CANCEL") || 
               check.equals("CHECKIN") || check.equals("CHECKOUT");
    }
    
    
    public boolean isOver18YearsOld(){
        return customer.isOver18YearsOld();
    }

    public boolean isBookRoomDay(){
        return ChronoUnit.DAYS.between(checkIn, checkOut) >= 1 && ChronoUnit.DAYS.between(checkIn, checkOut) <=30;
    }

    public boolean isCheckBookBefore1Day(){
        return ChronoUnit.DAYS.between(checkIn, LocalDate.now()) >= 1;
    }

    public String getId() {
        return id;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public String getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(String idHotel) {
        this.idHotel = idHotel;
    }

    public double getSumPrice(){
        return rooms.stream().mapToDouble(r -> r.price((int)ChronoUnit.DAYS.between(checkOut, checkIn))).sum();
    }

    @Override
    public String toString() {
        return "Booking [id=" + id + ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", state=" + state
                + ", idHotel=" + idHotel + ", customer=" + customer + ", rooms=" + rooms + "]";
    }
}
