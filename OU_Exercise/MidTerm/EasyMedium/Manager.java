package OU_Exercise.MidTerm.EasyMedium;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Manager {
    private List<Hotel> hotels = new ArrayList<>();
    private Set<Booking> bookings = new HashSet<>();
    private Set<String> bookRoom = new HashSet<>();

    public void addHotel(Hotel hotel, Room ...r){
        hotels.add(hotel);
        hotel.getList().addAll(Arrays.asList(r));
    }

    public void displayRoom(){
        for (Hotel hotel : hotels){
            System.out.println(hotel);
            for(Room r : hotel.getList()){
                if(!bookRoom.contains(hotel.getId()+r.getId())){
                    System.out.println(r);
                }
            }
        }
    }

    public void book(String checkIn, String checkOut, Customer customer, String msHotel, Room ...room){
        if(!customer.isOver18YearsOld()){
            System.out.println("Không đủ tuổi");
            return;
        }
        if(customer instanceof Foreigner){
            Foreigner f = (Foreigner) customer;
            if(f.getVisaExpirationDate().isBefore(LocalDate.now())){
                System.out.println("Hết hạn visa");
                return;
            }
        }

        Hotel hotel = hotels.stream().filter(h -> h.getId().equals(msHotel)).findFirst().orElse(null);
        if(hotel == null){
            System.out.println(" Không tìm thấy khách sạn bạn cần tìm");
            return;
        } 


        for(Room r : room){
            if (bookRoom.contains(hotel.getId()+r.getId())) {
                System.out.println("Phòng đã được đặt trước");
                return;
            }
        }

        bookings.add(new Booking(checkIn, checkOut, "BOOKED", customer, Arrays.asList(room), msHotel));
        for (Room r : room){
            bookRoom.add(hotel.getId()+r.getId());
        }
    }

    public void revenueStatistics(String msHotel, LocalDate start, LocalDate end){
        Booking booking = bookings.stream().filter(b -> b.getIdHotel().equals(msHotel) &&((b.getCheckIn().isAfter(start) && b.getCheckIn().isBefore(end)) || (b.getCheckOut().isAfter(start) && b.getCheckOut().isBefore(end)))).findFirst().orElse(null);
        if(booking == null){
            System.out.println("khách sạn này không có doanh thu");
        }
        double result = booking.getRooms().stream().mapToDouble(r -> r.price((int)ChronoUnit.DAYS.between(booking.getCheckIn(), booking.getCheckOut()))).sum();
        System.out.println("Doanh thu: "+result);
    } 

    public List<Room> searchRoom(String keyword) throws ClassNotFoundException{
        Class c = Class.forName(keyword);
        return hotels.stream().flatMap(h -> h.getList().stream()).filter(r -> c.isInstance(r)).collect(Collectors.toList());
    }

    public List<Room> searchRoom (double start, double end){
        return hotels.stream().flatMap(h -> h.getList().stream()).filter(r -> r.getPrice() >= start && r.getPrice()<=end).collect(Collectors.toList());
    }

    private boolean isRoomAvailable(Room room, LocalDate startDate, LocalDate endDate) {
        for (Booking booking : bookings) {
            if (booking.getRooms().contains(room) &&
                (startDate.isBefore(booking.getCheckOut()) && endDate.isAfter(booking.getCheckIn()))) {
                return false;
            }
        }
        return true;
    }

    public List<Room> searchRoom(LocalDate start, LocalDate end){
        return hotels.stream().flatMap(h-> h.getList().stream()).filter(r -> isRoomAvailable(r, start, end)).collect(Collectors.toList());
    }

    public void sort(){
        bookings.stream().sorted((b1, b2)->{
            double b1sum = b1.getRooms().stream().mapToDouble(r -> r.price((int)ChronoUnit.DAYS.between(b1.getCheckIn(), b1.getCheckOut()))).sum();
            double b2sum = b2.getRooms().stream().mapToDouble(r -> r.price((int)ChronoUnit.DAYS.between(b2.getCheckIn(), b2.getCheckOut()))).sum();
            return Double.compare(b1sum,b2sum);
        });
    }
}
