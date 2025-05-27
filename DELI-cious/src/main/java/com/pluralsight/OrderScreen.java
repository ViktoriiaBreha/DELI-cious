package com.pluralsight;

import java.util.Scanner;

public class OrderScreen {

    //Creating order screen with 5 options that will allow to interact with order
    public static void displayOrderScreen() {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println(" ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~📃M E N U📃~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" ");
            System.out.println("1. Add Sandwich 🥪");
            System.out.println("2. Add Drink 🧃");
            System.out.println("3. Add Chips 🍟");
            System.out.println("4. Checkout 🧾");
            System.out.println("0. Cancel Order ❌");
            System.out.print("Number:");
            int numberOfOrderScreen = scanner.nextInt();

            switch (numberOfOrderScreen) {
                case 1:
                    Sandwich sandwich = MakeSandwich.createSandwich();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    System.out.println("Order is canceled");
                    run = false;
                    break;
                default:
                    System.out.println("Invalid input. Try again.");
            }
        }
    }
}
