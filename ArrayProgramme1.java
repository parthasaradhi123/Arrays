//Write a programme to get the sum of all elements in an array;


public class ArrayProgramme1 
{
	public static void main(String[] args)
	{
		int[]a = {10,20,46,65,89,100};
		int x = 0;
		
		for(int i = 0; i<a.length;i++)
		{
			//x = x +a[i];
			x+=a[i];	
			
		}
		System.out.println("The sum is "+ x);
		
	}

}
