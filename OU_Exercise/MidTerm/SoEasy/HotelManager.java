package OU_Exercise.MidTerm.SoEasy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HotelManager {
    private List<Room> listRooms = new ArrayList<>();
    private List<Guest> listGuests = new ArrayList<>();

    public void addRoom(Room... a) {
        listRooms.addAll(Arrays.asList(a));
    }

    public void addGuests(Guest... a) {
        listGuests.addAll(Arrays.asList(a));
    }

    public void displayRoomState() {
        listRooms.stream().filter(r -> r.isState() == false).forEach(r -> System.out.println(r));
    }

    public double priceSum(String CCCD) throws Exception {
        Guest guest = listGuests.stream().filter(g -> g.getCCCD().equals(CCCD)).findFirst().orElse(null);
        if (guest == null) {
            throw new Exception("Không tìm thấy");
        }
        Room room = listRooms.stream().filter(r -> r.getId().equals(guest.getIdRoom())).findFirst().orElse(null);
        return guest.getDay() * room.getPrice();
    }

    public void displayGuests() {
        listGuests.stream().filter(g -> g.getCheckIn().plusDays(g.getDay()).isBefore(LocalDate.now()))
                .forEach(g -> System.out.println(g));
    }

    public void searchRooms(boolean keyword) {
        listRooms.stream().filter(r -> r.isRoomType() == keyword || r.isState() == keyword)
                .forEach(r -> System.out.println(r));
    }

    public boolean bookRoom(String roomId, Guest guest) {
        Room room = listRooms.stream()
                .filter(r -> r.getId().equals(roomId))
                .findFirst()
                .orElse(null);

        if (room != null && !room.isState()) {
            room.setState(true);
            listGuests.add(guest);
            return true;
        }
        return false;
    }

    public boolean checkOut(String CCCD) {
        Guest guest = listGuests.stream()
                .filter(g -> g.getCCCD().equals(CCCD))
                .findFirst()
                .orElse(null);

        if (guest != null) {
            Room room = listRooms.stream()
                    .filter(r -> r.getId().equals(guest.getIdRoom()))
                    .findFirst()
                    .orElse(null);

            if (room != null) {
                room.setState(false);
                return true;
            }
        }
        return false;
    }
}
