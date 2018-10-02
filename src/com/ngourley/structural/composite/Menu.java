package com.ngourley.structural.composite;

import java.util.Iterator;

public class Menu extends MenuComponent {

    public Menu (String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public MenuComponent add(MenuComponent menuComponent) {
        this.menuComponents.add(menuComponent);
        return menuComponent;
    }

    @Override
    public MenuComponent remove(MenuComponent menuComponent) {
        this.menuComponents.remove(menuComponent);
        return menuComponent;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.print());


        Iterator<MenuComponent> iterator = this.menuComponents.iterator();

        while(iterator.hasNext()) {
            MenuComponent component = iterator.next();
            builder.append(component.toString());
        }

        return builder.toString();
    }

}
