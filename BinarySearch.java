import java.util.*;

public class BinarySearch {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] ar = {10,20,30,40,50,60,70,80,90,100};
		System.out.println("Enter the element that you wanna found out in the aray : ");
		int x = sc.nextInt();
		int low = 0;
		int high = ar.length-1;
		
	
		 while(low<=high)
		 {
			 int mid = (low+high)/2;
			 if(x == ar[mid])
			 {
				 System.out.println("The value "+x+" is found out at : " +mid);
				 break;
			 }
			 else if(x<ar[mid])
			 {
				 high = mid-1;
			 }
			 else if(x>ar[mid])
			 {
				 low = mid+1;
			 } 
		 }
		 if(low>high)
		 {
			 System.out.println("The value is not found");
		 }
		
	}

}
