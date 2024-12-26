package OU_Exercise.MidTerm.EasyMedium;

import java.util.Map;

public class RoomFactory {
    public static Room createRoom(String type, double area, Map<String, Object> properties, String msHotel) {
        switch (type.toLowerCase()) {
            case "standard":
                return new Standard(area, (int) properties.get("singleBeds"), msHotel);
            case "deluxe":
                return new Deluxe(area, (int) properties.get("doubleBeds"),
                                    (boolean) properties.get("hasBalcony"), msHotel);
            case "suite":
                return new Suite(area, (int) properties.get("bedrooms"),
                                   (boolean) properties.get("hasKitchen"), msHotel);
            default:
                throw new IllegalArgumentException("Invalid room type");
        }
    }
}
