package OU_Exercise.MidTerm.EasyMedium;


public class Vietnamese extends Customer{
    private String CCCD;

    public Vietnamese(String fullname, String email, String sdt, String brithDate, String cCCD) {
        super(fullname, email, sdt, brithDate);
        CCCD = cCCD;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String cCCD) {
        CCCD = cCCD;
    }
}
