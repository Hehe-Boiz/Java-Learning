package AssignmentRequire;

public class LuxuryAccommodation extends Accommodation{
    private boolean is_pool_available_LuxuryAccommodation;
    private boolean is_welcome_drink_LuxuryAccommodation;
    private boolean is_free_breakfast_LuxuryAccommodation;
    private boolean is_gym_available_LuxuryAccommodation;
    private int maximum_people_can_serve_LuxuryAccommodation;
    private int price_night_LuxuryAccommodation;
    public LuxuryAccommodation(int iD_Accommodation, String name_Accommodation, String address_Accommodation,
            String city_Accommodation) {
        super(iD_Accommodation, name_Accommodation, address_Accommodation, city_Accommodation);
    }

    public LuxuryAccommodation(int iD_Accommodation, String name_Accommodation, String address_Accommodation,
            String city_Accommodation, boolean is_pool_available_LuxuryAccommodation,
            boolean is_welcome_drink_LuxuryAccommodation, boolean is_free_breakfast_LuxuryAccommodation,
            boolean is_gym_available_LuxuryAccommodation, int maximum_people_can_serve_LuxuryAccommodation,
            int price_night_LuxuryAccommodation) {
        super(iD_Accommodation, name_Accommodation, address_Accommodation, city_Accommodation);
        this.is_pool_available_LuxuryAccommodation = is_pool_available_LuxuryAccommodation;
        this.is_welcome_drink_LuxuryAccommodation = is_welcome_drink_LuxuryAccommodation;
        this.is_free_breakfast_LuxuryAccommodation = is_free_breakfast_LuxuryAccommodation;
        this.is_gym_available_LuxuryAccommodation = is_gym_available_LuxuryAccommodation;
        this.maximum_people_can_serve_LuxuryAccommodation = maximum_people_can_serve_LuxuryAccommodation;
        this.price_night_LuxuryAccommodation = price_night_LuxuryAccommodation;
    }

    public boolean isIs_pool_available_LuxuryAccommodation() {
        return is_pool_available_LuxuryAccommodation;
    }

    public void setIs_pool_available_LuxuryAccommodation(boolean is_pool_available_LuxuryAccommodation) {
        this.is_pool_available_LuxuryAccommodation = is_pool_available_LuxuryAccommodation;
    }

    public boolean isIs_welcome_drink_LuxuryAccommodation() {
        return is_welcome_drink_LuxuryAccommodation;
    }

    public void setIs_welcome_drink_LuxuryAccommodation(boolean is_welcome_drink_LuxuryAccommodation) {
        this.is_welcome_drink_LuxuryAccommodation = is_welcome_drink_LuxuryAccommodation;
    }

    public boolean isIs_free_breakfast_LuxuryAccommodation() {
        return is_free_breakfast_LuxuryAccommodation;
    }

    public void setIs_free_breakfast_LuxuryAccommodation(boolean is_free_breakfast_LuxuryAccommodation) {
        this.is_free_breakfast_LuxuryAccommodation = is_free_breakfast_LuxuryAccommodation;
    }

    public boolean isIs_gym_available_LuxuryAccommodation() {
        return is_gym_available_LuxuryAccommodation;
    }

    public void setIs_gym_available_LuxuryAccommodation(boolean is_gym_available_LuxuryAccommodation) {
        this.is_gym_available_LuxuryAccommodation = is_gym_available_LuxuryAccommodation;
    }

    public int getMaximum_people_can_serve_LuxuryAccommodation() {
        return maximum_people_can_serve_LuxuryAccommodation;
    }

    public void setMaximum_people_can_serve_LuxuryAccommodation(int maximum_people_can_serve_LuxuryAccommodation) {
        this.maximum_people_can_serve_LuxuryAccommodation = maximum_people_can_serve_LuxuryAccommodation;
    }

    public int getPrice_night_LuxuryAccommodation() {
        return price_night_LuxuryAccommodation;
    }

    public void setPrice_night_LuxuryAccommodation(int price_night_LuxuryAccommodation) {
        this.price_night_LuxuryAccommodation = price_night_LuxuryAccommodation;
    }

    
}
