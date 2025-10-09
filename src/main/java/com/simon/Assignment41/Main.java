package com.simon.Assignment41;

// 41. Skapa ett interface Payable med metoden calculatePayment(). Implementera i
//Employee och Freelancer.

import static java.lang.IO.*;

public class Main {

    void main() {

        Employee employee = new Employee(1000);
        Freelancer freelancer = new Freelancer();

        println(employee.calculateSalary(200) );
        println(freelancer.calculateSalary(1600) );
    }
}
