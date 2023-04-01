import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please type Some Thing :");
		//
		String s = sc.nextLine();
		System.out.println("After taking the data from console");
		int a = sc.nextInt();
		System.out.println("You have entered a number :"+a);
		System.out.println("You have entered a string :"+s);
		float f = sc.nextFloat();
		System.out.println("You have entered a float value :"+f);
		
		
		

	}

}
