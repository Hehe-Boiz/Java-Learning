package OU_Exercise.MidTerm.EasyMedium;

import java.util.List;
import java.util.stream.Collectors;

public class Manager {
    BookingService bv = new BookingService();
    HotelService hv = new HotelService();

    public List<Room> searchRoom(String phong) throws ClassNotFoundException{
        Class c = Class.forName(phong);

        return hv.getRooms().stream().filter(r -> c.isInstance(r)).collect(Collectors.toList());
    }

    public List<Room> searchRoom(double start, double end){
        return hv.getRooms().stream().filter(r -> r.getPrice()>=start && r.getPrice()<=end).collect(Collectors.toList());
    }

    public List<Room> searchRoom(String start, String end){
        return hv.getRooms().stream().filter(r -> !bv.getBooksRoom().containsKey(r.getId()) || bv.getBooksRoom().get(r.getId()).stream().noneMatch(rg -> rg.overlaps(new RangeTime(start, end)))).collect(Collectors.toList());
    }

    
}