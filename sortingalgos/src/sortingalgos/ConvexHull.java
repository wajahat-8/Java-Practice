package sortingalgos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class ConvexHull {
    public static class Point2D implements Comparable<Point2D> {
        private final double x;
        private final double y;

        public Point2D(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        // Fix typo in method name
        public int compareTo(Point2D that) {
            if (this.y < that.y) return -1;
            if (this.y > that.y) return +1;
            if (this.x < that.x) return -1;
            if (this.x > that.x) return +1;
            return 0;
        }

        public static int ccw(Point2D a, Point2D b, Point2D c) {
            double area2 = (b.x - a.x) * (c.y - a.y) - (b.y - a.y) * (c.x - a.x);
            if (area2 < 0) return -1;
            else if (area2 > 0) return +1;
            else return 0;
        }

        public double angleTo(Point2D that) {
            return Math.atan2(that.y - this.y, that.x - this.x);
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    public static List<Point2D> convexHull(List<Point2D> points) {
        // Fix the use of Collections.min instead of Collection.min
        Point2D pivotPoint2d = Collections.min(points);
        Collections.sort(points, new PolarOrderComparator(pivotPoint2d));

        Stack<Point2D> hull = new Stack<>();
        hull.push(points.get(0));
        hull.push(points.get(1));
        for (int i = 2; i < points.size(); i++) {
            Point2D top = hull.pop();
            while (Point2D.ccw(hull.peek(), top, points.get(i)) <= 0) {
                top = hull.pop();
            }
            hull.push(top);
            hull.push(points.get(i));
        }
        return new ArrayList<>(hull);
    }

    private static class PolarOrderComparator implements Comparator<Point2D> {
        private final Point2D reference;

        public PolarOrderComparator(Point2D reference) {
            this.reference = reference;
        }

        @Override
        public int compare(Point2D p1, Point2D p2) {
            double angle1 = reference.angleTo(p1);
            double angle2 = reference.angleTo(p2);
            return Double.compare(angle1, angle2);
        }
    }

    public static void main(String[] args) {
        List<Point2D> points = new ArrayList<>();
        points.add(new Point2D(0, 0));
        points.add(new Point2D(1, 1));
        points.add(new Point2D(2, 2));
        points.add(new Point2D(0, 2));
        points.add(new Point2D(2, 0));
        points.add(new Point2D(1, 2));
        points.add(new Point2D(2, 1));

        List<Point2D> hull = ConvexHull.convexHull(points);
        System.out.println("Convex Hull:");
        for (Point2D p : hull) {
            System.out.println(p);
        }
    }
}



