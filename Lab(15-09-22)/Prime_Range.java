import java.util.Scanner;

class Prime_Range
{
	static void printRange()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the First Range");
	int a = sc.nextInt();
	System.out.println("Enter the Second Range");
	int b = sc.nextInt();
	int f=0;
	for (int i=a;i<=b;i++)
	{
	f=0;
	for(int j=1;j<=i;j++)
	{
	if(i%j==0)
	f++;
	}
	if(f==2)
	System.out.print(i+" ");
	}
	}
	
	public static void main(String[]args)
	{
	Prime_Range.printRange();
	
	}
}