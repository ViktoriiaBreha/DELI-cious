package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Sandwich extends ItemToOrder{

    private String typeOfBread;
    private boolean isToasted;
    private List<String>meats;
    private List<String>cheeses;
    private List<String>toppings;
    private List<String>sauces;

    public Sandwich(double price, int size, String description, String typeOfBread, boolean isToasted, List<String> meats, List<String> cheeses, List<String> toppings, List<String> sauces) {
        super(price, size, description);
        this.typeOfBread = typeOfBread;
        this.isToasted = isToasted;
        this.meats = new ArrayList<>();
        this.cheeses = new ArrayList<>();
        this.toppings = new ArrayList<>();
        this.sauces = new ArrayList<>();
    }

    public void addMeat (String meat){
        meats.add(meat);
    }

    public void addCheese (String cheese){
        cheeses.add(cheese);
    }

    public void addTopping (String topping){
        toppings.add(topping);
    }

    public void addSauce (String sauce){
        sauces.add(sauce);
    }

    //Calculate a general price
    @Override
    public double getPrice (){
        double basePrice;
        switch (size){
            case 4:
                basePrice = 5.50;
                break;
            case 8:
                basePrice = 7.00;
                break;
            case 12:
                basePrice = 8.50;
                break;
            default:
                basePrice = 0.00;
                break;
        }

        //Calculate price with meat
        basePrice += meats.size() * 1.00;

        //Calculate price with cheese
        basePrice += cheeses.size() + 0.75;

        //Toppings, sauces are included

        return basePrice;
    }




}
