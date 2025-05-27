package com.pluralsight;

import java.util.Scanner;

public class MakeSandwich {

    public static Sandwich createSandwich(){
        Scanner scanner = new Scanner(System.in);

        //Create choices for customer of size, bread, toppings, sauces...
        System.out.println(" ~~~Sizes~~~");
        System.out.println("4 | 8 | 12");
        System.out.print("Your choice: ");
        int choiceSize = scanner.nextInt();

        System.out.println("~~~Breads~~~");
        System.out.println("white | wheat | rye | wrap");
        System.out.print("Your choice: ");
        String choiceBread = scanner.nextLine().toLowerCase();
        scanner.nextLine();

        System.out.println("~~~Toasted~~~");
        System.out.println("yes | no");
        System.out.print("Your choice: ");
        String toastInput = scanner.nextLine().toLowerCase();
        boolean isToasted = toastInput.equals(" ");

        Sandwich sandwich = new Sandwich(choiceSize,choiceBread,isToasted);

        System.out.println("~~~Meat~~~");
        System.out.println("steak | ham | salami | roast beef | chicken | bacon");
        System.out.print("Your choice: ");
        String choiceMeat = scanner.nextLine();
        System.out.println("Would do you like an extra meat?(yes/no)");
        System.out.print("Your answer: ");
        String extraMeat = scanner.nextLine().toLowerCase();
        if (extraMeat.equals("yes")){
            sandwich.setExtraMeat(true);
        }
        sandwich.addMeat(choiceMeat);

        System.out.println("~~~Cheese~~~");
        System.out.println("american | provolone | cheddar | swiss");
        System.out.print("Your choice: ");
        String choiceCheese = scanner.nextLine();
        System.out.println("Would do you like an extra cheese?(yes/no)");
        System.out.print("Your answer: ");
        String extraCheese = scanner.nextLine().toLowerCase();
        if (extraCheese.equals("yes")){
            sandwich.setExtraCheese(true);
        }
        sandwich.addCheese(choiceCheese);


        System.out.println("~~~Regular Toppings~~~");
        System.out.println("lettuce | peppers | onions | tomatoes | jalapenos | cucumbers | pickles | guacamole | " +
                "mushrooms");
        System.out.print("Your choice: ");
        String choiceTopping = scanner.nextLine();
        sandwich.addTopping(choiceTopping);

        System.out.println("~~~Sauces~~~");
        System.out.println("mayo | mustard | ketchup | ranch | thousand islands | vinaigrette");
        System.out.print("Your choice: ");
        String choiceSauces = scanner.nextLine();
        sandwich.addSauce(choiceSauces);

        return sandwich;
    }
}
