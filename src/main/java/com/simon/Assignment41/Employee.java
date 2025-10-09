package com.simon.Assignment41;

public class Employee {

    double baseSalary;

    public Employee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double calculateSalary(double commision) {
        return baseSalary + commision;
    }
}
