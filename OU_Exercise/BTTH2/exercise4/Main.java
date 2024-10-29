package exercise4;

import exercise1.Diem;

public class Main {
    public static void main(String[] args) {
        Diem center1 = new Diem(0, 0); 
        double radius1 = 5; 
        HinhTron circle1 = new HinhTron(center1, radius1);

        Diem center2 = new Diem(3, 4); 
        double radius2 = 3; 
        HinhTron circle2 = new HinhTron(center2, radius2);

        String relation = circle1.checkCirclesPositionRelative(circle2);
        System.out.println("Vị trí tương đối giữa hai hình tròn: " + relation);

        Diem testPoint = new Diem(1, 1); 

        String pointRelation = circle1.checkPointRelationToCircle(testPoint);
        System.out.println("Vị trí của điểm với hình tròn 1: " + pointRelation);
    }
}
