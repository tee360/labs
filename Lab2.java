import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome! What is your name? (enter your name): ");
		String name = scanner.nextLine();
		
		System.out.println();
		System.out.println("Would you like to play a game? (ENTER \"yes\" or \"no\"): ");
		String gameResponse = scanner.nextLine();
		
		if (gameResponse.equals("yes"))
		{
			System.out.print("Excellent! Imagine you are walking across a field and you ");
			System.out.print("encounter a fire-breathing dragon! ");
			System.out.println("\nWhat would you do? (ENTER \"face the beast\" or \"run away\"): ");
			String decision = scanner.nextLine();
			
			if (decision.equals("face the beast"))
			{
				System.out.println("Okay, " + name + " ... as you approach the dragon, ");
				System.out.println("you see that he has __ heads. (ENTER \"1\" or \"2\" or \"3\"); ");
				int heads = scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("No one has ever faced a " + heads + "-headed dragon before!");
				System.out.print("Choose your weapon. \n(ENTER \"slingshot\" or \"sword\" or ");
				System.out.println("\"bow and arrow\"): ");
				String weapon = scanner.nextLine();
				
				switch (weapon)
				{
				case "slingshot":
					System.out.println("Armed with your "+ weapon +", " + name + " approaches the dragon.");
					System.out.println("You can feel its fiery breath as you get closer.");
					System.out.println("Your " + weapon + " didn't seem to apply enough force");
					break;
				case "sword":
					System.out.println("Armed with your "+ weapon +", " + name + " approaches the dragon.");
					System.out.println("You can feel its fiery breath as you get closer.");
					System.out.println("Your melee attack didn't fully connect with evasive dragon");
					break;
				case "bow and arrow":
					System.out.println("Armed with your "+ weapon +", " + name + " approaches the dragon.");
					System.out.println("You can feel its fiery breath as you get closer.");
					System.out.println("Your " + weapon + " packed a powerful punch, but yet ...");
					break;
				default:
					System.out.println("Your weapon selection was not appropriate");
					break;
				}
				
				System.out.println("It glares at you with its __ eyes. (enter \"red\" or \"blue\")");
				String eyeColor = scanner.nextLine();
				
				if (eyeColor.equals("red"))
				{
					System.out.println("Oh thank goodness! Red-eyed dragons are friendly.");
					System.out.println("You pet it and become friends. You name the dragon __.");
					System.out.println("(ENTER a name for the dragon): ");
					String dragon = scanner.nextLine();
					
					System.out.println(name + " and " + dragon + " live happily ever after.");
				}
				else
				{
					System.out.println("(ENTER a name for the dragon): ");
					String dragon = scanner.nextLine();
					System.out.println("You may have a problem, because Blue-eyed dragons like ");
					System.out.print("to feast on people named " + name + ".");
					System.out.println(dragon +" has you for lunch.");
				}										
			}
			else
			{
				System.out.println("I will refrain from calling you a coward");
			}
			
			System.out.println("Thanks for playing and try again!");
		}
		
		System.out.println("Goodbye!");
		scanner.close();
	}
	
}
