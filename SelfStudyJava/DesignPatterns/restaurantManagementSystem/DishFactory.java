package restaurantManagementSystem;

public class DishFactory {
    public static Dish createDish(String type, String name, double price, String description){
        if(type == null){
            throw new IllegalArgumentException("Type cannot be null");
        }
        if(type.equalsIgnoreCase("appetizer")) return new Appetizer(name, price, description);
        else if(type.equalsIgnoreCase("maincourse")) return new MainCourse(name, price, description);
        else if(type.equalsIgnoreCase("dessert")) return new Dessert(name, price, description);
        else throw new IllegalArgumentException("Unknown type: " + type);
    }
}
