package NestedClass;

public class TransportService {
    private String serviceName;

    static class Vehicle{
        private String vehicleType;
        private int capacity;

        public Vehicle(String vehicleType, int capacity) {
            this.vehicleType = vehicleType;
            this.capacity = capacity;
        }

        public void displayVehicleInfo() {
            System.out.println("Vehicle: " + vehicleType + ", Capacity: " + capacity);
        }
    }

    interface Driver {
        void drive();
    }

    public TransportService(String serviceName) {
        this.serviceName = serviceName;
    }

    public void displayServiceInfo() {
        System.out.println("Service: " + serviceName);
    }

    public void manageTransport(Driver driver) {
        driver.drive();
    }

    public static void main(String[] args) {
        TransportService service = new TransportService("Heheboiz");
        Vehicle vehicle = new Vehicle("Bus", 50);

        service.displayServiceInfo();
        vehicle.displayVehicleInfo();

        service.manageTransport(new Driver(){
            @Override
            public void drive(){
                System.out.println("The vehicle is being driven.");
            }
        });
    }
}


