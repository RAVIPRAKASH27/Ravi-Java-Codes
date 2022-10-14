import java.util.Scanner;
public class Narrowing {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the double value:");
		double d = sc.nextDouble();
		//explicit type casting required from larger to smaller datatype
		System.out.println("Enter the long value:");
		long l = sc.nextLong();
		//explicit type casting required from larger to smaller datatype
		System.out.println("Enter the int value:");
		int i = sc.nextInt();
		l=(long)d;
		i=(int)l;
		sc.close();
		System.out.println("value of double:"+d);
		System.out.println("value of long:"+l);
		System.out.println("value of int:"+i);
		
		
		

	}

}
