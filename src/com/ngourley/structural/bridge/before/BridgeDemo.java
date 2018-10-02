package com.ngourley.structural.bridge.before;

public class BridgeDemo {

    public static void main(String[] args) {

        Circle blueCircle = new BlueCircle();

        Square redSquare = new RedSquare();

        Square greenSquare = new GreenSquare();


        blueCircle.applyColor();
        redSquare.applyColor();
        greenSquare.applyColor();

    }
}
