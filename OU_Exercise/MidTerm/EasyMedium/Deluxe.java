package OU_Exercise.MidTerm.EasyMedium;

public class Deluxe extends Room{
    private double area;
    private int bed;
    private boolean balcony;
    
    public Deluxe(double area, int bed, boolean balcony,String idHotel) {
        super(idHotel);
        this.area = area;
        this.bed = bed;
        this.balcony = balcony;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }


    public double getPrice(){
        return 1200000;
    }

    @Override
    protected double getAdditionalCost() {
        return 200000 * bed + (balcony ? 300000 : 0); 
    }

    @Override
    public String toString() {
        return "Deluxe " +super.toString()+" diện tích: " + area + ", số phòng ngủ: " + bed + " ban công: "+ balcony;
    }
}
