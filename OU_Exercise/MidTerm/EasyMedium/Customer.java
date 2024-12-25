package OU_Exercise.MidTerm.EasyMedium;

import java.time.LocalDate;

public class Customer {
    private static int count =0;
    protected String id;
    protected String fullname;
    protected String email;
    protected String sdt;
    protected LocalDate brithDate;

    public Customer(String fullname, String email, String sdt, String brithDate) {
        this.id = String.format("CUST-%05d", ++count);
        this.fullname = fullname;
        this.email = email;
        this.sdt = sdt;
        this.brithDate = LocalDate.parse(brithDate, Config.FORMATTER);
    }

    public String getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public LocalDate getBrithDate() {
        return brithDate;
    }

    public void setBrithDate(LocalDate brithDate) {
        this.brithDate = brithDate;
    }

    public boolean isOver18YearsOld(){
        return LocalDate.now().getYear() - brithDate.getYear() > 18;
    }
}
