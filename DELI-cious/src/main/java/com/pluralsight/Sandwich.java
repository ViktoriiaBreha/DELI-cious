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
    private boolean isExtraMeat;
    private boolean isExtraCheese;
    private ArrayList<String> sides;


    public Sandwich(int size, String typeOfBread, boolean isToasted) {
        super(0.00, size , "");
        this.typeOfBread = typeOfBread;
        this.isToasted = isToasted;
        this.meats = new ArrayList<>();
        this.cheeses = new ArrayList<>();
        this.toppings = new ArrayList<>();
        this.sauces = new ArrayList<>();
        this.sides = new ArrayList<>();
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

    public void addSide (String side){
        sides.add(side);
    }

    //Calculate a general price
    @Override
    public double getPrice (){
        double basePrice;
        double meatPrice;
        double cheesePrice;

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

        //Calculate base prices for meat and cheese depend on size
        switch (size) {
            case 4:
                meatPrice = 1.00;
                cheesePrice = 0.75;
                break;
            case 8:
                meatPrice = 1.50;
                cheesePrice = 1.00;
                break;
            case 12:
                meatPrice = 2.00;
                cheesePrice = 1.25;
                break;
            default:
                meatPrice = 0.00;
                cheesePrice = 0.00;
                break;
        }

        basePrice += meats.size() * meatPrice;
        basePrice += cheeses.size() * cheesePrice;

        //Toppings, sauces are included

        // Calculate extra meat and cheese

        if (isExtraMeat){
            basePrice += switch (size) {
                case 4 -> 0.50;
                case 8 -> 1.00;
                case 12 -> 1.50;
                default -> 0.00;
            };
        }
        if (isExtraCheese){
            basePrice += switch (size) {
                case 4 -> 0.30;
                case 8 -> 0.60;
                case 12 -> 0.90;
                default -> 0.00;
            };
        }
        return basePrice;
    }

    public void setExtraMeat(boolean extraMeat) {
        isExtraMeat = extraMeat;
    }

    public void setExtraCheese(boolean extraCheese) {
        isExtraCheese = extraCheese;
    }



    //Structure of displaying
    @Override
    public String getDescription() {
        return "\n" + size + "\" sandwich on " + typeOfBread + " bread" + (isToasted ? " (toasted)" : "") +
                "\nMeats: " + (meats.isEmpty() ? "None" : meats.toString()) + (isExtraMeat ? " + Extra Meat" : "") +
                "\nCheeses: " + (cheeses.isEmpty() ? "None" : cheeses.toString()) + (isExtraCheese ? " + Extra Cheese" : "") +
                "\nToppings: " + (toppings.isEmpty() ? "None" : toppings.toString()) +
                "\nSauces: " + (sauces.isEmpty() ? "None" : sauces.toString()) +
                "\nSide: " + (sides.isEmpty() ? "None" : sides.toString());
    }
}
