package com.simon.Assignment33;

public class Car extends Vehicle {

    private int litersOfFuel;

    public Car() {
    }

    public Car(boolean running, int speed, int litersOfFuel) {
        super(running, speed);
        this.litersOfFuel = litersOfFuel;
    }

    public int getLitersOfFuel() {
        return litersOfFuel;
    }

    public void setLitersOfFuel(int litersOfFuel) {
        this.litersOfFuel = litersOfFuel;
    }
}
