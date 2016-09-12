package co.grandcircus.tMartin.java;

import java.util.Scanner;

public class RoshamboGame {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Player randomType = new RandomPlayer("random1");
		Player rockType = new RockPlayer("random2");
		//Player humanPlayer = new HumanPlayer(null);

		System.out.println("Welcome to Rock Paper Scissors!\n");
		System.out.println("Enter your name: ");
		String name = sc.next();
		
		Player humanPlayer = new HumanPlayer(name);
				
		System.out.println("Would you like to play against TheJets or TheSharks (j/s)?: ");
		String opponentType = sc.next();

		if (opponentType.equals("j")) {
			System.out.println(randomType.generateRoshambo());
		}
		if (opponentType.equals("s")) {
			System.out.println(rockType.generateRoshambo());
		}
		
		Roshambo humanResult = humanPlayer.generateRoshambo();


		System.out.println(humanPlayer.getPlayerName() + ", you've selected: " + humanResult);

		// if(!(randomType.equals(null))){
		// System.out.println("Your opponent chose " + randomType);
		// }
		//

		// Player playerType;
		//
		// playerType = new RockPlayer();
		//
		// System.out.println(playerType.generateRoshambo());
		//
		// playerType = new RandomPlayer();
		//
		// System.out.println(playerType.generateRoshambo());

		sc.close();
	}

}
