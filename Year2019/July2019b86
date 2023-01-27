package Year2019;

public class July2019b86 {
	
	public static void main(String[] args)
	{

//		int [][] aaa = {
//				{1, 3, 1, 6},
//				{2, 8, 1, 2},
//			    {6, 2, 7, 5},
//			    {2, 4, 1, 3}
//					};
//			 
//		System.out.println(howManyPaths(aaa));
		
		int [] a = {19,19,16,15,15,15,15,13,5};
		int [] b = {0,12,13,14,14,15,15,19,25,30,35};
		System.out.println(mettingPoint(a, b));
	}
	
	public static int mettingPoint (int[] a, int[] b)
	{
		int high = Math.max(a.length-1, b.length-1);
		if (high == -1) return -1;
		int low = 0, smallest = Integer.MAX_VALUE; // if it will stay smallest return -1.
		int mid;
		
		while (low <= high)
		{
			mid = (low + high)/2;
			if (a[mid] == b[mid])
			{
				if (mid < smallest)
				{
					smallest = mid;
				}	
				high = mid-1;
			}
			else if (a[mid] > b[mid])
				low = mid+1;
			else if (a[mid] < b[mid])
				high = mid-1;
			
		if (smallest == Integer.MAX_VALUE)
			return -1;
		}
		return smallest;
	}
	
	

	/** In this method we will look for all the routes that can be followed from the beginning of the array to the end of the array.
	 * @param mat - the array.
	 * @return options - amount of routes to the end of the matrix.
	 */
	public static int howManyPaths(int[][] mat)
	{
		return howManyPaths(mat,0,0);
	}
	
	private static int howManyPaths(int [][]mat, int i, int j)
	{
		if (i < 0 || i >= mat.length || j < 0 || j >= mat[0].length || mat[i][j] < 0) // exception matrix 
			return 0;
		
		if (i == mat.length-1 && j == mat[0].length-1) // finished the road
		{
			return 1;
		}
		
		int k = mat [i][j]; // who is k ? 
		mat[i][j] = -k; // so we wont get to this place again
		
		int options = howManyPaths(mat,i+k,j)+
					  howManyPaths(mat,i-k,j)+
					  howManyPaths(mat,i,j+k)+
					  howManyPaths(mat,i,j-k);
		mat [i][j] = k; // flip it back to k
		return options;
		
	}
}
