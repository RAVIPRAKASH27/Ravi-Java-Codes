import java.util.Scanner;//importing Scanner class for user input

class Main_Polygon {

	public static void main(String[] args) 
	{
		Rectangle r = new Rectangle();//creating object
		
		System.out.println("Enter the length of Polygon");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();//taking the value of length from user 
		System.out.println("Enter the breath of Polygon");
		int breadth = sc.nextInt();//taking the value of breadth from user 
		r.getArea(length, breadth);//calling the method 
		sc.close();
	}

}
