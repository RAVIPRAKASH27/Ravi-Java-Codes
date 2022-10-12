/*
 * program to demonstrate while loop continues until entered 
 * number is positive take the input from the user
 * date : - 12/10/22
 */
import java.util.Scanner;
public class While_Loop1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Positive Number:");
		int num = sc.nextInt();
		sc.close();
		
		while  (!(num <= 0))
		{
			System.out.println("welcome to the java world");
			num++;
			break;
		}


	}

}
