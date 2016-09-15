package co.grandcircus.tMartin.countryList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int menuChoice;
		String yesNo = "y";
		String addCountry = null;

		System.out.println("Welcome to the Countries Maintenance Application!");
		

		CountriesTextFile country = new CountriesTextFile();
		List<String> countryList = new ArrayList<>();

		while (yesNo.equalsIgnoreCase("y")) {
			System.out.println("1 - See the list of Countries");
			System.out.println("2 - Add a Country");
			System.out.println("3 - Exit");
			System.out.println("Enter menu number: \n");
			menuChoice = sc.nextInt();
		

			switch (menuChoice) {
			case 1:
				System.out.println(country.readCountryList());
				break;
			case 2:
				System.out.println("Enter Country: ");
				addCountry = sc.next();
				
				countryList.add(addCountry);

				country.writeCountryList(countryList);

				System.out.println("This country has been saved!\n");
				break;
			case 3:
				break;

			}
			System.out.println("Continue (y/n)");
			yesNo = sc.next();

		}
		
		country.writeCountryList(countryList);

		sc.close();
	}

}
