package com.simon.Assignment23;

import static java.lang.IO.*;

public class Order {

    Product[] products = new Product[0];

    public Order() {
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void addProduct(Product product) {

        Product[] newArray = new Product[this.products.length + 1];

        for( int k = 0; k < this.products.length; k++ )
            newArray[k] = this.products[k];

        newArray[this.products.length] = product;

        this.products = newArray;
    }

    public void printReceipt() {

        double totalPrice = 0;
        for( Product product: this.products ) {

            println(product.getName() + " " + product.getPrice() );

            totalPrice += product.getPrice();
        }

        println("Total price: " + totalPrice );
    }
}
