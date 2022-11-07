package exception_handling;

class Thread_Example2 extends Thread {
	public static int amount=0;

	public static void main(String[] args) {
		Thread_Example2 te=new Thread_Example2();
		te.start();
		System.out.println(amount); 
		amount++;   
		System.out.println(amount);

		}
		public void run()
		{
		amount++; 
		}

}


