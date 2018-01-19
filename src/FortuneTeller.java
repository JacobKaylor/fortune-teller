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
		
		if(color.toLowerCase().equals("help")) {
			System.out.println("These colors are: Red, Orange, Yellow, Green, Blue, Indigo, Violet");
		
		System.out.print("Now that you know these colors which one is your favorite? ");
		}
		String newColor = input.next();
		
		System.out.print("How many siblings do you have: ");
		int siblings = input.nextInt();
		
		input.close();

	}

}
