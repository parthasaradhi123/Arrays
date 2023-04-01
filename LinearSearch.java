import java.util.*;
public class LinearSearch {

	public static void main(String[] args) 
	{
		int[] ar = {10,20,30,60,76,90,100,900,89};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value you wanna found : ");
		
		int x = sc.nextInt();
		boolean flag = false;
		 
		for(int i =0; i<ar.length;i++)
		{
			if(x == ar[i])
			{
				System.out.println("The value "+x+" is found at index : "+i);
				flag = true;
			 
				break;
			}
		}
	 
		if(flag == false)
		{
			System.out.println("The value is not found ");
		}

	}

}
