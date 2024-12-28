/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OU_Exercise.MidTerm.BaiTruoc.Vehicle;

/**
 *
 * @author Admin
 */
public class Subway extends Vehicle{
    private int carriages;
    private String pickupPoint;
    private String destination;

    public Subway(int carriages, String pickupPoint, String destination, String name, int year, String dateOfOperation, String company, String fuel) {
        super(name, year, dateOfOperation, company, fuel);
        this.carriages = carriages;
        this.pickupPoint = pickupPoint;
        this.destination = destination;
    }

    /**
     * @return the carriages
     */
    public int getCarriages() {
        return carriages;
    }

    /**
     * @param carriages the carriages to set
     */
    public void setCarriages(int carriages) {
        this.carriages = carriages;
    }

    /**
     * @return the pickupPoint
     */
    public String getPickupPoint() {
        return pickupPoint;
    }

    /**
     * @param pickupPoint the pickupPoint to set
     */
    public void setPickupPoint(String pickupPoint) {
        this.pickupPoint = pickupPoint;
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Subway{"+super.toString() + "carriages=" + carriages + ", pickupPoint=" + pickupPoint + ", destination=" + destination + '}';
    }
    
    
}
