package bank;

public class Axis_Bank extends Rbi_Bank {

	public Axis_Bank(String bank_name, String bank_location) {
		super(bank_name, bank_location);
		
	}
	@Override
	void getEmployee_Count(int n)
	{
		System.out.println("Total Number of Employee in Axis Bank:-"+n);
	}
}
