package inherit;

public class Inheritance extends Child {//here Inheritance inherit the property and method of child class 
// here single level inheritance is used like form class a to class b and from class b to class c
	public static void main(String[] args) 
	{
		//Creating object using default constructor ie classname();
		Inheritance a = new Inheritance();
		//Calling the method through reference variable ie a
		a.sing();
		a.speak();
		a.dance();

	}

}
