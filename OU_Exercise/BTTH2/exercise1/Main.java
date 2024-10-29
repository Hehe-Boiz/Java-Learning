package exercise1;

public class Main {
    public static void main(String[] args) {
        Diem point1 = new Diem(3.0, 4.0);
        Diem point2 = new Diem(7.0, 1.0);

        int distance = point1.calculateDistanceTo(point2);

        System.out.println("Khoảng cách giữa " + point1 + " và " + point2 + " là: " + distance);
    }
}
