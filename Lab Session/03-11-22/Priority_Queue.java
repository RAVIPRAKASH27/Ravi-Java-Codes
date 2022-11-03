/*
 * Write a java program to change priority queue to maximum priority queue
 * use any loop
 * date:- 03/11/22
 */
package lab_session;

import java.util.PriorityQueue;//importing Priority queue

 class Priority_Queue {

	public static void main(String[] args) {
		
		PriorityQueue <Integer> obj = new PriorityQueue<>();//creating object of priority queue with ref variable obj
		
		obj.add(35);//adding element 
		obj.add(42);
		obj.add(19);
		
		System.out.println("Priority Queue are:"+obj);//printing the priority queue
		
		System.out.println("Maximum Priority Queue are:");
		
		Integer obj1=null;
		while((obj1=obj.poll()) !=null) //using while loop for condition of maximum priority queue
		{
			System.out.println(obj1);//printing the maximum queue
		}
		
	}

}
