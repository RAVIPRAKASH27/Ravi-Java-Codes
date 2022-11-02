package exception_handling;

class Null_Pointer_Exception {

	public static void main(String[] args)
	{
		try
		{
			String s=null;//null value
			
			System.out.println(s.charAt(0));
		}
		catch(Exception ne)
		{
			
			System.out.println("Exception =>"+ne.getMessage());
		}

	}

}
