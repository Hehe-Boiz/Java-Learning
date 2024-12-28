/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OU_Exercise.MidTerm.BaiTruoc.Vehicle;

import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public abstract class Vehicle {
    private static int count =0;
    protected String id;
    protected String name;
    protected int year;
    protected LocalDate dateOfOperation;
    protected String company;
    protected String fuel;
    private int likeCount;

    public Vehicle(String name, int year, String dateOfOperation, String company, String fuel) {
        this.id = String.format("TRAN-%05d", ++count);
        this.name = name;
        this.year = year;
        this.dateOfOperation = LocalDate.parse(dateOfOperation, Config.FORMATTER);
        this.company = company;
        this.fuel = fuel;
        this.likeCount = 0;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
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
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the dateOfOperation
     */
    public LocalDate getDateOfOperation() {
        return dateOfOperation;
    }

    /**
     * @param dateOfOperation the dateOfOperation to set
     */
    public void setDateOfOperation(LocalDate dateOfOperation) {
        this.dateOfOperation = dateOfOperation;
    }

    /**
     * @return the company
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * @return the fuel
     */
    public String getFuel() {
        return fuel;
    }

    /**
     * @param fuel the fuel to set
     */
    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    /**
     * @return the likeCount
     */
    public int getLikeCount() {
        return likeCount;
    }

    /**
     * @param likeCount the likeCount to set
     */
    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", year=" + year + ", dateOfOperation=" + dateOfOperation + ", company=" + company + ", fuel=" + fuel + ", likeCount=" + likeCount ;
    }
}
