// write a programme to get the max value in an array

public class ArrayProgramming2 {

	public static void main(String[] args) 
	{
		int[] ar = {10,45,60,89,9,10,6,7,2};
		int max = ar[0];
		
		for(int i =0; i<ar.length; i++)
		{
			if(ar[i] >max)
			{
				max = ar[i];
			}
		}
		System.out.println("The max value is : "+max);

	}

}
