package com.pluralsight;

import java.util.Scanner;

public class OrderScreen {

    //Creating order screen with 5 options that will allow to interact with order
    public static void displayOrderScreen(OrderReceipt orderReceipt) {
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
                    orderReceipt.addEachItem(sandwich);
                    break;
                case 2:
                    Drink drink = MakeDrink.createDrink();
                    orderReceipt.addEachItem(drink);
                    break;
                case 3:
                    orderReceipt.addEachItem(new Chips());
                    break;
                case 4:
                    orderReceipt.printReceipt();
                    System.out.println("\nThank you for ordering!");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    run = false; // Exit to return to home screen
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
