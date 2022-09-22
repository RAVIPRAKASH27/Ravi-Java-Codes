package bank;

public class Rbi_Bank {
	
	String bank_name;
	String bank_location;
	
	


	public Rbi_Bank(String bank_name, String bank_location) {
		
		this.bank_name = bank_name;
		this.bank_location = bank_location;
	}
	@Override
	public String toString() {
		return "Rbi_Bank [bank_name=" + bank_name + ", bank_location=" + bank_location + "]";
	}
	void getLocation(String city)
	{
		System.out.println("Location:-"+ bank_location +"City:- "+ city);
	}
	
	void getEmployee_Count(int n)
	{
		System.out.println("Total Number of Employee in Bank:-"+n);
	}

}
