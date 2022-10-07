/*write a program to demonstrate on method overloading concept of
 * Arithmetic Addition .take the in put from the user
 * Name:- Raviprakash Vaishya
 * Date:- 07/10/22
 */
public class Arithemetic {
	
	// creating method 
	void getAddition(int a,int b)
	{
		System.out.println(a+b);
	}
	// doing method overloading with same method name
	void getAddition(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	void getAddition(int a,int b,int c,int d)
	{
		System.out.println(a+b+c+d);
	}

}
