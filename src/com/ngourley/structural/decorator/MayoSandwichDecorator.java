package com.ngourley.structural.decorator;

public class MayoSandwichDecorator extends SandwichDecorator {

    public MayoSandwichDecorator (Sandwich sandwich) {
        super(sandwich);
        this.sandwich = sandwich;
    }

    @Override
    public String make() {
        return this.sandwich.make() + " + mayo";
    }
}
