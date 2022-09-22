package bank;

public class Hdfc_Bank extends Rbi_Bank{

	public Hdfc_Bank(String bank_name, String bank_location) {
		super(bank_name, bank_location);

	}
	@Override
	void getLocation(String city)
	{
		System.out.println("Location of Hdfc:-Bandra"+ bank_location +"City:- "+ city);
	}
	
}
