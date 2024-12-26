package OU_Exercise.MidTerm.EasyMedium;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookingService {
    private List<Customer> customers = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();
    private Map<String, List<RangeTime>> booksRoom = new HashMap<>();

    public void displayRoom(List<Hotel> hotels, String phong, RangeTime time, String idHotels)
            throws ClassNotFoundException {
        Class c = Class.forName(phong);

        Hotel hotel = hotels.stream().filter(h -> h.getId().equals(idHotels)).findFirst().orElse(null);
        if (hotel == null) {
            throw new IllegalAccessError("Không tìm thấy khách sạn cần hiện");
        }

        hotel.getList().stream().filter(r -> c.isInstance(r))
                .filter(r -> !booksRoom.containsKey(r.getId())
                        || booksRoom.get(r.getId()).stream().anyMatch(range -> range.overlaps(time)))
                .forEach(s -> System.out.println(s));
    }

    public void addBooking(String checkIn, String checkOut, String state, Customer customer, String idHotel,
            Room... r) {
        bookings.add(new Booking(checkIn, checkOut, state, customer, Arrays.asList(r), idHotel));
        for (Room room : Arrays.asList(r)) {
            if (isCheckValidRange(room, new RangeTime(checkIn, checkOut))) {
                booksRoom.computeIfAbsent(room.getId(), k -> new ArrayList<>()).add(new RangeTime(checkIn, checkOut));
            }
        }
        customers.add(customer);
    }

    public boolean isCheckValidRange(Room room, RangeTime rangeTime) {
        return !booksRoom.containsKey(room.getId())
                || !booksRoom.get(room.getId()).stream().anyMatch(range -> range.overlaps(rangeTime));
    }

    public void displayHistoryCustomer(String msCustomer) {
        List<Booking> booking = bookings.stream().filter(b -> b.getCustomer().getId().equals(msCustomer))
                .collect(Collectors.toList());
        if (booking == null) {
            throw new IllegalAccessError("Khách hàng này chưa đặt lần nào");
        }

        booking.forEach(b -> System.out.println(b));
    }

    public void sortBooking() {
        bookings.sort(Comparator.comparing(Booking::getSumPrice).reversed().thenComparing(Booking::getCheckIn));
    }

    public double calculateRevenue(String msHotel, LocalDate start, LocalDate end) {
        List<Booking> booking = bookings.stream().filter(b -> b.getIdHotel().equals(msHotel))
                .filter(br -> (br.getCheckIn().isAfter(start) && br.getCheckIn().isBefore(end))
                        || (br.getCheckOut().isAfter(start) && br.getCheckOut().isBefore(end)))
                .collect(Collectors.toList());
        if (booking == null) {
            throw new IllegalAccessError(
                    "Khách sạn này không có doanh thu trong thời gian này hoặc khách sạn này không tồn tại");
        }

        return booking.stream().mapToDouble(b -> b.getSumPrice()).sum();
    }

    public double reportRate(Hotel hotel, LocalDate start, LocalDate end) {
        return bookings.stream()
                .filter(br -> br.getIdHotel().equals(hotel.getId())
                        && (br.getCheckIn().isAfter(start) && br.getCheckIn().isBefore(end))
                        || (br.getCheckOut().isAfter(start) && br.getCheckOut().isBefore(end)))
                .flatMap(b -> b.getRooms().stream()).distinct().count() / hotel.getList().size();
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public Map<String, List<RangeTime>> getBooksRoom() {
        return booksRoom;
    }

    public void setBooksRoom(Map<String, List<RangeTime>> booksRoom) {
        this.booksRoom = booksRoom;
    }

    
}
