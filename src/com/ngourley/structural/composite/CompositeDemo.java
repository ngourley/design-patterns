package com.ngourley.structural.composite;

public class CompositeDemo {

    public static void main(String[] args) {

        Menu menu = new Menu("Menu", "/menu");

        MenuItem menuItem = new MenuItem("Derp", "/derp");
        menu.add(menuItem);

        Menu scooby = new Menu("Something Else", "/hello");
        menu.add(scooby);

        System.out.println(menu);
    }
}
