package com.pluralsight;

import java.util.Scanner;

public class HomeScreen {
    public static void displayMenu() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        //Main menu with 2 options
        while (run) {
            System.out.println(" ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~🥪DELI-cious🥪~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" ");
            System.out.println("1. New order ➕");
            System.out.println("0. Exit ➖");
            System.out.print("Number:");
            int choice_number = scanner.nextInt();

            switch (choice_number) {
                case 1:
                    OrderReceipt orderReceipt = new OrderReceipt();
                    OrderScreen.displayOrderScreen(orderReceipt);
                    break;
                case 0:
                    System.out.println("Thank you for using\"DELI-cious\"! Sew you soon!");
                    int i;
                    for (i = 3; i >= 1; i--) {
                        System.out.println(i);
                        Thread.sleep(1000);
                    }
                    System.exit(0);
                    run = false;
                    break;
                default:
                    System.out.println("Invalid input. Try again.");
            }
        }
    }
}
