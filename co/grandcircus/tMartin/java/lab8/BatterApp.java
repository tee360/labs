package co.grandcircus.tMartin.java.lab8;

import java.util.ArrayList;
import java.util.Scanner;

public class BatterApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Batter> batterInfo = new ArrayList<>(50);
		ArrayList<Integer> atBatResults = new ArrayList<>(30);
		Batter batter = new Batter(null, atBatResults);
		
		String yesNo = "y";
		String anotherBatter = null;
		
		int basesEarned = 0;
		int index = 1;

		System.out.println("Welcome To Batting Average Calculator\n");

		do {

			System.out.println("Please enter name:");
			String name = sc.next();

			do {
				System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");
				basesEarned = sc.nextInt();
				
				atBatResults.add(basesEarned);
				
				batter.setName(name);
				batter.setAtBatResults(atBatResults);

				System.out.println("Result for at-bat " + index + ": " + basesEarned);

				System.out.println("Another at-bat? (y/n)\n");
				yesNo = sc.next();

				//atBats++;
				index++;
				//basesEarnedTotal += basesEarned;
			} while (!(yesNo.equals("n")));
			
			batterInfo.add(batter);
			System.out.println(batterInfo);

			for(Batter batters1: batterInfo){
				batterInfo.add(batters1);
				System.out.println(batters1.getBattingAvg());
			}
			System.out.println("Another batter? (y/n)\n");
			anotherBatter = sc.next();

		} while (anotherBatter.equals("y"));	

		int size = batterInfo.size();
		for(int i = 0; i <= size; i++){
			//System.out.println(batterInfo.get(i));
			System.out.println(batter.getName());
			System.out.println("Batting average: " +batter.getBattingAvg());
			System.out.println("Slugging percentage: " +batter.getSluggingPct());
		}
		//System.out.println(batterInfo);

	//	System.out.println(batterInfo.get(0));

	}

}
