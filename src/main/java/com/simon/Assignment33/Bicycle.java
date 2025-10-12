package com.simon.Assignment33;

public class Bicycle extends Vehicle {

    private boolean hasLamps;

    public Bicycle() {
    }

    public Bicycle(boolean running, int speed, boolean hasLamps) {
        super(running, speed);
        this.hasLamps = hasLamps;
    }

    public boolean isHasLamps() {
        return hasLamps;
    }

    public void setHasLamps(boolean hasLamps) {
        this.hasLamps = hasLamps;
    }
}
