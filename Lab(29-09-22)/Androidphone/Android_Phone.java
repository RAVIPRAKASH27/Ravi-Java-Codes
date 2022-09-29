package androidphone;

public class Android_Phone {

	String brand;
	String color;
	int ram;
	
	
	public Android_Phone(String brand,String color, int ram) {
		super();
		this.brand=brand;
		this.color = color;
		this.ram = ram;
		
	}
	
	void displayData()
	{
		System.out.println("Brand:-"+brand+" ,"+"Color of phone:-"+color+", "+"Ram Size of phone:-"+ram+"gb");
	}
 	public static void main (String[]args) {
 		
 		Android_Phone[]arr= new Android_Phone[3];
 		arr[0] = new Android_Phone ("Apple","Purple",512);
 		arr[1] = new Android_Phone ("Samsung","Blue",256);
 		arr[2] = new Android_Phone ("vivo","Red",128);
 		
 		arr[0].displayData();
 		arr[1].displayData();
 		arr[2].displayData();		
 		
 		
 	}
 		
 	}
