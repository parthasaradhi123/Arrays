//It is also called sinking sort/ exchanging sort
public class Sorting {

	public static void main(String[] args) 
	{
		int[] ar = {7,5,4,6,1,3,2,8};
		
		for(int i =0; i<ar.length;i++)
		{
			for(int j=1;j<ar.length-i;j++)
			{
				if(ar[j]<ar[j-1])
						{
							int swap = ar[j];
							ar[j] =ar[j-1];
							ar[j-1] =swap;
						}
			}
		}
		for(int ele:ar)
		{
			System.out.println(ele);
		}
	}

}
