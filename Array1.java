import java.util.*;
public class Array1 {

	public static void main(String[] args) 
	{
		 // To store and display marks of 5 students;
		Scanner sc = new Scanner(System.in);
		
		int[] ar = new int[5];
		int n = ar.length; // ar.length will give you the length of the array. 
		
		for(int i= 0; i<n;i++)
		{
			System.out.println("Please Enter the marks of Student : "+i);	
		    ar[i] = sc.nextInt();
		}
		System.out.println("The marks of students are follows as below : ");
		for (int i = 0;i<n;i++)
		{
			System.out.println(ar[i]);
		}
		
		
	
	
	}

}
