package BTTH3.exercise3;

public class Sach extends SanPham{
    private int number;

    public Sach(String id, String name, String describe, String manufacturer, double price, int number) {
        super(id, name, describe, manufacturer, price);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return "Sach";
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Số trang: "+number);
        System.out.println("Loại sản phẩm: "+getType());
    }
}
