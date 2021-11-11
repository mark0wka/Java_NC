package com.mark0wka.chapter4.ex4and5;

public class Circle extends Shape implements Cloneable{

    double radius;

    public Circle(Point centre, double radius) {
        this.point = new Point(centre.getX(), centre.getY());
        this.radius = radius;
    }

    @Override
    public Point getCentre() {
        return this.point;
    }

    @Override
    public Circle clone() {
        Circle circle = new Circle(new Point(point.getX(), point.getY()), this.radius);
        return circle;
    }
}
