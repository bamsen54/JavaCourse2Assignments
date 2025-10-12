package com.simon.Assignment33;

public class Vehicle {

    private boolean running;
    private int speed;

    public Vehicle() {
    }

    public Vehicle(boolean running, int speed) {
        this.running = running;
        this.speed = speed;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


}
