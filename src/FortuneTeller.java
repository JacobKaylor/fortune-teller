import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What is your first name: ");
		String firstName = input.nextLine();
		System.out.print("What is you last name: ");
		String lastName = input.nextLine();
		System.out.print("What is your age: ");
		int age = input.nextInt();
		System.out.print("What is your birth month as an integer: ");
		int birthMonth = input.nextInt();
		System.out.print("What is your favorite ROYGBIV color?  enter Help to get a list of these colors: ");
		String color = input.next();
		

		if (color.toLowerCase().equals("help")) {
			System.out.println("These colors are: Red, Orange, Yellow, Green, Blue, Indigo and Violet.");
			System.out.print("Now that you know ROYGBIV colors, which one is your favorite? ");
			color = input.next();
		}else {
		color = color;
		}
		System.out.print("How many siblings do you have: ");
		int siblings = input.nextInt();

		input.close();
		int retire;
		if(age%2 == 0) {
			retire = age - 10;
		}else {
			retire = 2;
		}
		
		String location;
		if(siblings == 0) {
			location = "Mexico City, Mexico";
		}else if(siblings == 1) {
			location = "San Francisco, CA";
		}else if(siblings == 2) {
			location = "Nashville, TN";
		}else if(siblings == 3) {
			location = "Vancouver, British Columbia";
		}else if(siblings > 3) {
			location = "Ft. Lauderdale, FL";
		}else {
			location = "Mars";
		}
		
		String transport;
		
		if(color.toLowerCase().equals("red")) {
			transport = "a skateboard";
		}else if(color.toLowerCase().equals("orange")) {
			transport = "a dragon";
		}else if(color.toLowerCase().equals("yellow")){
			transport = "an unicycle";
		}else if(color.toLowerCase().equals("green")) {
			transport = "a go-Kart";
		}else if(color.toLowerCase().equals("blue")) {
			transport = "a Tesla";
		}else if(color.toLowerCase().equals("indigo")) {
			transport = "your own two feet";
		}else {
			transport = "a jet pack";
		}
		
		double bankBalance;
		if(birthMonth > 0 && birthMonth < 5) {
			bankBalance = birthMonth * 123456;
		}else if(birthMonth > 4 && birthMonth < 9) {
			bankBalance = 10000000/birthMonth;
		}else if(birthMonth > 8 && birthMonth < 13) {
			bankBalance = 100;
		}else {
			bankBalance = 0;
		}
		
		System.out.println(firstName+" "+lastName+" will retire in "+retire+" years with $"+bankBalance+" in the bank, "+"a vacation home in "+location+", and travel by "+transport+".");
		
		

	}

}
