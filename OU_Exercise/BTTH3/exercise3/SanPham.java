package BTTH3.exercise3;

public class SanPham {
    private String id;
    private String name;
    private String describe;
    private String manufacturer;
    private double price;
    
    public SanPham(String id, String name, String describe, String manufacturer, double price) {
        this.id = id;
        this.name = name;
        this.describe = describe;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Mã sản phẩm: " + id);
        System.out.println("Tên sản phẩm: " + name);
        System.out.println("Mô tả sản phẩm: " + describe);
        System.out.println("Nhà sản xuất: " + manufacturer);
        System.out.println("Giá bán: " + price);
    }
}
