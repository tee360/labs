package co.grandcircus.tMartin.java;

import java.util.Scanner;

public class HumanPlayer extends Player {

	Scanner sc = new Scanner(System.in);
	
	public HumanPlayer(String playerName) {
		super(playerName);
	}

	//private String playerName;

	public Roshambo generateRoshambo() {
		//this.setPlayerName(name);
		
		System.out.println("Please select 'rock', 'paper', or 'scissors'");
		String selection = sc.next();
		
		switch(selection){
		case "rock":
			return Roshambo.ROCK;
		case "paper":
			return Roshambo.PAPER;
		case "scissors":
			return Roshambo.SCISSORS;
		default:
				System.out.println("Invalid Selection");
				return generateRoshambo();
		}
	}

}
