package exercise3;

import java.time.LocalDate;

public class Foreigner extends Person{
    private String passportNumber;
    private String nationality;

    public Foreigner(String id, String name, String gender, String phone, LocalDate birthDate,
                    String passportNumber, String nationality) {
        super(id, name, gender, phone, birthDate);
        this.passportNumber = passportNumber;
        this.nationality = nationality;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getNationality() {
        return nationality;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Foreigner: passportNumber=" + passportNumber + ", nationality=" + nationality + "]";
    }

    
}
