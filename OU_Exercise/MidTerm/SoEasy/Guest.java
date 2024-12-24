package OU_Exercise.MidTerm.SoEasy;

import java.time.LocalDate;

public class Guest {
    private String CCCD;
    private String name;
    private LocalDate checkIn;
    private String idRoom;
    private int day;
    
    public Guest(String cCCD, String name, LocalDate checkIn, String idRoom, int day) {
        CCCD = cCCD;
        this.name = name;
        this.checkIn = checkIn;
        this.idRoom = idRoom;
        this.day = day;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String cCCD) {
        CCCD = cCCD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public String getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(String idRoom) {
        this.idRoom = idRoom;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Guest [CCCD=" + CCCD + ", Tên: " + name + ", Ngày nhận phòng: " + checkIn + ", Mã phòng: " + idRoom + ", Số ngày ở: " + day
                + "]";
    }
}
