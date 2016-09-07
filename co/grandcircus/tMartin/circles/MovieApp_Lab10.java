/*
Pair programming done by: Thomas Martin and Mark Delloro
*/

package co.grandcircus.tMartin.circles;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieApp_Lab10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = "";
		String category = "";
		Movie movie = new Movie(name, category);
		
		ArrayList <Movie> movieList = new ArrayList<Movie>();
		
		System.out.println("Welcome to the Movie List App!\nThere are 10 movies in this list.\n"
				+ "Type one of the categories to learn more!\nScifi, Action, Comedy, Foreign.");
		
		
		movieList.add(0, new Movie("Captain America", "Action"));
		movieList.add(1, new Movie ("The Avengers", "Action"));
		movieList.add(2, new Movie ("Superman", "Action"));
		movieList.add(3, new Movie ("Aliens", "Scifi"));
		movieList.add(4, new Movie ("Predators", "Scifi"));
		movieList.add(5, new Movie ("Liar Liar", "Comedy"));
		movieList.add(6, new Movie ("Wedding Crashers", "Comedy"));
		movieList.add(7, new Movie ("Just Friends", "Comedy"));
		movieList.add(8, new Movie ("Ong Bok", "Foreign"));
		movieList.add(9, new Movie ("Amelie", "Foreign"));
		
//		int lastIndex = movieList.size() - 1;
//		Movie lastCode = movieList.get(lastIndex);
//		System.out.println(lastCode);
		
		System.out.println(movieList);
		
//		String[] mList = (String[]) movieList.toArray();
//		System.out.println(mList);
		
		//		for(Movie mList : movieList){
//			System.out.println(mList);
//		}
		
//		for (int i = 0; i < movieList.size(); i++){
//			System.out.println(movieList.get(i));
//		}
		
		sc.close();
	}

}