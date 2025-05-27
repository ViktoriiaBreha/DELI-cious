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

    public Sandwich( int size, String typeOfBread, boolean isToasted) {
        super(0.00, size , "");
        this.typeOfBread = typeOfBread;
        this.isToasted = isToasted;
        this.meats = new ArrayList<>(meats);
        this.cheeses = new ArrayList<>(cheeses);
        this.toppings = new ArrayList<>(toppings);
        this.sauces = new ArrayList<>(sauces);
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

    //Structure of displaying
    @Override
    public String getDescription() {
        return "\nSize: " + size + " | \nSandwich with " + typeOfBread + " bread | " + (isToasted ? "toasted: " : "") +
                " | \nMeat: " + meats + " | \nCheese: " + cheeses + " | \nTopping: " + toppings + " | \nSauces: " + sauces;
    }
}
