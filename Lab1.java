import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		System.out.println();
		
		String choice = "y";
		
//		while(choice == "y")
		while(choice.equalsIgnoreCase("y"))
		{
			System.out.print("Enter Length: ");
			
			float length = scanner.nextFloat();
			
			System.out.print("Enter Width: ");
			
			float width = scanner.nextFloat();
			
			float area = length * width;
			
			System.out.println("Area: " + area);
			
			float perimeter = (2*length) + (2*width);
			
			System.out.println("Perimeter: " + perimeter);
			
			System.out.println();
			System.out.print("Enter Height: ");
			
			float height = scanner.nextFloat();
			
			float volume = length * width * height;
			
			System.out.println("Volume: " + volume);
			System.out.println();
			
			System.out.println("Continue? (y/n): ");
			
			choice = scanner.next();
			System.out.println();
			
		};
		
		scanner.close();
	}

}
