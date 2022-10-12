/*
 * program to demonstrate (do-while) and print the reverse counting from 
 * user input number
 */
import java.util.Scanner;
public class Do_While1 {

	public static void main(String[] args) {
		
		int rem,reverse = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number you want to Reverse:");
		int num = sc.nextInt();
		sc.close();
		
		do 
		{
			 rem=num%10;
			 reverse= reverse*10+rem;
			 num=num/10;		
			  
		}while (num >0);
		
		System.out.println("Reverse of your Entered Number:"+reverse);

	}

}
