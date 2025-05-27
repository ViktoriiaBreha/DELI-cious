package com.pluralsight;

public abstract class ItemToOrder {
    //Create values that I will use in other classes like Sandwich, drinks...
    protected double price;
    protected int size;
    protected String description;

    public ItemToOrder(double price, int size, String description) {
        this.price = price;
        this.size = size;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public int getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}