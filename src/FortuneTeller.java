import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What is your first name: ");
		String firstName = input.nextLine();
		if (firstName.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		System.out.print("What is you last name: ");
		String lastName = input.nextLine();
		if(lastName.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		System.out.print("What is your age: ");
		String firstAge = input.next();
		if(firstAge.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		int age = Integer.parseInt(firstAge);
		System.out.print("What is your birth month as an integer: ");
		String firstBirthMonth = input.next();
		if(firstBirthMonth.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		int birthMonth = Integer.parseInt(firstBirthMonth);
		System.out.print("What is your favorite ROYGBIV color?  Enter help to get a list of these colors: ");
		String color = input.next();

		while (color.equals("help")) {
			System.out.print("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet. ");
			color = input.next();
		}
		if (color.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}

		System.out.print("How many siblings do you have: ");
		int siblings = input.nextInt();

		input.close();
		int retire;
		if (age % 2 == 0) {
			retire = age - 10;
		} else {
			retire = 2;
		}

		String location;
		if (siblings == 0) {
			location = "Mexico City, Mexico";
		} else if (siblings == 1) {
			location = "San Francisco, CA";
		} else if (siblings == 2) {
			location = "Nashville, TN";
		} else if (siblings == 3) {
			location = "Vancouver, British Columbia";
		} else if (siblings > 3) {
			location = "Ft. Lauderdale, FL";
		} else {
			location = "Mars";
		}

		String transport;

		if (color.toLowerCase().equals("red")) {
			transport = "a skateboard";
		} else if (color.toLowerCase().equals("orange")) {
			transport = "a dragon";
		} else if (color.toLowerCase().equals("yellow")) {
			transport = "an unicycle";
		} else if (color.toLowerCase().equals("green")) {
			transport = "a go-Kart";
		} else if (color.toLowerCase().equals("blue")) {
			transport = "a Tesla";
		} else if (color.toLowerCase().equals("indigo")) {
			transport = "your own two feet";
		} else {
			transport = "a jet pack";
		}

		double bankBalance;
		if (birthMonth > 0 && birthMonth < 5) {
			bankBalance = birthMonth * 12345;
		} else if (birthMonth > 4 && birthMonth < 9) {
			bankBalance = 10000000 / birthMonth;
		} else if (birthMonth > 8 && birthMonth < 13) {
			bankBalance = 100;
		} else {
			bankBalance = 0;
		}

		System.out.println(firstName + " " + lastName + " will retire in " + retire + " years with $" + bankBalance
				+ " in the bank, " + "a vacation home in " + location + ", and travel by " + transport + ".");

	}

}
