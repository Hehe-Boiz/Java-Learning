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
        if(!isBookRoomDay()){
            throw new IllegalAccessError("Thời gian ở lại không hợp lí");
        }
        if(!isCheckBookBefore1Day()){
            throw new IllegalAccessError("Đặt phòng trước đó 1 ngày");
        }
        this.id = String.format("BOOK-%05d", ++count);
        this.checkIn = LocalDate.parse(checkIn, Config.FORMATTER);
        this.checkOut = LocalDate.parse(checkOut, Config.FORMATTER);
        this.state = State.valueOf(state);
        this.customer = customer;
        this.rooms = rooms;
        this.idHotel= idHotel;
    }
    
    private boolean isCheckEnum(String check){
        if(check != "BOOKED" || check != "CANCEL" || check != "CHECKIN" || check != "CHECKOUT"){
            return false;
        }
        return true;
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

    
}
