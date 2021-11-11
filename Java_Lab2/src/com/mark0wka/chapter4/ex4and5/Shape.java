package com.mark0wka.chapter4.ex4and5;

public abstract class Shape {

    Point point;

    public Shape() {
    }

    public void moveBy(double dx, double dy) {
        this.point.setX(this.point.getX() + dx);
        this.point.setY(this.point.getY() + dy);
    }

    abstract public Point getCentre();
}
