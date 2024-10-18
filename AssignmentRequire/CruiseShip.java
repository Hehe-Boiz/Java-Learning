package AssignmentRequire;

public class CruiseShip extends LuxuryAccommodation{
    private boolean is_serve_bar_CruiseShip;

    public CruiseShip(int iD_Accommodation, String name_Accommodation, String address_Accommodation,
            String city_Accommodation, boolean is_pool_available_LuxuryAccommodation,
            boolean is_welcome_drink_LuxuryAccommodation, boolean is_free_breakfast_LuxuryAccommodation,
            boolean is_gym_available_LuxuryAccommodation, int maximum_people_can_serve_LuxuryAccommodation,
            int price_night_LuxuryAccommodation, boolean is_serve_bar_CruiseShip) {
        super(iD_Accommodation, name_Accommodation, address_Accommodation, city_Accommodation,
                is_pool_available_LuxuryAccommodation, is_welcome_drink_LuxuryAccommodation,
                is_free_breakfast_LuxuryAccommodation, is_gym_available_LuxuryAccommodation,
                maximum_people_can_serve_LuxuryAccommodation, price_night_LuxuryAccommodation);
        this.is_serve_bar_CruiseShip = is_serve_bar_CruiseShip;
    }

    public boolean isIs_serve_bar_CruiseShip() {
        return is_serve_bar_CruiseShip;
    }

    public void setIs_serve_bar_CruiseShip(boolean is_serve_bar_CruiseShip) {
        this.is_serve_bar_CruiseShip = is_serve_bar_CruiseShip;
    }

    @Override
    public String toString() {
        return "CruiseShip [" + ID_Accommodation + ", "
                + name_Accommodation + ", "
                + address_Accommodation + ", " + city_Accommodation+ ", "+ is_serve_bar_CruiseShip
                + ", " + isIs_pool_available_LuxuryAccommodation()
                + ", " + isIs_welcome_drink_LuxuryAccommodation()
                + ", " + isIs_free_breakfast_LuxuryAccommodation()
                + ", " + isIs_gym_available_LuxuryAccommodation() + "]";
    }
}
