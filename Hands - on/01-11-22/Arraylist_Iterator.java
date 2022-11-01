/*
 * Write a program to iterate arraylist
 * Date:- 01/11/22
 */
package collections_framework;

import java.util.ArrayList;
import java.util.Iterator;

class Arraylist_Iterator {

	public static void main(String[] args) {
		
		ArrayList <String> obj1 = new ArrayList<>(); 
		
		// using add() method
		obj1.add("Ravi");
		obj1.add("Prakash");
		
		System.out.println("Arraylist is:"+obj1);
		
		//calling interator() method
		Iterator<String> obj2= obj1.iterator(); 
		
		System.out.println("Arraylist using Iterator:");
		while(obj2.hasNext())//hasnext is method which will check the next value in array
		{
			System.out.print(obj2.next());
			
			System.out.print(",");
	}

}
}
