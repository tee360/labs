package co.grandcircus.tMartin.countryList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Responsible for reading and writing countries to a file
 * @author thomas
 *
 */

public class CountriesTextFile {
	
	private Path filePath;

	public CountriesTextFile(String filePath) {
		this.filePath = Paths.get(filePath);
	}
	
	public CountriesTextFile(){
		this("C:/Users/thomas/workspace/Labs/src/co/grandcircus/tMartin/countryList/countries.txt");
	}

	public List<String> readCountryList(){
		List<String> countryList = new ArrayList<>();
		if (!Files.exists(filePath)) {
			return countryList;
		}
		
		try {
			File file = filePath.toFile();
			FileReader fileReader = new FileReader(file);
			BufferedReader reader = new BufferedReader(fileReader);
		 
			String line = reader.readLine();
			while (line != null) {
				countryList.add(line);
				line = reader.readLine();
			}
			
			reader.close();
			
			return countryList;
			
		} catch (IOException ex) {
			throw new RuntimeException("Unable to read countries.", ex);
		}
	}
	
	public void writeCountryList(List<String> countryList){
		try {
			if (!Files.exists(filePath)) {
				Files.createFile(filePath);
			}
			
			File file = filePath.toFile(); 
			PrintWriter writer = new PrintWriter(
								new BufferedWriter(
								new FileWriter(file)), true);
			
			for (String country : countryList) {
				writer.println(country);
			}
			
			writer.close();
		} catch (IOException ex) { // IOException is a checked exception (I have to handle it)
			// RuntimeException is an unchecked exception (I don't have to handle it)
			throw new RuntimeException("Unable to save country list.", ex);
		}
		
	}

	@Override
	public String toString() {
		return "CountriesTextFile [filePath=" + filePath + "]";
	}
	
}
