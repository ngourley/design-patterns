package com.ngourley.structural.flyweight;

public class Order {
    public final int orderNumber;
    public final Item item;

    public Order(int orderNumber, Item item) {
        this.orderNumber = orderNumber;
        this.item = item;
    }

    public void processOrder() {
        System.out.println("Order item " + this.item + " for order number " + this.orderNumber);
    }

}
