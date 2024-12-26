package OU_Exercise.MidTerm.EasyMedium;

public class Standard extends Room{
    private double area;
    private int bed;
    
    public Standard(double area, int bed, String idHotel) {
        super(idHotel);
        this.area = area;
        this.bed = bed;
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

    @Override
    protected double getAdditionalCost() {
        return 100000 *bed ; 
    }

    public double getPrice(){
        return 500000;
    }

    @Override
    public String toString() {
        return "Standard " +super.toString()+" diện tích: " + area + ", số giường: " + bed;
    }
}
