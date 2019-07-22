// import library for user input
import java.util.Scanner;

public class FinalProjectHamlin {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Prompt for user input
		System.out.print("Enter any year to see if it is a leap year:");
		// declare integer variable and assign it from user input
		int year = scan.nextInt();
		// logic to check if the date entered is a leap year or not
		if ((year % 4 == 0) && year % 100 != 0) {
			// if above is true create output
            System.out.println(year + " is a leap year.");
        } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
        	// if is also true create output
            System.out.println(year + " is a leap year.");
        } else {
        	// else if false create output
            System.out.println(year + " is NOT a leap year.");
        }
	}
		
}
