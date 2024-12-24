package OU_Exercise.MidTerm.SoEasy;

public class Room {
    private static int count =0;
    private String id;
    private boolean roomType;
    private double price;
    private boolean state;

    public Room(boolean roomType, double price, boolean state) {
        this.id =  String.format("HeheBoiz-%04d", ++count);
        this.roomType = roomType;
        this.price = price;
        this.state = state;
    }

    public Room(boolean roomType, double price) {
        this(roomType, price, false);
    }

    public String getId() {
        return id;
    }

    public boolean isRoomType() {
        return roomType;
    }

    public void setRoomType(boolean roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Room [id=" + id + ", roomType=" + roomType + ", price=" + price + ", state=" + state + "]";
    }

    
}
