import java.util.*;

public class Solution {
    public static Point pointWithHighestOriginDistance(Point p1, Point p2, Point p3) {
        double x1 = p1.x;
        double y1 = p1.y;
        double d1 = Math.sqrt(x1 * x1 + y1 * y1);
        
        double x2 = p2.x;
        double y2 = p2.y;
        double d2 = Math.sqrt(x2 * x2 + y2 * y2);
        
        double x3 = p3.x;
        double y3 = p3.y;
        double d3 = Math.sqrt(x3 * x3 + y3 * y3);
        
        if (d1 > d2 && d1 > d3) {
            return p1;
        } else if (d2 > d1 && d2 > d3) {
            return p2;
        }
        
        return p3;
    }
    
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        
        sc.close();
        
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        Point p3 = new Point(x3, y3);
        
        Point result = pointWithHighestOriginDistance(p1, p2, p3);
        
        System.out.println(result.x);
        System.out.println(result.y);
    }
}

class Point {
    double x;
    double y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}