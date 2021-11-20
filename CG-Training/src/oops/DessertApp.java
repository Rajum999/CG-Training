package oops;

import java.util.Scanner;

public class DessertApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your role");
		String role = scanner.next();
		if (role.equals("owner")) {
			owner();
		} else if (role.equals("customer")) {
			customer();
		}

	}

	private static void customer() {
		System.out.println("Welcome to Dessert shop sir ");
		System.out.println("May i know What you want to buy");
		Scanner scanner = new Scanner(System.in);
		DessertItem dessertItem = new IceCream(20, 2);
		DessertItem dessertItem1 = new Candy(5, 0.5);
		DessertItem dessertItem2 = new Cookie(10, 1);
		System.out.println("Items available are 1.Candy\n 2.IceCream\n 3.Cookie and those costs are");
		dessertItem.getCost();
		dessertItem1.getCost();
		dessertItem2.getCost();
		System.out.println("Select your item");
		String order = scanner.next();
		if (order.equals("Candy")) {
			System.out.println("Order was placed for Candy");
		} else if (order.equals("Cookie")) {
			System.out.println("Order placed for Cookie");

		} else if (order.equals("IceCream")) {
			System.out.println("Order placed for IceCream");

		}

	}

	public static void owner() {
		System.out.println("Welcome sir add your items to the cart");
		System.out.println("Items available are 1.Candy\n 2.IceCream\n 3.Cookie");
		System.out.println("Select which item you want");
		Scanner scanner = new Scanner(System.in);

		String add = scanner.nextLine();
		if (add.equals("Candy")) {
			Candy c = new Candy(5, 0.5);
			System.out.println("Item add into cart ");
			c.getCost();
		} else if (add.equals("Cookie")) {
			Cookie c1 = new Cookie(10, 1);
			System.out.println("Item add into cart ");
			c1.getCost();
		} else if (add.equals("IceCream")) {
			IceCream ic = new IceCream(20, 2);
			System.out.println("Item add into cart ");
			ic.getCost();
		}

	}

}
