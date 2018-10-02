package com.ngourley.structural.decorator;

public class MeatSandwichDecorator extends SandwichDecorator {

    public MeatSandwichDecorator(Sandwich sandwich) {
        super(sandwich);
        this.sandwich = sandwich;
    }

    @Override
    public String make() {
        return this.sandwich.make() + this.addMeat();
    }

    private String addMeat() {
        return " + turkey";
    }

}
