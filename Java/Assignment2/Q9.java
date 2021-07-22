package assignment2;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Your Role");
		String name = sc.nextLine();
		if (name.equalsIgnoreCase("owner")) {
			System.out.println("Enter the Dessert That you need to Store");
			String D = sc.nextLine();
			if (D.equalsIgnoreCase("candy")) {
				System.out.println("Added Candy to the Store");
			} else if (D.equalsIgnoreCase("cokkie")) {
				System.out.println("Added cokkie to the Store");
			} else if (D.equalsIgnoreCase("icecream")) {
				System.out.println("Added icecream to the Store");
			} else {
				System.out.println("Wrong Input Please Try again");
			}
		} else if (name.equalsIgnoreCase("customer")) {

			candy Candy = new candy();
			Cookie cookie = new Cookie();
			IceCream iceCream = new IceCream();

			System.out.println("Enter the Dessert :");

			String dessert = sc.nextLine();

			if (dessert.equalsIgnoreCase("candy")) {
				System.out.println("Enter the no of Candy's");
				int a = sc.nextInt();
				Candy.getcost(a);
			} else if (dessert.equalsIgnoreCase("icecream")) {
				System.out.println("Enter the no of IceCream");
				int a = sc.nextInt();
				iceCream.getcost(a);

			}

			else if (dessert.equalsIgnoreCase("cokkie")) {
				System.out.println("Enter the no of cokkies");
				int a = sc.nextInt();
				cookie.getcost(a);

			}
		}

	}

}

class candy extends Dessert {

	double tax = 20;
	double price = 50;

	@Override
	void getcost(int a) {
		// TODO Auto-generated method stub

		Double Total_Price = (this.price + this.tax) * a;

		System.out.println("Candy:" + Total_Price + "$");

	}

}

class Cookie extends Dessert {

	double tax = 10;
	double price = 30;

	@Override
	void getcost(int a) {
		// TODO Auto-generated method stub

		Double Total_Price = (this.price + this.tax) * a;

		System.out.println("Cookie:" + Total_Price + "euros");

	}

}

class IceCream extends Dessert {

	double tax = 10;
	double price = 20;

	@Override
	void getcost(int a) {
		// TODO Auto-generated method stub

		Double Total_Price = (this.price + this.tax) * a;

		System.out.println("IceCream:" + Total_Price + "rs");

	}

}
