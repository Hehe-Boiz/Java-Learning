package exercise3;

public class Vaccine {
    private static int dem = 0;
    private int id;    
    private String name;
    private String xuatXu;
    private int soLuong;
    private int usedCount;

    public Vaccine(String name, String xuatXu, int soLuong) {
        this.id = ++dem;
        this.name = name;
        this.xuatXu = xuatXu;
        this.soLuong = soLuong;
        this.usedCount = 0; // ban đầu không có ai tiêm 
    }

    public static int getDem() {
        return dem;
    }

    public static void setDem(int dem) {
        Vaccine.dem = dem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getUsedCount() {
        return usedCount;
    }

    public void setUsedCount(int usedCount) {
        this.usedCount = usedCount;
    }

    @Override
    public String toString() {
        return "Vaccine [id=" + id + ", name=" + name + ", xuatXu=" + xuatXu + ", soLuong=" + soLuong + ", usedCount="
                + usedCount + "]";
    }
}
