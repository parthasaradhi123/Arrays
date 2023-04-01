import java.util.*;
public class Array2d 
{
	
// write an array in which array should have 3 classes and each class holds 4 students.
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[][] ar= new int[3][4]; // array declaration
		//here ar.length will give the length of the array that means outer loop
		// and ar[i] will give you the size of the inner loop.
		
		for(int i =0;i<ar.length;i++) //ar.length will give me the ar[3] array length
		{
			for(int j=0;j<ar[i].length;j++) //ar[0].length will give me the ar[4] array length
			{
				//for i == 0 the inner loop will run 4 time so for ar[0] that is i the inner loop
				// ar[0][0] that is ar[j] will run times in these 4 times we will collect the data 
				// from the user.
				System.out.println("Enter the value of class : "+i +"and their Students : "+j);
				ar[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println("The value of students are as follows : ");
		for(int i =0;i<ar.length;i++) //ar.length will give me the ar[3] array length
		{
			for(int j=0;j<ar[i].length;j++) //ar[0].length will give me the ar[4] array length
			{ 
				//here i represents the classes and j represents the students and now we are printing the
				// for 0 class how many students same goes till 2 class with 4 students
				System.out.print(ar[i][j]+" ");
				
			}
			System.out.println();
		}
		
	}

}
