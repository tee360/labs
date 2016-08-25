import java.util.Scanner;

public class DiceRoller {

	public static void main(String[] args) {

		System.out.println("Welcome to the Grand Circus Casino!\n");

		craps();
		
		System.out.println("Have a Great Day!");

	}

	public static void craps() {

		Scanner sc = new Scanner(System.in);
		
		String response = "";
		
		System.out.println("At this point we only have craps ... \nHow many sides for the pair of dice do you prefer?");
		int diceSides = sc.nextInt();
		
		System.out.println("Great! You have selected " + diceSides + " sides for the die");

		do {
			for (int i = 1; i <= 2; i++) {
				System.out.println("Roll " + i + ": ");
				int dieRoll = ((int) Math.round(rndNumGnr8tr(diceSides))) + 1;
				System.out.println(dieRoll);
			}

			System.out.println("\nRoll again? (y/n): ");
			response = sc.next();
			
		} while (response.equalsIgnoreCase("y"));
		
		sc.close();

	}

	public static double rndNumGnr8tr(double num) {
		double random = (Math.random() * 100) % (num - 1);

		return random;
	}

}
