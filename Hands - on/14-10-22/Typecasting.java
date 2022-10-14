
import java.util.Scanner;
class Typecasting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of Int:");
		int i = sc.nextInt();
		
		System.out.println("Enter the value of Long:");
		long l = sc.nextLong(); 
		
		System.out.println("Enter the value of Float:");
		float f = sc.nextFloat();
		f=l=i;//no explict type casting required
		sc.close();

		System.out.println("int value:"+i+" "+"long value:"+l+" "+"float value:"+f);
	}

}
