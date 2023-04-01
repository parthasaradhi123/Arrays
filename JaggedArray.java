import java.util.*;
public class JaggedArray {

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 int[][] ar = new int[3][];
		 
		 ar[0] = new int[3];
		 ar[1] = new int[4];
		 ar[2] = new int[2];
		 
		 for(int i =0; i<ar.length;i++)
		 {
			 for(int j =0 ; j<ar[i].length;j++)
			 {
				 System.out.println("Enter the value for class : "+i+" and their students : "+j);
				 ar[i][j] = sc.nextInt();
			 }
			 System.out.println();
		 }
		 System.out.println();
		 System.out.println();
		 System.out.println(" The values of classes and their students are as follows");
		 for(int i =0; i<ar.length;i++)
		 {
			 for(int j =0 ; j<ar[i].length;j++)
			 {
				 System.out.println("For class "+i+ ":");
				 System.out.println( ar[i][j]+" ");
				  
			 }
			 System.out.println();
		 }
		 
		 
	}

}
