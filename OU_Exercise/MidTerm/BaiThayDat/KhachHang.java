package OU_Exercise.MidTerm.BaiThayDat;

import java.time.LocalDate;

public class KhachHang {
    protected static int dem =0;
    protected String id;
    protected String name;
    protected LocalDate sinh;
    protected double balance;

    public KhachHang(String name, String sinh, double balance) {
        if (dem == 10000) throw new Error("So luong vuot qua kha nang");
        this.id = String.format("KH-%04d", ++dem);
        this.name = name;
        this.sinh = LocalDate.parse(sinh, Config.FORMATTER);
        this.balance = balance;
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

    public LocalDate getSinh() {
        return sinh;
    }

    public void setSinh(LocalDate sinh) {
        this.sinh = sinh;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAge(){
        return LocalDate.now().getYear() - sinh.getYear();
    }

    public int CompareBalance(double others){
        return Double.compare(balance, others);
    }

    @Override
    public String toString() {
        return String.format("Ma so: %s\nHo Ten: %s\nNgay Sinh: %s\nSo Du: %.1f\n",this.id, this.name, this.sinh,this.balance);
    }

    
}