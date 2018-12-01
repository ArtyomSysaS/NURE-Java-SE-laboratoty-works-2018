package general_team_tasks.variant_01;

import Utilities.Utilities;

public class Point implements Comparable<Point> {
    private double x;
    private double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x = " + x +
                ", y = " + y +
                ", расстояние от начала координат = " + Utilities.calculateDistanceBetweenPoints(this.x, this.y, 0, 0) +
                '}';
    }

    @Override
    public int compareTo(Point o) {
        if (this.getX() < o.getX()) return 1;
        if (this.getX() > o.getX()) return -1;
        return 0;
    }
}
