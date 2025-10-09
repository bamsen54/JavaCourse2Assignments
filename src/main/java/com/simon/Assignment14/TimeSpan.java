package com.simon.Assignment14;

public class TimeSpan {

    private int hours;
    private int minutes;

    public TimeSpan() {

    }

    public TimeSpan(int hours, int minutes) {

        this.hours = hours;
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void addTime(int hours, int minutes) {
        this.hours += hours;
        this.minutes += minutes;

        if( this.minutes < 60 )
            return;

        this.hours += this.minutes / 60;
        this.minutes = this.minutes % 60; // integer division
    }

    public void subtractTime(int hours, int minutes) {

        final int currentInterval = 60 * this.hours + this.minutes;
        final int timeToSubtract   = 60 * hours + minutes;

        if( timeToSubtract > currentInterval )
            throw new NotEnoughTimeException( "can not subract more time than the interval" );

        this.hours -= hours;
        this.minutes -= minutes;

        this.hours += this.minutes / 60;
        this.minutes = this.minutes % 60; // integer division
    }

    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append(hours);
        builder.append(":");
        builder.append(minutes);
        return builder.toString();
    }
}
