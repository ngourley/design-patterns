package com.ngourley.structural.composite;

public class MenuItem extends MenuComponent {

    public MenuItem(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String toString() {
        return this.print();
    }
}
