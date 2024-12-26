package OU_Exercise.MidTerm.EasyMedium;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private static int count = 0;
    private String id;
    private String name;
    private String address;
    private double star;
    private int year;
    private List<Room> list;

    public Hotel(String name, String address, double star, int year) {
        this.id = String.format("HOTEL-%05d", ++count);
        this.name = name;
        this.address = address;
        if(star < 3 || star >5){
            throw new IllegalAccessError("Số sao không phù hợp");
        }
        this.star = star;
        this.year = year;
        this.list = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getStar() {
        return star;
    }

    public void setStar(double star) {
        this.star = star;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Room> getList() {
        return list;
    }

    public void setList(List<Room> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Hotel [id=" + id + ", name=" + name + ", address=" + address + ", star=" + star + ", year=" + year
                + ", list=" + list + "]";
    } 
}
