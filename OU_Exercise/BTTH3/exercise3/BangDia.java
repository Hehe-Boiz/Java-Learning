package BTTH3.exercise3;

public class BangDia extends SanPham{
    private double longTime;

    public BangDia(String id, String name, String describe, String manufacturer, double price, double longTime) {
        super(id, name, describe, manufacturer, price);
        this.longTime = longTime;
    }

    public double getLongTime() {
        return longTime;
    }

    public void setLongTime(double longTime) {
        this.longTime = longTime;
    }

    public String getType() {
        return "Băng đĩa";
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Độ dài thời gian phát: " + longTime);
        System.out.println("Loại sản phẩm: "+getType());
    }
}
