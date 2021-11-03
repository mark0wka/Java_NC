package com.mark0wka.boll;

import java.util.Objects;

public class Container {

    private int x1 = 0;
    private int y1 = 0;
    private int x2 = 0;
    private int y2 = 0;

    public Container(int x1, int y1, int width, int height) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x1 + width;
        this.y2 = y1 + height;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getWidth() {
        return x2 - x1;
    }

    public int getHeight() {
        return y2 - y1;
    }

    @Override
    public String toString() {
        return "Container{" +
                "(" + x1 +
                ", " + y1 +
                "), (" + x2 +
                ", " + y2 +
                ")}";
    }

    public boolean collideWith(Boll boll) {
        if ((boll.getX() - boll.getRadius() >= this.x1) && (boll.getX() + boll.getRadius() <= this.x2) && (boll.getY() - boll.getRadius() >= this.y1) && (boll.getY() + boll.getRadius() <= this.y2)) {
            return true;
        } else return false;
    }

    public boolean collideWithVertical(Boll boll) {
        if ((boll.getY() - boll.getRadius() >= this.y1) && (boll.getY() + boll.getRadius() <= this.y2)) {
            return true;
        } else return false;
    }

    public boolean collideWithHorizontal(Boll boll) {
        if ((boll.getX() - boll.getRadius() >= this.x1) && (boll.getX() + boll.getRadius() <= this.x2)) {
            return true;
        } else return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Container container = (Container) o;
        return x1 == container.x1 && y1 == container.y1 && x2 == container.x2 && y2 == container.y2;
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + x1;
        result = 31 * result + x2;
        result = 31 * result + y1;
        result = 31 * result + y2;

        return result;
    }
}
