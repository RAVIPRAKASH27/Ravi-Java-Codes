/*
 * Write a java program to compare two sets and retian element which are sane on both sets.
 * use retainAll() method
 */
package lab_session;

import java.util.HashSet;//importing hashset

class Hash_Set {

	public static void main(String[] args) {
		
		HashSet <String> fruits1 = new HashSet<>();//creating object of hashset with ref variable fruits1
		
		fruits1.add("Mango");//adding elements in hashset 
		fruits1.add("Apple");
		fruits1.add("Pipneapple");
		
		System.out.println("First Fruits Hashset :"+fruits1);//printing the hashset of fruits1
		
		HashSet <String> fruits2 = new HashSet<>();//creating object of hashset with ref variable fruits2
		
		fruits2.add("Banana");//adding elements in hashset 
		fruits2.add("Apple");
		fruits2.add("Watermelon");
		
		System.out.println("Second Fruits Hashset :"+fruits2);//printing the hashset of fruits2
		
		fruits1.retainAll(fruits2);//calling retailAll()method to compare from both sets
		
		//Printing the result after comparing two set
		
		System.out.println("After Comparing The Same Element in both Hashset:"+fruits1);
	}

}
