/* 
 * Program to find Largest of Two Numbers
 * Name:- Raviprakash Vaishya
 * Date:-06/10/2022
 */
import java.util.Scanner;// importing scanner class for taking user input
public class Largest {

	public static void main(String[] args) {
		   {
		      int numberOne, numberTwo, largest;//Creating variable(initializing) for further Storing values
		      Scanner sc = new Scanner(System.in);
		      
		      System.out.print("Enter the First Number: ");
		      numberOne = sc.nextInt();//Taking first number input from user
		      System.out.print("Enter the Second Number: ");
		      numberTwo = sc.nextInt();//Taking Second Number input form user
		      
		      if(numberOne>numberTwo)//if statement used here for comparing the user input
		         largest = numberOne;//storing the value of if statement in largest variable if true
		      else
		         largest = numberTwo;//storing the value of else statement in largest variable if statement is false
		      
		      System.out.println("Largest Number is  = " +largest);//printing the value of largest between two number
		   }
		}

	}


