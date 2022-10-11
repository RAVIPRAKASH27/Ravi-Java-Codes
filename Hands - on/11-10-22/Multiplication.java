/*
 * Print any multiplication table using for loop take the input
 * from the user 
 * date:- 11/10/22
 */
import java.util.Scanner;
public class Multiplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for table");
		int num = sc.nextInt();
		sc.close();
		
		for (int i = 1; i <= 10; i++)
		{
            
            System.out.println(num + " * " + i + " = "+ num * i);
                               
		}

	}
}
