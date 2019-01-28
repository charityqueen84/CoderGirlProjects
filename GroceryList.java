package com.company;
import static java.lang.System.out;
import java.util.Scanner;
public class GroceryList
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        out.println("Please list 3 items on your grocery list");
        out.print("What is the first item on your grocery list?");
        String item1 = keyboard.next();

        out.print("What is the second item on your grocery list?");
        String item2 = keyboard.next();

        out.print("What is the third item on your grocery list?");
        String item3 = keyboard.next();

        out.println("Now please enter the quantity of each item.");

        int howMany1;
        out.print("How many " + item1 + "?");
        howMany1 = keyboard.nextInt();

        int howMany2;
        out.print("How many " +item2 + "?");
        howMany2 = keyboard.nextInt();

        int howMany3;
        out.print("How many " + item3 + "?");
        howMany3 = keyboard.nextInt();

        out.println("Now, please enter the price of each item.");
        float item1Cost;
        out.print("How much does one milk cost?");
        item1Cost = keyboard.nextFloat();

        float item2Cost;
        out.print("How much does one bread cost?");
        item2Cost = keyboard.nextFloat();

        float item3Cost;
        out.print("How much does one eggs cost?");
        item3Cost = keyboard.nextFloat();

        out.println("Calculating your grocery bill.");

        float priceItem1 = item1Cost * howMany1;
        float priceItem2 = item2Cost * howMany2;
        float priceItem3 = item3Cost * howMany3;
        float totalCost = priceItem1 + priceItem2 + priceItem3;
        out.println("Your total cost is " + totalCost);






























    }
}
