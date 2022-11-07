package exception_handling;
/*
 * To avoid concurrency problems  isAlive() method is used.
 * This method will check whether the thread has finished  running
 * before using any attributes that the thread can change.
 */
 class Thread_isAlive extends Thread {
	 public static int amount=0;
	public static void main(String[] args) {
		Thread_isAlive te=new Thread_isAlive();
		te.start();
		//wait for the thread to finish.
		while(te.isAlive())
		{
			System.out.println("Waiting......");
		}
		//update amount and print its value.
		System.out.println("Value:"+amount);  
		amount++;
		System.out.println("Value:"+amount);
		}
		public void run()
		{
		amount++; 
		}

}


