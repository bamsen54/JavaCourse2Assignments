package com.simon.Assignment12;

public class Angle {

    private double angleInDegrees;

    public Angle() {

    }

    public Angle(double angleInDegrees) {

        this.angleInDegrees = angleInDegrees;
    }

    public double getAngleInDegrees() {
        return angleInDegrees;
    }

    public void setAngleInDegrees(double angleInDegrees) {
        this.angleInDegrees = angleInDegrees;
    }

    public void addToAngleInDegrees(double angleInDegrees) {

        this.angleInDegrees += angleInDegrees;
    }

    public double getAngleInRadians() {

        return this.angleInDegrees * Math.PI / 180.0;
    }
}
