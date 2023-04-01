
public class ArrayProgramme3 {

	public static void main(String[] args)
	{
		int[] ar = {10,45,60,89,9,10,6,7,2};
		int min = ar[0];
		
		for(int i =0; i<ar.length; i++)
		{
			if(ar[i] <min)
			{
				min = ar[i];
			}
		}
		System.out.println("The min value is : "+min);
	}

}
