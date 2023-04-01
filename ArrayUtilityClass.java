import java.util.*;
public class ArrayUtilityClass {

	public static void main(String[] args)
	{
		int[] a = new int[4];
		for(int ele:a)
		{
			System.out.print(ele);
		}
		System.out.println();
		Arrays.fill(a,5);
		for(int ele:a)
		{
			System.out.print(ele);
		}
		
		System.out.println();
		
		int[] ar = {1,2,0,0,0,5,6};
		Arrays.fill(ar,2,5,10);
		
		for(int ele:ar)
		{
			System.out.print(ele+",");
		}
		
		System.out.println();
		int[] ar1 = {10,40,30,20,50,90,70,80,60,100};
		Arrays.sort(ar1);
		for(int ele:ar1)
		{
			System.out.print(ele+",");
		}
		
		System.out.println();
		
		int res = Arrays.binarySearch(ar1, 100);
		System.out.println(res);
		
	}

}
