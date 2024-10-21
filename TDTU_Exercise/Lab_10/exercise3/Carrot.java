package exercise3;

public class Carrot implements Vegetable{
    private String type;

    public Carrot() {
    }

    public Carrot(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getInfo(){
        return "Carrot{" +
                "type='" + type + '\'' +
                '}';
    }
}
