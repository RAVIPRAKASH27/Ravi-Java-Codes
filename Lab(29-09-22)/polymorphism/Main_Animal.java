package animalpoly;

public class Main_Animal {

	public static void main(String[] args)
	{
		Animal c1=new Cat();//upcasting
		c1.eat();
		if(c1 instanceof Animal)// downcasting
		{
			((Cat)c1).carLooks();
		}				
		Animal d1=new Dog();//upcasting
		d1.eat();

	}

}
