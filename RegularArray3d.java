import java.util.*;
public class RegularArray3d {

	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
		 int[][][] ar = new int[2][3][3];
		 
		 for(int i=0;i<ar.length;i++)
		 {
			 for(int j =0 ; j<ar[i].length ;j++)
			 {
				 for(int k = 0; k<ar[i][j].length;k++)
				 {
					 System.out.println("Enter marks of college : "+i +"Class : "+j+"Student"+k);
					 ar[i][j][k] = sc.nextInt();
				 }
			 }
		 }
		 System.out.println();
		 System.out.println();
		 
		 System.out.println("Maks scored as follows");
		 for(int i=0;i<ar.length;i++)
		 {
			 for(int j =0 ; j<ar[i].length ;j++)
			 {
				 for(int k = 0; k<ar[i][j].length;k++)
				 {
					 
					 System.out.print(ar[i][j][k]+" ");  
				 }
				 System.out.println();
			 }
		 }
		 
		 
				 

	}

}
