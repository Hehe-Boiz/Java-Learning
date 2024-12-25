package OU_Exercise.MidTerm.EasyMedium;

public abstract class Room {
    private static int count =0;
    protected String id;

    public Room() {
        this.id = String.format("ROOM-%05d", ++count);
    }

    public String getId() {
        return id;
    }

    public abstract double price(int dem);
    public abstract double getPrice();

    @Override
    public String toString() {
        return "id: " + id ;
    }
}
