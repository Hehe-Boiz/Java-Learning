package exercise1;

public class Tester {
    public static void main(String[] args) throws ClassNotFoundException {
        Hinh h1 = new HinhChuNhat(20, 10, "AAA");
        Hinh h2 = new TamGiac(10, 5, 7, "BBB");
        Hinh h3 = new TamGiacCan(5, 8, "BBB");
        Hinh h4 = new TamGiacDeu(6, "BBB");
        Hinh h5 = new Ellipse(5, 3, "CCC");
        Hinh h6 = new HinhVuong(10, "AAA");
        Hinh h7 = new TamGiacCan(10, 8, "DDD");

        QLHinh q1 = new QLHinh();
        q1.addHinh(h1,h2,h3,h4,h5,h6,h7);

        System.out.println("a)================");
        q1.display();
        System.out.println("b)================");
        q1.timKiem("exercise1.TamGiacCan").forEach(h -> System.out.println(h));
        System.out.println("c)================");
        q1.sortGiam();
        q1.display();
        System.out.println("d)================");
        q1.sortName();
        q1.display();
        System.out.println("e)================");
        System.out.println(q1.tinhTB());
        System.out.println("f)================");
        System.out.println(q1.timHinh(new TamGiacCan(10, 8, "DDD")));
    }    
}
