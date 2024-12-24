package OU_Exercise.MidTerm.SoEasy;

public class Subject {
    private static int count =0;
    private String id;
    private String nameSubject;
    private double tinChi;
    private int max;
    private int studentCount;
    public Subject(String nameSubject, double tinChi, int max) {
        this.id = String.format("HeheBoiz-%04d", ++count);
        this.nameSubject = nameSubject;
        this.tinChi = tinChi;
        this.max = max;
        this.studentCount = 0;
    }
    public static int getCount() {
        return count;
    }
    public static void setCount(int count) {
        Subject.count = count;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNameSubject() {
        return nameSubject;
    }
    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }
    public double getTinChi() {
        return tinChi;
    }
    public void setTinChi(double tinChi) {
        this.tinChi = tinChi;
    }
    public int getStudentCount() {
        return studentCount;
    }
    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }
    @Override
    public String toString() {
        return "Subject: id: " + id + ", Tên môn học: " + nameSubject + ", Số tín chỉ: " + tinChi + ", Số lượng sinh viên tối đa: "
                + studentCount;
    }
    public int getMax() {
        return max;
    }
    public void setMax(int max) {
        this.max = max;
    }

    
}
