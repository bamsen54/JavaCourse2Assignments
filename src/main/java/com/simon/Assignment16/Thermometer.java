package com.simon.Assignment16;

import java.util.ArrayList;

public class Thermometer {

    private ArrayList<Double> temperatures = new ArrayList<>();

    public Thermometer() {

    }


    public ArrayList<Double> getTemperatures() {
        return temperatures;
    }

    public void setTemperatures(ArrayList<Double> temperatures) {
        this.temperatures = temperatures;
    }

    public void addTemperatures(double temperatureInCelcius) {

        this.temperatures.add( temperatureInCelcius );
    }

    public double getAverageTemperature() {

        final int N = this.temperatures.size();

        double total = 0;

        for( double temperature : this.temperatures)
            total += temperature;

        final double average = total / N;
        return average;
    }
}
