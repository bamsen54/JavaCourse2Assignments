package com.simon.Assignment23;

// 23. Skapa en klass Product med pris och namn. Lägg till metod
// applyDiscount(double percent)

import static java.lang.IO.*;

public class Main {

    void main() {

        Product p = new Product("milk", 1.25);
        p.applyDiscount(25);

        Order orders = new Order();

        orders.addProduct( p );
        orders.addProduct( new Product( "Cookies", 1.5 ) );

        orders.printReceipt();
    }
}
