package exercise2;

import exercise1.Diem;

public class Main {
    public static void main(String[] args) {
        // Create points for the first line segment
        Diem p1 = new Diem(1, 2);
        Diem p2 = new Diem(4, 6);
        
        // Create the first line segment
        DoanThang line1 = new DoanThang(p1, p2);
        
        // Create points for the second line segment
        Diem p3 = new Diem(2, 3);
        Diem p4 = new Diem(5, 7);
        
        // Create the second line segment
        DoanThang line2 = new DoanThang(p3, p4);
        
        // Display line segments
        System.out.println("Line Segment 1: " + line1);
        System.out.println("Line Segment 2: " + line2);
        
        // Calculate and display the distance between points
        int distance = line1.calculateDistanceTo();
        System.out.println("Distance between points in Line Segment 1: " + distance);
        
        // Calculate and display the midpoint of the first line segment
        Diem midpoint = line1.calculateMidpoint();
        System.out.println("Midpoint of Line Segment 1: (" + midpoint.getX() + ", " + midpoint.getY() + ")");
        
        // Check if the two line segments are parallel
        boolean parallel = line1.isParallel(line2);
        System.out.println("Are Line Segment 1 and Line Segment 2 parallel? " + parallel);
    }
}
