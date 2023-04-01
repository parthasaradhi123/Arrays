import java.util.*;
public class JaggedArray3d {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[][][] ar = new int[2][][];
		ar[0] = new int[4][];
		ar[1] = new int[2][];
		
		ar[0][0] = new int[3];
		ar[0][1] = new int[2];
		ar[0][2] = new int[1];
		ar[0][3] = new int[2];
		
		ar[1][0] = new int[4];
		ar[1][1] = new int[2];
		
 
		
//		int n = ar.length;
//		int y = ar[0].length;
//		int a = ar[1].length;
//		int x = ar[0][0].length;
//		int z = ar[1][0].length;
//		
//		System.out.println(n);
//		System.out.println(y);
//		System.out.println(a);
//		System.out.println(x);
//		System.out.println(z);
		
 
		
		
		for(int i = 0; i<ar.length;i++)
		{
			for(int j = 0;j<ar[i].length;j++)
			{
				for(int k = 0; k<ar[i][j].length;k++)
				{
					System.out.println("Enter the marks of Collge : "+i+" class : "+j+" Students : "+k);
					ar[i][j][k] = sc.nextInt();				}
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("The marks of students are as follows : ");
		for(int i = 0; i<ar.length;i++)
		{
			for(int j = 0;j<ar[i].length;j++)
			{
				for(int k = 0; k<ar[i][j].length;k++)
				{
					System.out.print(ar[i][j][k]+ " " );
					 				}
			}
			System.out.println();
		}
		
	}

}
