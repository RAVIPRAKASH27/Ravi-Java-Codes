import java.util.Scanner;// importing Scanner class to take user input
public class Main_Addition {

	public static void main(String[] args)
	{
		Arithemetic a1 = new Arithemetic();//creating object
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a =sc.nextInt();//taking user input 
		System.out.println("Enter second number");
		int b =sc.nextInt();//taking user input 
		System.out.println("Enter Third number");
		int c =sc.nextInt();//taking user input 
		System.out.println("Enter Fourth number");
		int d =sc.nextInt();//taking user input 
		
		a1.getAddition(a, b, c, d);//calling method ie getaddition with method overloading
		sc.close();
	}

}
