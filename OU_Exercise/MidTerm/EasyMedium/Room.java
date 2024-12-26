package OU_Exercise.MidTerm.EasyMedium;

public abstract class Room {
    private static int count =0;
    protected String id;
    protected String idHotel;

    public Room(String idHotel) {
        this.id = String.format("ROOM-%05d", ++count);
        this.idHotel = idHotel;
    }

    public String getId() {
        return id;
    }

    public double price(int days){
        return days * getPrice() + getAdditionalCost();
    }

    public abstract double getPrice();
    protected abstract double getAdditionalCost();

    @Override
    public String toString() {
        return "id: " + id ;
    }

    public String getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(String idHotel) {
        this.idHotel = idHotel;
    }

    
}
