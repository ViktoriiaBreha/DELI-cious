package com.pluralsight;

import java.util.Scanner;

public class MakeDrink {

    public static Drink createDrink() {
        Scanner scanner = new Scanner(System.in);

        //Make choice of drink
        System.out.println("~~~🧃Drink🧃~~~");
        System.out.println(" ");
        System.out.println("~~~⬇️Sizes⬆️~~~");
        System.out.println("S | M | L");
        System.out.print("Your choice: ");
        String choiceDrink = scanner.nextLine().toUpperCase();
        if (!choiceDrink.equals("S") && !choiceDrink.equals("M") && !choiceDrink.equals("L")) {
            System.out.println("We do not have this size. Try again");
        }
        System.out.println("coca-cola | fanta | dr pepper | water | apple juice ");
        System.out.print("Your choice: ");
        String choiceTypeDrink = scanner.nextLine().toLowerCase();
        if (!choiceTypeDrink.equals("coca-cola") &&
                !choiceTypeDrink.equals("fanta") &&
                !choiceTypeDrink.equals("dr pepper") &&
                !choiceTypeDrink.equals("water") &&
                !choiceTypeDrink.equals("apple juice")) {
            System.out.println("We do not have this drink. Try again");
        }

        Drink drink = new Drink(choiceDrink, choiceTypeDrink);
        return drink;
    }
}
