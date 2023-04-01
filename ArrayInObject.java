class Fan
{
	int cost;
	String brand;
	int noOfWings;
}



public class ArrayInObject {

	public static void main(String[] args) 
	{
		 Fan a[] = new Fan[3];
		 
		 a[0] = new Fan();
		 a[1] =  new Fan();
		 a[2] = new Fan();
		 
		 a[0].brand = "Partha";
		 a[1].brand = "saradhi";
		 a[2].brand = "Reddy";
		 
		 
		 
		 System.out.println(a[0].brand+ " "+ a[1].brand+" " +a[2].brand);
				
		 

	}

}
