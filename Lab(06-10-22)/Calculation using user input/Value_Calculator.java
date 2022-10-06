/* create a program for calculation.read three values from the user for operation
 * first and second values as opearands third value as opearator.
 * if user press 1 = print addition of first and second
 * if user press 2 = print subtraction of first and second
 * if user press 3 = print multiplication of first and second
 * if user press 4 = print division of first and second
 * Name:- Raviprakash Vaishya
 * Date:-06/10/2022
 */
import java.util.Scanner;//importing scanner class for user input
public class Value_Calculator {

	public static void main(String[] args) {
		    char operator;//creating variable for user input  selection for further action.
		    Double number1, number2, result;//creating variable where first and second act as opearands and result to store the operation

		    // create an object of Scanner class
		    Scanner input = new Scanner(System.in);

		    // asking the  users to enter operator
		    System.out.println("Choose an Option to Perform Operation: 1, 2, 3, or 4");
		    operator = input.next().charAt(0);

		    // ask users to enter first numbers
		    System.out.println("Enter first number");
		    number1 = input.nextDouble();

		    // ask users to enter second numbers
		    System.out.println("Enter second number");
		    number2 = input.nextDouble();
		    // using switch case statement to perform different operation according to user input
		    switch (operator) {

		      // performs addition between numbers
		      case  '1':
		        result = number1 + number2;
		        System.out.println(number1 + " + " + number2 + " = " + result);
		        break;

		      // performs subtraction between numbers
		      case '2':
		        result = number1 - number2;
		        System.out.println(number1 + " - " + number2 + " = " + result);
		        break;

		      // performs multiplication between numbers
		      case '3':
		        result = number1 * number2;
		        System.out.println(number1 + " * " + number2 + " = " + result);
		        break;

		      // performs division between numbers
		      case '4':
		        result = number1 / number2;
		        System.out.println(number1 + " / " + number2 + " = " + result);
		        break;

		      default://default is used when user press other option which is not included in opeartion gives invalid input 
		        System.out.println("Invalid Input!");
		        break;
		    }

		    input.close();
		  }
		

	}


