package com.pluralsight;

import java.util.Scanner;

public class MakeSandwich {

    public static Sandwich createSandwich() {
        Scanner scanner = new Scanner(System.in);

        //Create choices for customer of size, bread, toppings, sauces...
        System.out.println(" ");
        System.out.println("~~~⬇️Sizes⬆️~~~");
        System.out.println("4 | 8 | 12");
        System.out.print("Your choice: ");
        int choiceSize = scanner.nextInt();
        if (choiceSize != 4 && choiceSize != 8 && choiceSize != 12) {
            System.out.println("We do not have this size. Try again");
        }

        System.out.println(" ");
        System.out.println("~~~🥖Breads🥖~~~");
        System.out.println("white | wheat | rye | wrap");
        System.out.print("Your choice: ");
        scanner.nextLine();
        String choiceBread = scanner.nextLine().toLowerCase();
        if (!choiceBread.equals("white") && !choiceBread.equals("wheat") && !choiceBread.equals("rye") && !choiceBread.equals("wrap")) {
            System.out.println("We do not have this bread. Try again");
        }

        System.out.println(" ");
        System.out.println("~~~🥪Toasted🥪~~~");
        System.out.println("yes | no");
        System.out.print("Your choice: ");
        String toastInput = scanner.nextLine().toLowerCase();
        boolean isToasted = toastInput.equals("yes");
        Sandwich sandwich = new Sandwich(choiceSize, choiceBread, isToasted);

        System.out.println(" ");
        System.out.println("~~~🥓Meat🥓~~~");
        System.out.println("steak | ham | salami | roast beef | chicken | bacon");
        System.out.print("Your choice: ");
        String choiceMeat = scanner.nextLine();
        if (!choiceMeat.equals("steak") && !choiceMeat.equals("ham") && !choiceMeat.equals("salami") && !choiceMeat.equals("roast beef") && !choiceMeat.equals("chicken") && !choiceMeat.equals("bacon")) {
            System.out.println("We do not have this meat. Try again");
        }
        System.out.println("Would do you like an extra meat?(yes/no)");
        System.out.print("Your answer: ");
        String extraMeat = scanner.nextLine().toLowerCase();
        if (extraMeat.equals("yes")) {
            sandwich.setExtraMeat(true);
        }
        sandwich.addMeat(choiceMeat);

        System.out.println(" ");
        System.out.println("~~~🧀Cheese🧀~~~");
        System.out.println("american | provolone | cheddar | swiss");
        System.out.print("Your choice: ");
        String choiceCheese = scanner.nextLine();
        if (!choiceCheese.equals("american") && !choiceCheese.equals("provolone") && !choiceCheese.equals("cheddar") && !choiceCheese.equals("swiss")) {
            System.out.println("We do not have this cheese. Try again");
        }
        System.out.println("Would do you like an extra cheese?(yes/no)");
        System.out.print("Your answer: ");
        String extraCheese = scanner.nextLine().toLowerCase();
        if (extraCheese.equals("yes")) {
            sandwich.setExtraCheese(true);
        }
        sandwich.addCheese(choiceCheese);

        //Ability to add as mush as they want until DONE
        System.out.println(" ");
        System.out.println("~~~🥬🍅Regular Toppings🍅🥬~~~");
        System.out.println("lettuce | peppers | onions | tomatoes | jalapenos | cucumbers | pickles | guacamole | " +
                "mushrooms");
        boolean run = true;
        while (run) {
            System.out.print("Your choice('x' to finish): ");
            String choiceTopping = scanner.nextLine();
            if (choiceTopping.equalsIgnoreCase("x")) {
                run = false;
            } else if (!choiceTopping.isEmpty()) {
                sandwich.addTopping(choiceTopping);
            }
            if (!choiceTopping.equals("lettuce") && !choiceTopping.equals("peppers") && !choiceTopping.equals("onions") && !choiceTopping.equals("tomatoes") && !choiceTopping.equals("jalapenos") && !choiceTopping.equals("cucumbers") && !choiceTopping.equals("pickles") && !choiceTopping.equals("guacamole") && !choiceTopping.equals("mushrooms")) {
                System.out.println("We do not have this option. Try again");
            }
        }

        System.out.println(" ");
        System.out.println("~~~🧂Sauces🧂~~~");
        System.out.println("mayo | mustard | ketchup | ranch | thousand islands | vinaigrette");
        boolean run2 = true;
        while (run2) {
            System.out.print("Your choice('x' to finish): ");
            String choiceSauces = scanner.nextLine();
            if (choiceSauces.equalsIgnoreCase("x")) {
                run2 = false;
            } else if (!choiceSauces.isEmpty()) {
                sandwich.addSauce(choiceSauces);
            }

            if (!choiceSauces.equals("mayo") && !choiceSauces.equals("mustard") && !choiceSauces.equals("ketchup") && !choiceSauces.equals("ranch") && !choiceSauces.equals("thousand islands") && !choiceSauces.equals("vinaigrette")) {
                System.out.println("We do not have this option. Try again");
            }
        }

        //Add one side
        System.out.println(" ");
        System.out.println("~~~🥗Side🥗~~~");
        System.out.println("au jus | sauce");
        System.out.print("Your choice: ");
        String choiceSide = scanner.nextLine();
        if (!choiceSide.equals("au jus") && !choiceSide.equals("sauce")) {
            System.out.println("We do not have this side. Try again");
        }
        sandwich.addSide(choiceSide);
        return sandwich;
    }
}
