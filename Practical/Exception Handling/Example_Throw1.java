package exception_handling;

 class Example_Throw1 {
	 // creating static dividebyzero() method
	 public static void dividebyZero()
	 {
		 //throw an exception
		 throw new ArithmeticException("Trying to divide by 0");
	 }
	public static void main(String[] args) 
	{
		dividebyZero();

	}

}
