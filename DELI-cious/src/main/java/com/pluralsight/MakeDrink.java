package com.pluralsight;

import java.util.Scanner;

public class MakeDrink {

    public static Drink createDrink(){
        Scanner scanner = new Scanner(System.in);

        //Make choice of drink
        System.out.println("~~~Drink~~~");
        System.out.println(" ");
        System.out.println("~~~Sizes~~~");
        System.out.println("S | M | L");
        System.out.print("Your choice: ");
        String choiceDrink = scanner.nextLine().toLowerCase();
        scanner.nextLine();

        Drink drink = new Drink(choiceDrink);
        return drink;
    }
}
