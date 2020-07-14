package io.windfree.compare;

import java.util.Comparator;

public class Point {
    public int x;
    public int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class XCompare implements Comparator<Point> {
    @Override
    public  int compare(Point p1, Point p2) {
        if(p1.x > p2.x) {
            return 1;
        } else if (p1.x == p1.x) {
            return 0;
        } else return -1;
    }
}


class YCompare implements Comparator<Point> {
    @Override
    public  int compare(Point p1, Point p2) {
        if(p1.y > p2.y) {
            return 1;
        } else if (p1.y == p1.y) {
            return 0;
        } else return -1;
    }
}
