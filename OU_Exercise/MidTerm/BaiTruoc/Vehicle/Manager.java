/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OU_Exercise.MidTerm.BaiTruoc.Vehicle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class Manager {

    List<Vehicle> vehicles;
    List<Customer> customers;

    public Manager() {
        this.vehicles = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public void addVehicles(Vehicle... vehicle) {
        vehicles.addAll(Arrays.asList(vehicle));
    }

    public void removeVehicle(String key) {
        vehicles.removeIf(v -> v.getId().equals(key));
    }

    public void addCustomer(Customer... customer) {
        customers.addAll(Arrays.asList(customer));
    }

    public void removeCustomer(String name) {
        customers.removeIf(c -> c.getName().equals(name));
    }

    public void displayVehiclesYearLess20() {
        List<Vehicle> vs = vehicles.stream().filter(v -> LocalDate.now().getYear() - v.getDateOfOperation().getYear() < 20).toList();
        if (vs == null) {
            System.out.println("Không có phương tiện nào đưa vào hoạt động dưới 20 năm");
            return;
        }
        vs.forEach(v -> System.out.println(v));
    }

    public void addVehiclesLikeCustomer(Customer cus, String... ms) {
        Customer customer = customers.stream().filter(c -> c == cus).findFirst().orElse(null);
        if (customer == null) {
            System.out.println("Khách hàng này không tồn tại sẵn nhưng sẽ được thêm vào");
            customers.add(cus);
        }
        for (String id : Arrays.asList(ms)) {
            boolean vehicleFound = false;
            for (Vehicle v : vehicles) {

                if (v.getId().equalsIgnoreCase(id)) {
                    cus.getVehicles().add(v);
                    v.setLikeCount(v.getLikeCount() + 1);
                    vehicleFound = true;
                    break;
                }

            }
            if (!vehicleFound) {
                System.out.println(id + " Phương tiện này không tồn tại");
            }
        }
    }

    public void displayCustomerLikeSubway() {
        List<Customer> cuss = customers.stream().filter(c -> c.isLikeTrain()).toList();
        if (cuss == null) {
            System.out.println("Không có khách hàng nào thích tàu điện");
            return;
        }
        cuss.forEach(c -> System.out.println(c));
    }

    public void displayVehiclesGreaterThan2() {
        List<Vehicle> vs = vehicles.stream().filter(v -> v.getLikeCount() > 2).toList();
        if (vs == null) {
            System.out.println("Không có phương tiện nào có lượt thích trên 2");
            return;
        }
        vs.forEach(v -> System.out.println(v));
    }

    public void sortVehicles() {
        vehicles.sort(Comparator.comparing(Vehicle::getLikeCount).reversed().thenComparing(Vehicle::getId));
    }

    public void displayVehicles() {
        vehicles.forEach(v -> System.out.println(v));
    }
}
