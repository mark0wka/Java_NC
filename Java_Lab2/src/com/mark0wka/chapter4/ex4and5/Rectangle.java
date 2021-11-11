package com.mark0wka.chapter4.ex4and5;

public class Rectangle extends Shape implements Cloneable{

    private double height = 0.0;
    private double length = 0.0;

    public Rectangle(Point topLeft, double height, double length) {
        this.point = new Point(topLeft.getX(), topLeft.getY());
        this.height = height;
        this.length = length;
    }

    @Override
    public Point getCentre() {
        return new Point(this.point.getX() + length * 0.5, this.point.getY() + height * 0.5);
    }

    @Override
    public Rectangle clone() {
        Rectangle rectangle = new Rectangle(new Point(point.getX(), point.getY()), this.height, this.length);
        return rectangle;
    }
}
