package exception_handling;

 class Throw_Example
 {
	 //method
	public static void checkNum(int num)
	{
		if (num<1)
		{
			throw new ArithmeticException("\n Number is negative, cannot calculate square");
		}
		else
		{
			System.out.println("square of"+num+"is"+ (num*num));
		}

	}
	//main method
	public static void main(String[] args) 
	{
		Throw_Example obj =new Throw_Example();
		obj.checkNum(-3);
		System.out.println("Rest of the code:");
	}

}
