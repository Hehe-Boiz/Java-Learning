package AssignmentRequire;

import java.util.ArrayList;

public class Hotel extends CommonAccommodation{
    private int rating_hotel;

    public Hotel(int iD_Accommodation, String name_Accommodation, String address_Accommodation,
            String city_Accommodation, ArrayList<Room> room_List, float rating_Accommodation, int rating_hotel) {
        super(iD_Accommodation, name_Accommodation, address_Accommodation, city_Accommodation, room_List,
                rating_Accommodation);
        this.rating_hotel = rating_hotel;
    }

    public Hotel(int iD_Accommodation, String name_Accommodation, String address_Accommodation,
            String city_Accommodation, float rating_Coefficient, int rating_hotel) {
        super(iD_Accommodation, name_Accommodation, address_Accommodation, city_Accommodation, rating_Coefficient);
        this.rating_hotel = rating_hotel;
    }

    public int getRating_hotel() {
        return rating_hotel;
    }

    public void setRating_hotel(int rating_hotel) {
        this.rating_hotel = rating_hotel;
    }

    @Override
    public String toString() {
        return "Hotel [" + iD_Accommodation + ", " + rating_hotel
                + ", " + name_Accommodation + ", " + address_Accommodation
                + ", " + city_Accommodation + "]";
    }
}
