package com.ngourley.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
    protected String name;
    protected String url;

    List<MenuComponent> menuComponents = new ArrayList<>();

    public String getName() {
        return this.name = name;
    }

    public String getUrl() {
        return this.url;
    }

    public MenuComponent add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not supported as this level");
    }

    public MenuComponent remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not supported as this level");
    }

    public abstract String toString();

    public String print() {
        StringBuilder builder = new StringBuilder(this.name);
        builder.append(": ");
        builder.append(this.url);
        builder.append("\n");
        return builder.toString();
    }
}
