class Main_Employee
{
	public static void main(String[]args)
	{
	StudentR e1 = new StudentR ();
	StudentR e2 = new StudentR ();
	StudentR e3 = new StudentR ();

	e1.id = 1;
	e1.name = "Ravi";

	e2.id = 2;
	e2.name = "Rajveer";

	e3.id = 3;
	e3.name = "Anudip";
	
	e1.displayData();
	e2.displayData();
	e3.displayData();
	
	}
}