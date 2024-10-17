package NestedClass;

public class Hotel {
    private String hotelName;

    static class Room{
        private int roomNumber;
        private boolean isAvailable;

        public Room(int roomNumber, boolean isAvailable) {
            this.roomNumber = roomNumber;
            this.isAvailable = isAvailable;
        }

        public void displayRoomInfo() {
            String status = isAvailable ? "Available" : "Occupied";
            System.out.println("Room " + roomNumber + ": " + status);
        }
    }

    class Customer{
        private String name;
        private int age;

        public Customer(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void displayCustomerInfo() {
            System.out.println("Customer: " + name + ", Age: " + age);
        }
    }

    interface RoomService{
        public void cleanRoom();
    }

    public Hotel(String hotelName) {
        this.hotelName = hotelName;
    }

    public void displayHotelInfo() {
        System.out.println("Hotel: " + hotelName);
    }

    public void manageRoom(RoomService service) {
        service.cleanRoom();
    }
}

class Main{
    public static void main(String[] args) {
        Hotel hotel = new Hotel("HeheBoiz");

        Hotel.Room room1 = new Hotel.Room(101, true);
        Hotel.Room room2 = new Hotel.Room(102, false);

        //lớp không tĩnh
        Hotel.Customer customer = hotel.new Customer("John Doe", 30);

        hotel.displayHotelInfo();
        room1.displayRoomInfo();
        room2.displayRoomInfo();
        customer.displayCustomerInfo();

        hotel.manageRoom(new Hotel.RoomService() {
            @Override
            public void cleanRoom() {
                System.out.println("Room has been cleaned.");
            }
        });
    }
}
