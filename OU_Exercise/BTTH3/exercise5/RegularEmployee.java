package exercise5;

public class RegularEmployee extends Employee{
    public RegularEmployee(String cCCD, String name, String sex, int sDT, String hometown){
        super(cCCD, name, sex, sDT, hometown);
    }

    @Override
    public double tinhLuong(int soNgayCong){
        return BASE_SALARY * soNgayCong;
    }
}
