package com.mark0wka.figures;

import java.util.Objects;

public class Triangle {

    private MyPoint v1 = new MyPoint();
    private MyPoint v2 = new MyPoint();
    private MyPoint v3 = new MyPoint();

    public Triangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.v1.setXY(x1, y1);
        this.v2.setXY(x2, y2);
        this.v3.setXY(x3, y3);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                '}';
    }

    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    public String getType() {
        String result = "";
        double length1 = this.v1.distance(v2);
        double length2 = this.v2.distance(v3);
        double length3 = this.v3.distance(v1);
        if (this.isEquivalent(length1, length2) && this.isEquivalent(length1, length3)) {
            return "Equilateral";
        } else if (this.isEquivalent(length1, length2) || this.isEquivalent(length1, length3) || this.isEquivalent(length2, length3)) {
            return "Isosceles";
        } else return "Regular";
    }

    private boolean isEquivalent(double length1, double length2) {
        if (Math.abs(length1 - length2) < 0.0001) {
            return true;
        } else return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(v1, triangle.v1) && Objects.equals(v2, triangle.v2) && Objects.equals(v3, triangle.v3);
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + v1.hashCode();
        result = 31 * result + v2.hashCode();
        result = 31 * result + v3.hashCode();

        return result;
    }
}
