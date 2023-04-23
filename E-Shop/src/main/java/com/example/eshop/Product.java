package com.example.eshop;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Product {
    private SimpleIntegerProperty id;
    private SimpleStringProperty name;
    private SimpleIntegerProperty price;
    private SimpleDoubleProperty rating;

    public Product(int id, String name, int price, double rating) {
        this.id = new SimpleIntegerProperty(id);
        this.name = new SimpleStringProperty(name);
        this.price = new SimpleIntegerProperty(price);
        this.rating = new SimpleDoubleProperty(rating);
    }

    public int getId() {
        return id.get();
    }

    public String getName() {
        return name.get();
    }

    public int getPrice() {
        return price.get();
    }
    public double getRating(){ return rating.get();}

}
