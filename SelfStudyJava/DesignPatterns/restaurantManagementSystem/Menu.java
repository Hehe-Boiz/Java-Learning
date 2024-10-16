package restaurantManagementSystem;
import java.util.List;
import java.util.ArrayList;


public class Menu {
    private List<Dish> dishes;
    
    public Menu() {
        this.dishes = new ArrayList<>();
    }

    public void addDish(Dish dish){
        dishes.add(dish);
    }

    public void removeDish(Dish dish){
        dishes.remove(dish);
    }

    public List<Dish> getAllDishes(){
        return dishes;
    }

    public Dish getDishByName(String name){
        for(Dish dish : dishes){
            if(dish.getName() == name){
                return dish;
            }
        }
        throw new IllegalArgumentException("Not found");
    }
}
