package com.ngourley.structural.flyweight;

/**
 * The flyweight pattern is used when you need to make a more efficient use of memory.
 * You have a large number of similar object.
 * Immutable.
 * Most of the object states can be extrinsic.
 *
 * It is a pattern of patterns. Utilizes a factory, encompasses creation and structural .
 *
 */
public class DemoFlyweight {

    public static void main(String[] args) {

        InventorySystem ims = new InventorySystem();

        ims.takeOrder("Roomba", 221);
        ims.takeOrder("Bose Headphones", 361);
        ims.takeOrder("Samsung TV", 432);
        ims.takeOrder("Samsung TV", 323);
        ims.takeOrder("Roomba", 563);
        ims.takeOrder("Bose Headphones", 321);
        ims.takeOrder("Roomba", 234);
        ims.takeOrder("Samsung TV", 54);
        ims.takeOrder("Roomba", 34);
        ims.takeOrder("Bose Headphones", 365);
        ims.takeOrder("Samsung TV", 332);
        ims.takeOrder("Roomba", 456);

        ims.process();

        System.out.println(ims.report());

    }
}
