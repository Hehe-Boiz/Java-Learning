package AssignmentRequire;

public class Villa extends LuxuryAccommodation{

    public Villa(int iD_Accommodation, String name_Accommodation, String address_Accommodation,
            String city_Accommodation, boolean is_pool_available_LuxuryAccommodation,
            boolean is_welcome_drink_LuxuryAccommodation, boolean is_free_breakfast_LuxuryAccommodation,
            boolean is_gym_available_LuxuryAccommodation, int maximum_people_can_serve_LuxuryAccommodation,
            int price_night_LuxuryAccommodation) {
        super(iD_Accommodation, name_Accommodation, address_Accommodation, city_Accommodation,
                is_pool_available_LuxuryAccommodation, is_welcome_drink_LuxuryAccommodation,
                is_free_breakfast_LuxuryAccommodation, is_gym_available_LuxuryAccommodation,
                maximum_people_can_serve_LuxuryAccommodation, price_night_LuxuryAccommodation);
    }

    @Override
    public String toString() {
        return "Villa ["+iD_Accommodation+", "+name_Accommodation+", "+address_Accommodation
        +", "+city_Accommodation+", "+isIs_pool_available_LuxuryAccommodation()+", "+isIs_welcome_drink_LuxuryAccommodation()
        +", "+isIs_free_breakfast_LuxuryAccommodation()+", "+isIs_gym_available_LuxuryAccommodation()
        +", "+getMaximum_people_can_serve_LuxuryAccommodation()+", "+getPrice_night_LuxuryAccommodation()+"]";
    }
}
