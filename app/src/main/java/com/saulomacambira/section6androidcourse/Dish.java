package com.saulomacambira.section6androidcourse;

import java.text.DecimalFormat;

public class Dish {
    String title;
    String description;
    int price;

    public Dish(String title, String description, int price){
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public Dish(){}

    @Override
    public String toString() {
        return title + " - " + description + " - R$ " + price;
    }
}
