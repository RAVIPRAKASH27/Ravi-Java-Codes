/*
 * Program to demonstrate (Switch)and printing week days
 *  date:- 11/10/22
 */
import java.util.Scanner;//importing scanner class for user input
class Week_Days {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // create an object of Scanner class
		System.out.println("Enter the week:");
		String name = sc.nextLine();//Taking user input
		sc.close();
		 switch (name) {

	      case  "M":
	        System.out.println("MONDAY");
	        break;

	      case "T":
	    	  System.out.println("Tuesday");
	        break;

	      case "W":
	    	  System.out.println("WEDNESDAY");
	        break;
	        
	      case "TH":
	    	  System.out.println("THURSDAY");
	        break;
	        
	      case "F":
	    	  System.out.println("FRIDAY");
	        break;
	      case "S":
	    	  System.out.println("SATURDAY");
	        break;
	      case "SU":
	    	  System.out.println("SUNDAY");
	        break;
	        
	      default://default is used when user press other option which is not included in opeartion gives invalid input 
	        System.out.println("Invalid Input!");
	        break;
	}
}
}
