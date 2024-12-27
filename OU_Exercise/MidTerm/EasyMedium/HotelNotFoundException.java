package OU_Exercise.MidTerm.EasyMedium;

public class HotelNotFoundException extends BookingException {
    public HotelNotFoundException(String roomId) {
        super("Không tìm thấy phòng với mã: " + roomId);
    }
}