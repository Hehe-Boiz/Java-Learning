/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OU_Exercise.MidTerm.BaiTruoc.Vehicle;

/**
 *
 * @author Admin
 */
public class Tester {

    public static void main(String[] args) {
        Manager manager = new Manager();

        Customer c1 = new Customer("Nhut", "nam");
        Customer c2 = new Customer("HeheBoiz", "nam");
        Customer c3 = new Customer("Khang", "Nam");
        Customer c4 = new Customer("nhan", "nam");

        Vehicle v1 = new Bus(35, "NVL", "Bus-01", 2010, "10/01/2011", "HeheBoiz", "Dau");
        Vehicle v2 = new Subway(10, "OU", "BC","TD-01", 2010, "10/01/2011", "Hehe", "dien");
        Vehicle v3 = new Taxi(4, "Q1", "Taxi-01", 2010, "10/01/2011", "Boiz", "Xang");
        Vehicle v4 = new Bus(35, "HCM", "Bus-02", 2000, "10/12/2000", "Boiz", "Dau");
        Vehicle v5 = new Taxi(7, "NVL", "Taxi-02", 2010, "10/09/2001", "Kha", "Dau");
        Vehicle v6 = new Subway(15, "Ben Thanh","Thu Duc", "TD-02", 2024, "10/12/2024", "HeheBoiz", "Dien");
        Vehicle v7 = new Subway(15, "Ben Thanh", "UIT","TD-03", 2024, "10/05/2024", "Nhan", "Dien");
        Vehicle v8 = new Bus(35, "Hong bang", "Bus-03", 2020, "10/01/2020", "HeheBoiz", "Dau");
        Vehicle v9 = new Taxi(4, "Q5", "Taxi-01", 2019, "10/01/2020", "HeheBoiz", "Dau");

        manager.addVehicles(v1,v2,v3,v4,v5,v6,v7,v8,v9);
        manager.addCustomer(c1,c2,c3,c4);
        
        System.out.println("Cau 2:------------");
        manager.displayVehiclesYearLess20();
        
        System.out.println("Cau 3:------------");
        manager.addVehiclesLikeCustomer(c1, v7.getId(),v2.getId());
        manager.addVehiclesLikeCustomer(c2, v7.getId());
        manager.addVehiclesLikeCustomer(c3, v7.getId());
        manager.displayCustomerLikeSubway();
        
        System.out.println("Cau 4:------------");
        manager.displayVehiclesGreaterThan2();
        
        System.out.println("Cau 5:------------");
        manager.sortVehicles();
        manager.displayVehicles();
        
        
    }
}
