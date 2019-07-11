
public class PrintingAVariable {
	public static void main(String[] args) {
		// declare and initialize variables
		String favoriteColor = "purple";
		int age = 103;
		
		/* This is how to join two strings or a string and number. 
		   Use the plus sign (+) AKA the concatenation operator
		 */
		String joinTwoVariables = favoriteColor + age;
		// The plus sign joins a string literal with the variable joinTwoVariables
		System.out.println("The result is " + joinTwoVariables);
	}
}
