package com.simon.Assignment34;

import static java.lang.IO.*;


public class Manager extends Employee {

    private int officeSize;

    public Manager() {
    }

    public Manager(String name, int salary, int officeSize) {
        super(name, salary);
        this.officeSize = officeSize;
    }

    public int getOfficeSize() {
        return officeSize;
    }

    public void setOfficeSize(int officeSize) {
        this.officeSize = officeSize;
    }

    public void fireEmployee() {

        println("Manager fires employee");
    }
}
