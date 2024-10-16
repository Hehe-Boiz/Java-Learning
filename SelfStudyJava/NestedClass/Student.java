package NestedClass;

public class Student {
    private String name;
    private int age;
    private String id;
    private Address address;
    
    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void setAddress(String street, String city, String zipCode) {
        this.address = new Address(street, city, zipCode);
    }

    public void displayInfo(){
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
        if(address != null){
            address.displayAddress();
        } else System.out.println("Address: Not set");
    }

    static class Address{
        // không thể truy cập vào các thành viên không static của outer class 
        private String street;
        private String city;
        private String zipCode;

        public Address(String street, String city, String zipCode) {
            this.street = street;
            this.city = city;
            this.zipCode = zipCode;
        }

        public void displayAddress() {
            System.out.println("Address:");
            System.out.println("Street: " + street);
            System.out.println("City: " + city);
            System.out.println("Zip Code: " + zipCode);
        }

    }

    public static void main(String[] args) {
        // Tạo một đối tượng Student
        Student student = new Student("John Doe", 20, "S12345");

        // Gán địa chỉ cho sinh viên
        student.setAddress("123 Main St", "Springfield", "12345");

        // Hiển thị thông tin sinh viên
        student.displayInfo();
    }
}
