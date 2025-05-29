package com.pluralsight;

public class MainApp {
    public static void main(String[] args) throws InterruptedException {
        HomeScreen homeScreen = new HomeScreen();
        while (true){
            homeScreen.displayMenu();
        }

    }
}
