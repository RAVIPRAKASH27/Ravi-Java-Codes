/*
 * Write a program to print sum of only positive numbers using do - while loop
 * take the input from the user .if the user enters any negative number then that number 
 * should not be added in sum 
 * date:- 13/10/22
 * 
 */
import java.util.Scanner;

 class Positive_Sum {

	public static void main(String[] args) {
		{
		
		Scanner sc = new Scanner (System.in);//creating object of scanner class
		int sum = 0;
		int user = 0;

		//performing do while operation		

		 do {
			 sum += user;//storing the value of user input in sum variable 
			 System.out.print("Enter Positive Numbers To get Sum:");
			  user =sc.nextInt();//taking user input

		 } while(user >= 0);//while loop execute until condition become false ie-negative number from user
           
           System.out.println( "Sum of Positive Number is : " +sum);
           sc.close();
	}
	}
}
