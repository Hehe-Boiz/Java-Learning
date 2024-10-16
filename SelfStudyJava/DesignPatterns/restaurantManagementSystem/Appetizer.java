package restaurantManagementSystem;

public class Appetizer implements Dish{
    private String name;
    private double price;
    private String description;

    
    public Appetizer(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
}
