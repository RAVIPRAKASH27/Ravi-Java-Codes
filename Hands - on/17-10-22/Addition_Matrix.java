/*
 * Addition of 2 matrix
 * Date:-17/10/22
 */
import java.util.Scanner;//importing scanner class
public class Addition_Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//creating object of scanner class
		System.out.println("enter the row of 1 matrix:");
		int row1=sc.nextInt();//taking row1 as input
		System.out.println("enter the column of 1 matrix:");
		int col1=sc.nextInt();//taking column1 as input
		int[] [] matrix1=new int[row1][col1];	//declaring 2d matrix
		
		System.out.println("enter"+row1*col1+"element of 1 matrix:");
		for (int i=0;i<row1;i++)//for loop for row and column of 1 matrix
		{
			for(int j=0;j<col1;j++)
				matrix1[i][j]=sc.nextInt();
		}
		
		System.out.println("enter the row of 2 matrix:");
		int row2=sc.nextInt();//taking row2 as input
		System.out.println("enter the column of 2 matrix:");
		int col2=sc.nextInt();//taking column2 as input
		
		if(row1==row2 && col1==col2)//if else statement is used to check proper input
		{
			int[][] matrix2= new int[row2][col2];	//declaring 2d matrix
			int [][] matrix3= new int [row2][col2];	//declaring 2d matrix
			
			System.out.println("enter"+row2*col2+"element of 2 matrix:");
			for(int i=0;i<row2;i++)//for loop for row and column of 2 matrix
			{
				for(int j=0;j<col2;j++)
				{
					matrix2[i][j]=sc.nextInt();
					matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
				}
			}
			
			System.out.println("\n--Result of two matrix--");
			for (int i=0;i<row2;i++)//for loop for output
			{
				for(int j=0;j<col2;j++)
					System.out.println(matrix3[i][j]+"\t");//printing the result matrix
				System.out.println("\n");
			}
 		}
		else
			System.out.println("Wrong Input");
		sc.close();

	}

}
