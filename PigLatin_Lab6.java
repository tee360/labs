import java.util.Scanner;

public class PigLatin_Lab6 {

	public static void main(String[] args) {
		// Translate from English to Pig Latin

		Scanner sc = new Scanner(System.in);
		String response = "n";

		welcomeLetter();

		// do{
		String englishWord;
		englishWord = retrieveWordFromUser();

		String lowerCaseWord = englishWord.toLowerCase();
		// System.out.println(englishWord);

		String pigLatin = translateWord(lowerCaseWord);
		System.out.println(pigLatin);

		//System.out.println("\nWould you like to translate another word (y/n)? ");
		//response = sc.next();

		// }while(response.equalsIgnoreCase("y"));

		sc.close();

	}

	public static void welcomeLetter() {
		System.out.println("Welcome to the Pig Latin Translator!\n");

	}

	public static String retrieveWordFromUser() {
		Scanner sc = new Scanner(System.in);
		String latinWord;

		System.out.println("Please enter a word and I will convert it to pig latin for you: ");
		latinWord = sc.next();

		sc.close();

		return latinWord;
	}

	public static String translateWord(String englishWord) {
		// StringBuilder sb = new StringBuilder(20);

		if (englishWord.startsWith("a")) {
			return (englishWord + "way");
		}

		if (englishWord.startsWith("e")) {
			return (englishWord + "way");
		}

		if (englishWord.startsWith("i")) {
			return (englishWord + "way");
		}

		if (englishWord.startsWith("o")) {
			return (englishWord + "way");
		}

		if (englishWord.startsWith("u")) {
			return (englishWord + "way");
		}

		else {
			String cutWord = "";
			String newWord = "";
			int sub = 0;

			for (int i = 0; i <= englishWord.length(); i++) {
				char consonant = englishWord.charAt(i);

				if (consonant == 'a' || consonant == 'e' || consonant == 'i' || consonant == 'o' || consonant == 'u') {
					sub = i;
					break;
				}
				cutWord = cutWord + consonant;

			}

			newWord = englishWord.substring(sub) + cutWord;
			return newWord + "ay";
		}

		// int sub = englishWord.indexOf(!"a");
		// if(!englishWord.startsWith("y"))
		// return (englishWord + "ay");

		// if (englishWord.substring(i) )

		// (englishWord.substring(0, charAt(i))){ //until char isNotVowel
		// }

		// return (englishWord + "ay");
	}

}
