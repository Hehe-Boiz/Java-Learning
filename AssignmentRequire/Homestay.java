package AssignmentRequire;

import java.util.ArrayList;

public class Homestay extends CommonAccommodation{
    public Homestay(int iD_Accommodation, String name_Accommodation, String address_Accommodation,
            String city_Accommodation, ArrayList<Room> room_List, float rating_Accommodation) {
        super(iD_Accommodation, name_Accommodation, address_Accommodation, city_Accommodation, room_List, rating_Accommodation);
    }

    public Homestay(int iD_Accommodation, String name_Accommodation, String address_Accommodation,
            String city_Accommodation, float rating_Accommodation) {
        super(iD_Accommodation, name_Accommodation, address_Accommodation, city_Accommodation, rating_Accommodation);
    }

    @Override
    public String toString() {
        return "Homestay ["+iD_Accommodation+", "+name_Accommodation+", "
                        +address_Accommodation+", "+getRating_Accommodation()+", "+city_Accommodation+"]";
    }
}
