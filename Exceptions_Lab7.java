import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions_Lab7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String number;
		
		String[]students = {"Rob", "Tom", "Ashlei", "Mark", "Jason", 
							"Kyle", "Moe", "Nurah", "Tenica", "Ravi", 
							"Chris", "David", "Bryan", "Yolanda", "Keesha", 
							"Krafus", "Brent", "Gauri", "Samir", "Vlado"};
		
		String[]hometown = {"Hamtramck", "Detroit", "Novi", "Almo", "Jersey",
							"Green Bay", "Arizona", "Utica", "Atlanta", "Macon",
							"Ferndale", "Warren", "Pontiac", "Flint", "Garland",
							"Miami", "Compton", "Long Beach", "Toronto", "Denver"};
		
		String[]favFood = {"Spam", "Smoothies", "Hamburgers", "Pizza", "Avocodos", 
							"Quinoa", "Lasagna", "Bologna", "Caviar", "Oysters",
							"Corn", "Salmon", "Ziti", "turkey", "Meatloaf",
							"burritos", "tacos", "schwarma", "gyros", "grouper"};
		
		System.out.println("Student List:\n");
		for(int i = 0; i < 20; i++){
			System.out.println((i+1)+". "+students[i]);
		}
		System.out.println("\nWelcome to our Java class. \nWhich student would you like to learn more about? ");
		System.out.print("(enter a number 1 - 20): ");
		number = sc.nextLine();
		
		String choice = "y";
//		while(!choice.equalsIgnoreCase("n")){
//			try{
//				int index = Integer.parseInt(number);
//				System.out.println("Student " +index+ " is " +students[(index-1)]);
//			}
//			catch(IndexOutOfBoundsException | IllegalArgumentException e){
//				System.out.println("That student does not exist.");
//				System.out.println("Please try again. (enter a number 1-20): ");
//				choice = sc.nextLine();
//				continue;
//			}
//			catch (InputMismatchException e) {
//			System.out.println("Continue? (y/n): ");
//			choice = sc.nextLine();
//			continue;
//			}
//		}
		
		
		int sIdentifier = Integer.parseInt(number);
		
		//System.out.println(sIdentifier);
		
		while(!choice.equalsIgnoreCase("no")){
			System.out.println("\nWhat would you like to know about " + students[(sIdentifier-1)]+"?\n");
			System.out.println("(enter \"hometown\" or \"favorite food\"):");
			String inquiry = sc.nextLine();
			
			if(inquiry.equalsIgnoreCase("hometown")){
				System.out.println(students[(sIdentifier-1)] + " is from "+hometown[(sIdentifier-1)]+" Would you like to know more? (enter \"yes\" or \"no\")");
				choice = sc.nextLine();
				
			}else if(inquiry.equalsIgnoreCase("favorite food")){
				System.out.println(students[(sIdentifier-1)] + " favorite food is "+favFood[(sIdentifier-1)]+" Would you like to know more? (enter \"yes\" or \"no\")");
				choice = sc.nextLine();
			}else
				System.out.println("That data does not exist. Please try again.");
		}
		
		
		
		System.out.print("GoodBye!");
		

		sc.close();
	}

}
