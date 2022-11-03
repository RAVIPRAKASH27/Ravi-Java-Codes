/*
 * write a java program to get the element in a tree set which is 
 * Strictly greater the or equal to the given element
 * date:- 03/11/22
 */
package lab_session;

import java.util.TreeSet;//importing TreeSet

class Tree_Set {

	public static void main(String[] args) {
		
		TreeSet <Integer> obj = new TreeSet<>();//Creating object of treeset with ref varibale obj
		obj.add(22);
		obj.add(36);
		obj.add(44);
		obj.add(55);
		
		System.out.println("TreeSet are:"+obj);//printing the value of treeset
	
		//printing the greater or equal to value with ceiling which return the value according to input
		System.out.println("Greater than or equal to 30 in TreeSet are:"+obj.ceiling(30));
		
		System.out.println("Greater than or equal to 50 in TreeSet are:"+obj.ceiling(50));
		
	}

}
