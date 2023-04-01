
public class Syntaxes {

	public static void main(String[] args) {
		
		int []a[] = new int[4][2];
		int[][] b;
		int [][]c;  //all these syntaxes are valid
		int d[][];
		
		int[] x,y;
		x = new int[4];
		y = new int[5];
		
		int[] m[],n; // No error becuase here m is considered as two dimension and n is one dimension
		int[] []q[],r; // here q is three dimensions and r is one dimension
		int[][] o,p; // both are two dimensions
		int [][]aa,bb[];// aa is 2d, bb is3d;
		
		int []aaa, bbb[][];
		//int []rrr, []rrr// not allowed
		
		System.out.println(a.getClass().getName());

	}

}
