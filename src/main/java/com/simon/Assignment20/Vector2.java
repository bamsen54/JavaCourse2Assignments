package com.simon.Assignment20;

public class Vector2 {

    private double x, y;

    private Vector2() {

    }

    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double length() {

        return Math.sqrt( this.x * this.x + this.y * this.y ); // distance from (0, 0)
    }

    public double distanceTo( Vector2 vector ) {

        return Math.sqrt( this.x * vector.x + this.y * vector.y );
    }
    
    public Vector2 add(Vector2 vector) {

        this.x += vector.x;
        this.y += vector.y;

        return this;
    }
}
