package exercise3;

public class Cabbage implements Vegetable{
    private String type;
    private double weight;

    public Cabbage(){
    }

    public Cabbage(String type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String getInfo(){
        return "Cabbage{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                '}'; 
    }
}
