package exception_handling;
/*
 * if a class extends the thread class
 * the thread can be run by creating an instance of the class
 * and call its start()method
 */
 class Thread_Example extends Thread {

	public static void main(String[] args)
	{
		Thread_Example thread =new Thread_Example();// creating object of class Main
		thread.start();
		System.out.println("This code is outside of the thread");

		}
		public void run()
		{
			System.out.println("This code is running in the thread");
		}
	}


