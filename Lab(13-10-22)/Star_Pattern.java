/*
 * Write a Program to demonstrate on nested for loop 
 * and print the pattern
 * *
 * **
 * ***
 * ****
 * *****
 * ******
 * date:- 13/10/22
 */
import java.util.Scanner;
public class Star_Pattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//creating object of scanner class
		
		int i,j;
		System.out.println("Enter the no of Rows you want in Pattern");
		int row = sc.nextInt();//taking user input
		sc.close();
		//initializing for loop for row and column
		for(i = 1; i <= row; i++) 
		{
            	for(j = 1; j <= i; ++j) 
            	{
            	System.out.print(" * ");//printing * every time loop repeat
            	}
            	System.out.print("\n");//printing in next line for next loop
		}
	}

}
