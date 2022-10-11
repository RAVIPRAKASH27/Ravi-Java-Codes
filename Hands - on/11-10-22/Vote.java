/*
 * Test whether the person is eligible to give vote using if -else
 * date:- 11/10/22
 */

import java.util.Scanner;
class Vote {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		sc.close();
		
		if(age>18)
		{
			System.out.println("You can Vote");
		}
		else
		{
			System.out.println("You cannot Vote");
		}

	}

}
