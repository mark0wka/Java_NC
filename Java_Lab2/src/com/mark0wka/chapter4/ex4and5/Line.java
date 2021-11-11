package com.mark0wka.chapter4.ex4and5;

public class Line extends Shape implements Cloneable{

    Point to = new Point();

    public Line(Point from, Point to) {
        this.point = new Point(from.getX(), from.getY());
        this.to = new Point(to.getX(), to.getY());
    }



    @Override
    public Point getCentre() {
        double x = 0.0;
        double y = 0.0;
        x = (this.point.getX() + this.to.getX()) * 0.5;
        y = (this.point.getY() + this.to.getY()) * 0.5;
        return new Point(x, y);
    }

    @Override
    public Line clone() {
        Line line = new Line(new Point(point.getX(), point.getY()), new Point(to.getX(), to.getY()));
        return line;
    }
}
