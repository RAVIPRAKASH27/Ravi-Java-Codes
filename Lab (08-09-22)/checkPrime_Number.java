
// java program to check a number is prime or not

class CheckPrime_Number
{
	static void primeCheck(int p)
	{
	int i, a=0,b=0;
	a = p/2;
	if(p==0||p==1)
	{
	 	 System.out.println(p+ "is not a prime number");
	}
	else
	{	
	for(i=2;i<=a;i++)
	{
	if(p%i==0)
	{
	 	System.out.println(p+ "is not a prime number");
	b=1;
	break;
	}
	}
	if(b==0)
	{
		System.out.println(p+ "is a prime number");
	}
	}
	}	

	 public static void main(String args[])  

	{
		primeCheck(1);  
		primeCheck(7);  
		primeCheck(12);  
		primeCheck(19);  
	}
}
