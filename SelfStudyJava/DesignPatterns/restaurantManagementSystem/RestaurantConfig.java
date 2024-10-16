package restaurantManagementSystem;

public class  RestaurantConfig {
    private static RestaurantConfig instance;
    private String restaurantName;
    private String address;
    private String phoneNumber;

    private RestaurantConfig(){
    }

    public static RestaurantConfig getInstance(){
        if(instance == null){
            instance = new RestaurantConfig();
        }
        return instance;
    }

    public static void setInstance(RestaurantConfig instance) {
        RestaurantConfig.instance = instance;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setRestaurantInfo(String name, String address, String phone){
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Tên nhà hàng không được để trống");
        }
        if (address == null || address.trim().isEmpty()) {
            throw new IllegalArgumentException("Địa chỉ không được để trống");
        }
        if (phone == null || phone.trim().isEmpty()) {
            throw new IllegalArgumentException("Số điện thoại không được để trống");
        }

        this.restaurantName = name.trim();
        this.address = address.trim();
        this.phoneNumber = phone.trim();
    }
    
}
