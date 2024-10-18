package AssignmentRequire;

import java.util.ArrayList;

public class CommonAccommodation extends Accommodation{
    private ArrayList<Room> room_List;
    private float rating_Accommodation;

    public CommonAccommodation(int iD_Accommodation, String name_Accommodation, String address_Accommodation,
            String city_Accommodation, ArrayList<Room> room_List, float rating_Accommodation) {
        super(iD_Accommodation, name_Accommodation, address_Accommodation, city_Accommodation);
        this.room_List = room_List;
        this.rating_Accommodation = rating_Accommodation;
    }

    public CommonAccommodation(int iD_Accommodation, String name_Accommodation, String address_Accommodation,
         String city_Accommodation, float rating_Coefficient) {
      super(iD_Accommodation, name_Accommodation, address_Accommodation, city_Accommodation);
      this.room_List = new ArrayList<>();
      this.rating_Accommodation = rating_Coefficient;
    }

    public ArrayList<Room> getRoom_List() {
        return room_List;
    }

    public void setRoom_List(ArrayList<Room> room_List) {
        this.room_List = room_List;
    }

    public float getRating_Accommodation() {
        return rating_Accommodation;
    }

    public void setRating_Accommodation(float rating_Accommodation) {
        this.rating_Accommodation = rating_Accommodation;
    }
}
