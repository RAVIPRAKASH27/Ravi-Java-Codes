/*
 * Write a program to demonstrate on nested if to check grade of student
 * take the input from the user
 * date:-13/10/22
 */
import java.util.Scanner;
public class Nested_If {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);//creating object of scanner class
		double percent;
     
        System.out.print("Enter the percentage of student:- ");
        percent = sc.nextDouble();//taking user input 
        sc.close();
        if(percent > 90) { //using nested else if to perform operation according to user input
            System.out.println("You got A Grade");
        } else if(percent < 90 && percent >= 84) {
            System.out.println("You got A1 Grade");
        } else if(percent < 80 && percent >= 74) {
            System.out.println("You got B Grade");
        } else if(percent < 70 && percent >= 64) {
            System.out.println("You got C1 Grade");
        } else if(percent < 60 && percent >= 42) {
            System.out.println("You got C Grade");
        } else {
            System.out.println("You are Fail Try Next Time");
        }
    }



	}


