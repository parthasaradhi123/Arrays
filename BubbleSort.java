
public class BubbleSort {

	public static void main(String[] args) 
	{
		 int[] a = {3,5,2,7,1,4,6,98,92,0,9};
		 
		 for(int i=0; i<a.length;i++)
		 {
			 for(int j=0;j<a.length-1-i;j++) 
			 {
				 if(a[j]>a[j+1])
					 
				 {
					 int temp = a[j];
					 a[j] = a[j+1];
					 a[j+1] = temp;
				 }
			 }
		 }
		 for(int ele:a)
		 {
			 System.out.println(ele);
		 }
	}

}
