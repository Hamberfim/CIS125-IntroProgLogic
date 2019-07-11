
public class passReturn {
	public static void main(String[] args) {	
		String thisReturned = returnHours("Anthony Hamlin", 8);
		System.out.println(thisReturned);
	  }
	
	public static String returnHours(String myName, int hoursSlept) {
		String myPhrase;
		myPhrase = "My output is: " + myName + ", " + hoursSlept;
		return myPhrase;
	}
}
