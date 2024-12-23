package OU_Exercise.MidTerm.BaiThayDat;

import java.time.LocalDate;

public class KhachHangVip extends KhachHang{
    private LocalDate expirationDate;

    public KhachHangVip(String name, String sinh, double balance, String expirationDate) {
        super(name, sinh, balance);
        this.expirationDate = LocalDate.parse(expirationDate,Config.FORMATTER);
    }

    @Override
    public String toString() {
        return String.format("Ma so: %s\nHo Ten: %s\nNgay Sinh: %s\nSo Du: %.1f\n",this.id, this.name, this.sinh,this.balance);
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
}