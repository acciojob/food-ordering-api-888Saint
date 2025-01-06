package com.driver;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Food> menuItems;

    public Menu() {
    	// your code goes here
        menuItems = new ArrayList<>();
    }

    public void addMenuItem(Food food) {
    	// your code goes here
        menuItems.add(food);
    }

    public List<Food> getMenuItems() {
    	// your code goes here
        return menuItems;
    }

    public Food getMenuItemById(int id) {
        for (Food food : menuItems) {
            if (food.getId() == id) {
                return food;
            }
        }
        return null;
    }
}