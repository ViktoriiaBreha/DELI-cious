package com.pluralsight;

public class Drink extends ItemToOrder {

    private String letterSize;

    public Drink(String letterSize) {
        super(0.00, 0, " ");
        this.letterSize = letterSize.toUpperCase();

        switch (this.letterSize.toUpperCase()){
            case "S":
                this.size = 1;
                this.price = 2.00;
                this.description = "Small drink";
                break;
            case "M":
                this.size = 2;
                this.price = 2.50;
                this.description = "Medium drink";
                break;
            case "L":
                this.size = 3;
                this.price = 3.00;
                this.description = "Large drink";
                break;
            default:
                this.size = 0;
                this.price = 0.00;
                this.description = "Invalid input. Try again";

        }
    }

    @Override
    public double getPrice() {

        return super.getPrice();
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
