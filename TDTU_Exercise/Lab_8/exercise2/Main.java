package exercise2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(1,2));
        points.add(new Point(3,4));
        points.add(new Point(0.5, 0.5));
        points.add(new Point(0.8, 0.2));
        points.add(new Point(0.1, -0.7));
        points.add(new Point(-0.6, 0.9));
        points.add(new Point(-0.2, -0.4));

        System.out.println("Points inside the circle with center O(0, 0) and radius 1:");
        for(Point p : points){
            double distance = Math.sqrt(p.getX()*p.getX() + p.getY()*p.getY());
            if(distance <= 1){
                System.out.println(p);
            }
        }
    }
}
