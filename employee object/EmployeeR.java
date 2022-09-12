class EmployeeR
{
	int id;
	String name;
	
	static String company_name;
	static String department;
	
	void displayData()
	{
	System.out.println(id+" "+name+" "+(company_name="TCS")+" "+(department="IT"));
	}
	
}
