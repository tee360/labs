import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String response = "";
		
		System.out.println("Learn your squares and cubes!\n");
		
		do
		{
			System.out.print("Please enter an integer: ");
			int cutoff = sc.nextInt();
			
			System.out.println("\nNumber\t\tSquared\t\tCubed");
			System.out.println("======\t\t=======\t\t=====");
			
			for (int i = 1; i <= cutoff; i++)
			{
				System.out.println(i+"\t\t" + i*i + "\t\t" + i*i*i);
			}
			
			System.out.println("\nContinue? (y/n): ");
			response = sc.next();
		}while(response.equalsIgnoreCase("y"));
		
		sc.close();
	}

}
