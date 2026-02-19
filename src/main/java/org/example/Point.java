package org.example;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

    }

    public double distance(Point point) {
        // gelen obje null mı kontrol edelim tedbirli yaklasim;
        if (point == null) {
            System.out.println("gelen obje null olmamalidir!!");
            return 0;
        }

        return Math.sqrt(Math.pow((x - point.x), 2) + Math.pow((y - point.y), 2));
        // return distance(point.x, point.y); şeklinde de alttaki methodu çağırarak da bu şekilde kodumu optimize edebilirim.
    }

    ;

    public double distance(int a, int b) {
        return Math.sqrt(Math.pow((this.x - a), 2) + Math.pow((this.y - b), 2));
    }

}
