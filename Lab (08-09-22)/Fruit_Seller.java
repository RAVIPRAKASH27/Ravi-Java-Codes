// Calculation of a Fruit Seller 

import java.util.*;
class Fruit_Seller
{	

	public static void main (String[]args)
	{
	Scanner sc= new Scanner (System.in);
		System.out.println("Enter the apple Remain");
	int a= sc.nextInt();
		System.out.println("Enter the apple Sold");
	int b= sc.nextInt();
	int x= a*2/3;
	//int y= a*2/3;
	int total=a+x;
	System.out.println("Total Apple :-"+ total);
	}
}

