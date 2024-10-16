package restaurantManagementSystem;
import java.util.List;
import java.util.ArrayList;


public class Order {
    private List<Dish> orderedDishes;
    private double totalPrice;


    public Order() {
        this.orderedDishes = new ArrayList<>();
    }

    public void addDish(Dish dish){
        orderedDishes.add(dish);
    }

    public void removeDish(Dish dish){
        orderedDishes.remove(dish);
    }

    public List<Dish> getOrderedDishes() {
        return orderedDishes;
    }

    public double calculateTotalPrice(){
        for(Dish dish : orderedDishes){
            totalPrice+=dish.getPrice();
        }
        return totalPrice;
    }
}
