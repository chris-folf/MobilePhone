package phone;

import java.util.Scanner;
import java.util.concurrent.ForkJoinPool.ManagedBlocker;

public class driver {
	
	
	//Main
	public static void main(String[] arg) {
		//ALl of the attributes
		String Manufacture = " ";
		String Model;
		int Price;
		String Carrier;
		
		
		// Make a scanner and called it s
		Scanner s = new Scanner(System.in); // THE SCANNER IS NAME ---> s <---
		

		while(Manufacture.toLowerCase().charAt(0) != 'n') { // If n is press then Exit
			System.out.println("Press n now to exit");
			
			// Ask the user for phone info
			System.out.println("Who made your phone?");
			Manufacture = s.nextLine();

			
			System.out.println("WHat is the Model?");
			Model = s.nextLine();
			
			System.out.println("What is the Price?");
			Price = s.nextInt();
			s.nextLine(); // Clear buffer
			
			System.out.println("Who is the phone Carrier?");
			Carrier = s.nextLine();
			
			
			//Make cellPhone
			cellPhone cellPhone = new cellPhone(Manufacture, Model, Price, Carrier);
			
			
			
			// Ask user for number and text
			System.out.println("What phone number would you like to call?");
			System.out.println(cellPhone.call(s.nextLine())); // Send in the user text then print it out
			//the I am calling

			System.out.println("What text would you like to send?");
			System.out.println(cellPhone.text(s.nextLine())); // Send in the user text then print it out
			
			//Print out phone info
			System.out.println(cellPhone.toString()); // Call the toString then print it out the return
		
			// Ask if the user want to exit
			System.out.println("\nPress n now to exit");
			Manufacture = s.nextLine();
			
		}
	}

}
