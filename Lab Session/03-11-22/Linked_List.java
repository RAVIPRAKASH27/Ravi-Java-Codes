/*
 * write a java program to check if a particular element exists in a linked list
 * date:-03/11/22
 */
package lab_session;

import java.util.LinkedList;//importing LinkedList 

 class Linked_List {

	public static void main(String[] args) {
		
		LinkedList <String> obj = new LinkedList<>();//creating object of linkedlist with ref variable obj
		
		obj.add("Good");//adding element in linkedlist
		obj.add("Morning");//adding element in linkedlist
		obj.add("Ravi");//adding element in linkedlist
		System.out.println("Linked List :"+obj);//printing the linkedlist
		
		// if else statement is used to check for particular element in linked list
		 if (obj.contains("Ravi"))
		 {
			 System.out.println("Have A Good Day");
		 }
		 else
		 {
			 System.out.println("Name is not Present in Linked List ");
		 }

	}

}
