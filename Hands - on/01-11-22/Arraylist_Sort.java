/*
 * Write a program to sort arraylist in descending order
 */
package collections_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


class Arraylist_Sort {

	public static void main(String[] args) {
		
		ArrayList <Integer> obj1 = new ArrayList<>(); 
		
		// using add() method
		obj1.add(97);
		obj1.add(53);
		obj1.add(88);
		
		System.out.println("Arraylist is:"+obj1);
		
		// sorting the arraylist in descending order

		Collections.sort(obj1,Collections.reverseOrder());
		System.out.println("Sorted Arraylist is:"+obj1);
		
	}

}
