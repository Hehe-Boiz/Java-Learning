/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OU_Exercise.MidTerm.BaiTruoc.Vehicle;

/**
 *
 * @author Admin
 */
public class Bus extends Vehicle{
    private int numberOfSeats;
    private String route;

    public Bus(int numberOfSeats, String route, String name, int year, String dateOfOperation, String company, String fuel) {
        super(name, year, dateOfOperation, company, fuel);
        this.numberOfSeats = numberOfSeats;
        this.route = route;
    }

    /**
     * @return the numberOfSeats
     */
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    /**
     * @param numberOfSeats the numberOfSeats to set
     */
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    /**
     * @return the route
     */
    public String getRoute() {
        return route;
    }

    /**
     * @param route the route to set
     */
    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public String toString() {
        return "Bus{" + super.toString() + "numberOfSeats=" + numberOfSeats + ", route=" + route + '}';
    }
}
