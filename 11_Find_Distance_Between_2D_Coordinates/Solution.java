import java.util.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        // Read inputs
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        sc.close();
        
        // Create Point objects
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        
        // Find the distance
        double distance = findDistance(p1, p2);
        
        // Print formatted result
        System.out.format("%.3f", distance);
    }
    
    public static double findDistance(Point p1, Point p2) {
        int dx = p2.x - p1.x;
        int dy = p2.y - p1.y; 
        double distance = Math.sqrt((dx * dx) + (dy * dy));
        
        return distance;
    }
}

class Point {
    int x, y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}