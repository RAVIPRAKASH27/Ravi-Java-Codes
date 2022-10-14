import java.util.Scanner;//importing scanner class for user input
class Single_Array {

	public static void main(String[] args) {
				
		int a;  
		
		Scanner sc=new Scanner(System.in);  //creating object of scanner class
		System.out.print("Enter the number of elements you want to store: ");  
		//reading the number of elements from the user  that we want   
		a=sc.nextInt();  
		
		//creates an array in the memory of length 10  
		int[] array = new int[10];  
		System.out.println("Enter the elements of the array : ");  
		
		for(int i=0; i<a; i++)  
		{  
		//reading array elements from the user   
		array[i]=sc.nextInt();  
		}  
		System.out.println("Array elements are: ");  
		// accessing array elements using  for loop for printing  
		for (int i=0; i<a; i++)   
		{  
		System.out.println(array[i]);  
		sc.close();
		}  
		

	}

}
