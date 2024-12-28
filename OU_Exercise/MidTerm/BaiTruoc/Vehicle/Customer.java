/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OU_Exercise.MidTerm.BaiTruoc.Vehicle;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Customer {
    private String name;
    private String gender;
    private List<Vehicle> vehicles;

    public Customer(String name, String gender) {
        this.name = name;
        this.gender = gender;
        this.vehicles = new ArrayList<>();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the vehicles
     */
    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    /**
     * @param vehicles the vehicles to set
     */
    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
    
    public boolean isLikeTrain(){
        return vehicles.stream().anyMatch(v -> v instanceof Subway);
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", gender=" + gender + ", vehicles=" + vehicles + '}';
    }
    
    
}
