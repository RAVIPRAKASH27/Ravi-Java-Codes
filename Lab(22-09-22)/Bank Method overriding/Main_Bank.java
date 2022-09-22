package bank;

public class Main_Bank {

	public static void main(String[] args) {
		 
		Hdfc_Bank h1 = new Hdfc_Bank("Hdfc Bank","Andheri");
		Axis_Bank a1= new Axis_Bank("Axis Bank","Bandra");
		System.out.println(h1);
		System.out.println(a1);
		h1.getLocation("Mumbai");
		a1.getEmployee_Count(20);
		
	}

}
