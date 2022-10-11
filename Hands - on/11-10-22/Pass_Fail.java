/*
 * demonstrate if -else statement of 5 subject the person who get
 * above 60% will be passed otherwise failed output should be like
 * enter your name .enter marks for the 5 subjects.
 * from the user 
 * date:- 11/10/22
 */
import java.util.Scanner;
public class Pass_Fail {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name= sc.nextLine();
		System.out.println("Enter your marks of 5 subject:");
		int maths = sc.nextInt();
		int science = sc.nextInt();
		int phsics = sc.nextInt();
		int chemistry = sc.nextInt();
		int biology = sc.nextInt();
		int sum = maths+science+phsics+chemistry+biology;
		int percentage = sum*100/500;
		if (percentage >60)
		{
			System.out.println(name +" " +"is Passed");
			
		}
		else
		{
			System.out.println(name +" " +"is Failed");
		}
	}

}
