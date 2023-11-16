package com.workintech.S1D4;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String distance() {
        double d = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
        return "(0,0) noktasına olan uzaklığı: " + d;
    }

    public String distance(Point p) {
        double d = Math.sqrt(Math.pow((p.x - this.x), 2) + Math.pow(p.y - this.y, 2));
        return "(" + p.x + "," + p.y + ")" + "noktasına olan uzaklığı: " + d;
    }

    public String distance(int a, int b) {
        double d = Math.sqrt(Math.pow(a - this.x, 2) + Math.pow(b - this.y, 2));
        return "(" + a + "," + b + ")" + " noktasına olan uzaklığı: " + d;
    }
}
