package OU_Exercise.MidTerm.EasyMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class HotelService {
    private List<Room> rooms = new ArrayList<>();
    private List<Hotel> hotels = new ArrayList<>();

    public void addHotel(String name, String address, double star, int year, Room... rooms) {
        Hotel hotel = new Hotel(name, address, star, year);
        hotels.add(hotel);
        hotel.getList().addAll(Arrays.asList(rooms));
        this.rooms.addAll(Arrays.asList(rooms));
    }

    public void removeHotel(String msHotel) {
        hotels.removeIf(h -> h.getId().equals(msHotel));
    }

    public void addRoom(String msHotel, double area, Map<String, Object> properties) {
        Hotel hotel = hotels.stream().filter(h -> h.getId().equals(msHotel)).findFirst().orElse(null);
        if (hotel == null) {
            throw new IllegalAccessError("Không tìm thấy khách sạn");
        }
        Room room = RoomFactory.createRoom(msHotel, area, properties, msHotel);
        rooms.add(room);
        hotel.getList().add(room);
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }

}
