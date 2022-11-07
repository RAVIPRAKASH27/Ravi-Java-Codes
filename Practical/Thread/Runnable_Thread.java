package exception_handling;
/*
 * If the class implements the Runnable interface
 * the thread can be run by passing an instance 
 * of the class to a Thread object's constructor
 * and then calling the thread's start() method.
  */
class Runnable_Thread implements Runnable {

	public static void main(String[] args) {
		Runnable_Thread m=new Runnable_Thread();
		Thread t=new Thread(m);
		t.start();
		System.out.println("This code is outside the thread");
	}
	public void run()
	{
		System.out.println("This code is running in the thread");
	}

}

