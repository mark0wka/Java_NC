package com.mark0wka.chapter2;

public final class EX5Point {

    private double x = 0.0;
    private double y = 0.0;

    public EX5Point() {
    }

    public EX5Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public EX5Point translate (double x, double y) {
        return new EX5Point(this.x + x, this.y + y);
    }

    public EX5Point scale (double coef) {
        return new EX5Point(this.x * coef, this.y * coef);
    }

    @Override
    public String toString() {
        return "EX5Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
