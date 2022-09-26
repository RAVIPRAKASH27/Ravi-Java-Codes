package PlayerCasting;

public class Main_Player {

	public static void main(String[] args) {
		
		Player p1 = new Cricketer(); // upcasting method which is automatic
		
		p1.stadium();
		p1.jersey();
		
		 if (p1 instanceof Cricketer) // downcasting method which is non automatic
		 {
			 ((Cricketer)p1).Bat();
			 
		 }
		// end of cricketer-----
		p1 =new Footballer(); //upcasting method which is automatic
		
		p1.stadium();
		p1.jersey();
		
		 if (p1 instanceof Footballer) // downcasting method which is non automatic
		 {
			 ((Footballer)p1).attacker();
		 }
		// end of footballer-----

	}

}
