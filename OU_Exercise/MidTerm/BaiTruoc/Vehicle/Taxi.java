/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OU_Exercise.MidTerm.BaiTruoc.Vehicle;

/**
 *
 * @author Admin
 */
public class Taxi extends Vehicle{
    private int numberOfSeats;
    private String area;

    public Taxi(int numberOfSeats, String area, String name, int year, String dateOfOperation, String company, String fuel) {
        super(name, year, dateOfOperation, company, fuel);
        this.numberOfSeats = numberOfSeats;
        this.area = area;
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
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Taxi{" +super.toString() + "numberOfSeats=" + numberOfSeats + ", area=" + area + '}';
    }
}
