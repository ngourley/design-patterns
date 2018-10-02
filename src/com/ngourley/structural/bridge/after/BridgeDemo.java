package com.ngourley.structural.bridge.after;

/**
 * Bridge Pattern
 * https://www.oodesign.com/bridge-pattern.html
 */
public class BridgeDemo {

    public static void main(String[] args) {

        Square blueSquare = new Square(new Blue());
        Circle greenCircle = new Circle(new Green());

        blueSquare.applyColor();
        greenCircle.applyColor();

    }
}
