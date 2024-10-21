package exercise3;

public class VegetableFactory {
    public static Vegetable getVegetable(String type){
        if(type == null) return null;
        switch (type.toLowerCase()) {
            case "carrot":
                return new Carrot(); 
            case "cabbage":
                return new Cabbage(); 
            case "pumpkin":
                return new Pumpkin(); 
            default:
                return null;
        }
    }
}
