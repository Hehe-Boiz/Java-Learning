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
    private double totalAmount;

    public Booking(String checkIn, String checkOut, String state, Customer customer, List<Room> rooms, String idHotel) {
        if(!isCheckEnum(state)){
            throw new IllegalAccessError("Thiết lập trạng thái đã sai");
        }
        if (customer == null || rooms == null || rooms.isEmpty()) {
            throw new IllegalArgumentException("Khách hàng và danh sách phòng không được để trống");
        }
        validateBooking(customer, rooms, LocalDate.parse(checkIn, Config.FORMATTER), LocalDate.parse(checkOut, Config.FORMATTER));
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
        calculateTotalAmount();
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

    private void validateBooking(Customer customer, List<Room> rooms, 
                               LocalDate checkInDate, LocalDate checkOutDate) {
        if (!customer.isOver18YearsOld()) {
            throw new CustomerValidationException("Khách hàng phải trên 18 tuổi");
        }

        if (customer instanceof Foreigner ic && !ic.hasValidVisa()) {
            throw new CustomerValidationException("Visa của khách quốc tế đã hết hạn");
        }

        long days = checkInDate.until(checkOutDate).getDays();
        if (days < Config.MIN_BOOKING_DAYS || days > Config.MAX_BOOKING_DAYS) {
            throw new InvalidDateRangeException(
                "Thời gian đặt phòng phải từ 1 đến 30 ngày");
        }

        if (LocalDate.now().plusDays(Config.MIN_ADVANCE_BOOKING_DAYS).isAfter(checkInDate)) {
            throw new InvalidDateRangeException(
                "Phải đặt phòng trước ít nhất 1 ngày");
        }
    }

    private void calculateTotalAmount() {
        long days = checkIn.until(checkOut).getDays();
        this.totalAmount = rooms.stream()
                               .mapToDouble(r -> r.price((int)ChronoUnit.DAYS.between(checkIn, checkOut)))
                               .sum() * days;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    
}
