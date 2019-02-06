package com.company;
import static java.lang.System.out;
import java.util.Scanner;
public class SandwichShop {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int goalForVeggies = 50;
		int goalForBurgers = 250;
		int goalForSubs = 180;
		int goalForSoup = 70;

		out.println("Checking sales goals.");
		out.println("The sales goal for veggie sandwiches is " + goalForVeggies);
		out.print("How many veggie sandwiches were sold today?");
		int howManyVS = keyboard.nextInt();
		if (howManyVS >= goalForVeggies) {
			out.println("Made goal for veggies.");
		} else {
			out.println("Fell short of veggie goal.");
		}

		out.println("The sales goal for burgers is " + goalForBurgers);
		out.print("How many burgers were sold today?");
		int howManyB = keyboard.nextInt();
		if (howManyB >= goalForBurgers) {
			out.println("Made goal for burgers.");
		} else {
			out.println("Fell short of burger goal.");
		}


		out.println("The sales goal for subs is " + goalForSubs);
		out.print("How many subs were sold today?");
		int howManySub = keyboard.nextInt();
		if (howManySub >= goalForSubs) {
			out.println("Made goal for subs.");
		} else {
			out.println("Fell short of sub goal.");
		}

		out.println("The sales goal for soup is " + goalForSoup);
		out.print("How many soups were sold today?");
		int howManySoup = keyboard.nextInt();
		if (howManySoup >= goalForSoup) {
			out.println("Made goal for soup.");
		} else {
			out.println("Fell short of soup goal.");
		}
		if (howManyVS >= goalForVeggies && howManyB >= goalForBurgers && howManySub >= goalForSubs && howManySoup >= goalForSoup) {
		out.println("Made goal for everything!"); {




			}

		}
	}
}



