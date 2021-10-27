package com.mark0wka.boll;

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

}
