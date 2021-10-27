package com.mark0wka.boll;

public class Boll {

    private float x = 0;
    private float y = 0;
    private int radius = 0;
    private float xDelta = 0;
    private float yDelta = 0;

    public Boll(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = (float) (Math.floor(speed * Math.cos(Math.toRadians(direction)) * 10000) / 10000);
        this.yDelta = (float) (Math.floor(speed * Math.sin(Math.toRadians(direction)) * 10000) / 10000);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move() {
        this.x += this.xDelta;
        this.y += this.yDelta;
    }

    public void reflectHorizontal() {
        this.xDelta = -this.xDelta;
    }

    public void reflectVertical() {
        this.yDelta = -this.yDelta;
    }

    @Override
    public String toString() {
        return "Boll{" +
                "(" + x +
                ", " + y +
                "), radius = " + radius +
                ", speed = (" + xDelta +
                ", " + yDelta +
                ")}";
    }

    //Метод проверяет границы контейнера и просчитывает траекторию мяча с учетом столкновений со стенками
    public void smartMove(Container container) {
        if (container.collideWith(this)) {
            this.x += this.xDelta;
            this.y += this.yDelta;
        } else if (!container.collideWithHorizontal(this) && container.collideWithVertical(this)) {
            this.x -= 2 * ((this.x + this.radius * Math.signum(this.xDelta)) - container.getX1() - ((Math.signum(this.xDelta) + 1.0)/2) * container.getWidth());
            this.reflectHorizontal();
            this.x += this.xDelta;
            this.y += this.yDelta;
        } else if (!container.collideWithVertical(this) && container.collideWithHorizontal(this)) {
            this.y -= 2 * ((this.y + this.radius * Math.signum(this.yDelta)) - container.getY1() - ((Math.signum(this.yDelta) + 1.0)/2) * container.getHeight());
            this.reflectVertical();
            this.x += this.xDelta;
            this.y += this.yDelta;
        } else {
            double tmpX = 2 * ((this.x + this.radius * Math.signum(this.xDelta)) - container.getX1() - ((Math.signum(this.xDelta) + 1.0)/2) * container.getWidth());
            double tmpY = 2 * ((this.y + this.radius * Math.signum(this.yDelta)) - container.getY1() - ((Math.signum(this.yDelta) + 1.0)/2) * container.getHeight());
            this.x -= tmpX;
            this.y -= tmpY;
            this.reflectHorizontal();
            this.reflectVertical();
            this.x += this.xDelta;
            this.y += this.yDelta;
        }

    }
}
