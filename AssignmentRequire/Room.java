package AssignmentRequire;

public class Room {
    private int ID_Room;
    private String name_Room;
    private int floor_Room;
    private String type_Room;
    private int bed_number_Room;
    private int maximum_people_Room;
    private double area_Room;
    private double price_night_Room;
    
    public Room(int iD_Room, String name_Room, int floor_Room, String type_Room, int bed_number_Room,
            int maximum_people_Room, double area_Room, double price_night_Room) {
        ID_Room = iD_Room;
        this.name_Room = name_Room;
        this.floor_Room = floor_Room;
        this.type_Room = type_Room;
        this.bed_number_Room = bed_number_Room;
        this.maximum_people_Room = maximum_people_Room;
        this.area_Room = area_Room;
        this.price_night_Room = price_night_Room;
    }

    public int getID_Room() {
        return ID_Room;
    }

    public void setID_Room(int iD_Room) {
        ID_Room = iD_Room;
    }

    public String getName_Room() {
        return name_Room;
    }

    public void setName_Room(String name_Room) {
        this.name_Room = name_Room;
    }

    public int getFloor_Room() {
        return floor_Room;
    }

    public void setFloor_Room(int floor_Room) {
        this.floor_Room = floor_Room;
    }

    public String getType_Room() {
        return type_Room;
    }

    public void setType_Room(String type_Room) {
        this.type_Room = type_Room;
    }

    public int getBed_number_Room() {
        return bed_number_Room;
    }

    public void setBed_number_Room(int bed_number_Room) {
        this.bed_number_Room = bed_number_Room;
    }

    public int getMaximum_people_Room() {
        return maximum_people_Room;
    }

    public void setMaximum_people_Room(int maximum_people_Room) {
        this.maximum_people_Room = maximum_people_Room;
    }

    public double getArea_Room() {
        return area_Room;
    }

    public void setArea_Room(double area_Room) {
        this.area_Room = area_Room;
    }

    public double getPrice_night_Room() {
        return price_night_Room;
    }

    public void setPrice_night_Room(double price_night_Room) {
        this.price_night_Room = price_night_Room;
    }

    @Override
    public String toString() {
        return "Room [ID_Room=" + ID_Room + ", name_Room=" + name_Room + ", floor_Room=" + floor_Room + ", type_Room="
                + type_Room + ", bed_number_Room=" + bed_number_Room + ", maximum_people_Room=" + maximum_people_Room
                + ", area_Room=" + area_Room + ", price_night_Room=" + price_night_Room + "]";
    }

    
}
