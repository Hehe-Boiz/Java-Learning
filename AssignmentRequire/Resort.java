package AssignmentRequire;

import java.util.ArrayList;

public class Resort extends CommonAccommodation{
    private int rating_stars_Resort;
    private boolean is_pool_available_Resort;

    public Resort(int iD_Accommodation, String name_Accommodation, String address_Accommodation,
            String city_Accommodation, ArrayList<Room> room_List, float rating_Accommodation, int rating_stars_Resort,
            boolean is_pool_available_Resort) {
        super(iD_Accommodation, name_Accommodation, address_Accommodation, city_Accommodation, room_List,
                rating_Accommodation);
        this.rating_stars_Resort = rating_stars_Resort;
        this.is_pool_available_Resort = is_pool_available_Resort;
    }

    public Resort(int iD_Accommodation, String name_Accommodation, String address_Accommodation,
            String city_Accommodation, float rating_Coefficient, int rating_stars_Resort,
            boolean is_pool_available_Resort) {
        super(iD_Accommodation, name_Accommodation, address_Accommodation, city_Accommodation, rating_Coefficient);
        this.rating_stars_Resort = rating_stars_Resort;
        this.is_pool_available_Resort = is_pool_available_Resort;
    }

    public int getRating_stars_Resort() {
        return rating_stars_Resort;
    }

    public void setRating_stars_Resort(int rating_stars_Resort) {
        this.rating_stars_Resort = rating_stars_Resort;
    }

    public boolean isIs_pool_available_Resort() {
        return is_pool_available_Resort;
    }

    public void setIs_pool_available_Resort(boolean is_pool_available_Resort) {
        this.is_pool_available_Resort = is_pool_available_Resort;
    }

    @Override
    public String toString() {
        return "Resort [" + iD_Accommodation + ", " + name_Accommodation
                + ", " + rating_stars_Resort + ", " + address_Accommodation
                + ", " + is_pool_available_Resort + ", "
                + city_Accommodation + "]";
    }
}
