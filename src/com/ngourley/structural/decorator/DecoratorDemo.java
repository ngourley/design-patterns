package com.ngourley.structural.decorator;

public class DecoratorDemo {

    public static void main(String[] args) {
        Sandwich sandwich = new MeatSandwichDecorator(new SimpleSandwich());
        String result = sandwich.make();
        System.out.println(result);

        Sandwich sandwich1 = new MayoSandwichDecorator(new MeatSandwichDecorator(new SimpleSandwich()));
        String result1 = sandwich1.make();
        System.out.println(result1);
    }
}
