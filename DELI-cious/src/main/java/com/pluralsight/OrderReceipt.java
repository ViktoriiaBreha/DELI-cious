package com.pluralsight;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class OrderReceipt {

    public List<ItemToOrder> items = new ArrayList<>();

    public void addEachItem(ItemToOrder itemToOrder){
        items.add(itemToOrder);
        System.out.println(itemToOrder.getDescription());
    }

    public double getTotal(){
        double total = items.stream()
                .mapToDouble(ItemToOrder :: getPrice).sum();
        return total;
    }

    public void printReceipt(){
        System.out.println("~~~~~R E C E I P T~~~~~");
        for (ItemToOrder item: items){
            System.out.println(item.getDescription() + " - " + String.format("$%.2f", item.getPrice()));
        }
        System.out.printf("Your total: $%.2f", getTotal());

        try{
            String receipt = "src/main/resources/receipts";
            new  File(receipt).mkdir();
            String file = receipt + "/" + LocalDateTime.now().format(DateTimeFormatter.ofPattern(
                    "yyyyMMdd-HHmmss")) + ".txt";
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (ItemToOrder item : items){
                bufferedWriter.write(item.getDescription() + String.format("\n$%.2f", item.getPrice()));
            }
            bufferedWriter.write(String.format("Your total: $%.2f", getTotal()));
            bufferedWriter.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
