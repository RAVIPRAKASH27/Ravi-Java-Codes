/*
 * Write a program to print sum of 10 natural number
 * using while loop
 * date :- 13/10/22
 */
import java.util.*;
public class Natural_Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);//creating an object of scanner class
		System.out.println("Enter the Natural Numbers:");
		int num= sc.nextInt();//taking input from user
		int i =1;
		int sum = 0;
		sc.close();
		while(i <= num)  //checking condition through while loop 
		{  
		//adding the value of i into sum variable  
		sum = sum + i;  
		//increments the value of i by 1  
		i++;  
		}   
		System.out.println("Sum of Natural Numbers are = " + sum);  

	}

}
