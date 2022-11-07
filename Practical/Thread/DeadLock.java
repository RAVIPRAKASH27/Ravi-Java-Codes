package exception_handling;
 class DeadLock 
 {
	 private final String name;

	 public DeadLock(String name)
	 {
		 this.name =name;
	 }
	 public String getName()
	 {
		 return this.name;
	 }
	 public synchronized void call(DeadLock caller) {
		 System.out.println(this.getName()+ " has asked to call me " +caller.getName());
		 try {
			 Thread.sleep(100);
		 }catch(InterruptedException e) {
			 e.printStackTrace();
		 }
		 caller.callMe(this);
	 }
	 public synchronized void callMe(DeadLock caller) {
		 System.out.println(this.getName()+" has called me "+caller.getName());
	 }
	 
	public static void main(String[] args)
	{
		DeadLock caller1 =new DeadLock("caller 1");
		DeadLock caller2 =new DeadLock("caller 2");
		
		new Thread(new Runnable() {
			public void run() {caller1.call(caller2);}
		}).start();
		
		new Thread(new Runnable() {
			public void run() {caller2.call(caller1);}
		}).start();


	}

}
