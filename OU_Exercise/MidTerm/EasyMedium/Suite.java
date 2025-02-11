package OU_Exercise.MidTerm.EasyMedium;

public class Suite extends Room {
    private double area;
    private int bedroom;
    private boolean kitchen;

    public Suite(double area, int bedroom, boolean kitchen,String idHotel) {
        super(idHotel);
        this.area = area;
        this.bedroom = bedroom;
        this.kitchen = kitchen;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getBedroom() {
        return bedroom;
    }

    public void setBedroom(int bedroom) {
        this.bedroom = bedroom;
    }

    public boolean isKitchen() {
        return kitchen;
    }

    public void setKitchen(boolean kitchen) {
        this.kitchen = kitchen;
    }

    public double getPrice() {
        return 2000000;
    }

    @Override
    protected double getAdditionalCost() {
        return 500000 * bedroom + (kitchen ? 500000 : 0); 
    }

    @Override
    public String toString() {
        return "Suite " + super.toString() + " diện tích: " + area + ", số phòng ngủ: " + bedroom + " phòng bếp: "
                + kitchen;
    }
}
