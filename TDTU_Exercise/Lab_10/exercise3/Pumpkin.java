package exercise3;

public class Pumpkin implements Vegetable{
    private double weight;

    public Pumpkin() {
    }

    public Pumpkin(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String getInfo() {
        return "Pumpkin{" +
                "weight=" + weight +
                '}';
    }

}
