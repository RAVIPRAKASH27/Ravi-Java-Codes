/*
 * write a java program to replace the second element of a arraylist with the specified element
 * date:-03/11/22
 */
package lab_session;

import java.util.ArrayList;//importing ArrayList 

 class Array_List {

	public static void main(String[] args) {
		
		 ArrayList<String>  obj = new ArrayList<String>();//creating object of arraylist with ref variable obj

		  obj.add("Ravi");//adding element in arraylist
		  obj.add("Prakash");

		  System.out.println("Original array list: " + obj);
		  String obj1 = "Anudip";//creating varible obj1 for replacement
		  obj.set(1,obj1);//setting obj1 in arraylist index1 for replacement
		  System.out.println("ArrayList After Replacement:"+obj);//printing the value of replaced arraylist


	}

}
