package Year2020;

public class March2020a85 {
	
	public static void main(String[] args)
	{
//		int[][] mat =
//		{
//				{ 1, 1, -1, 1, 1 },
//				{ 1, 0, 0, -1, 1 },
//				{ 1, 1, 1, 1, -1 },
//				{ -1, -1, 1, 1, 1 },
//				{ 1, 1, -1, -1, 1 } };
//		System.out.println(findMaximum(mat));
		
		int [] a = { 1, 2, 4, 4, 5 };
		System.out.println(strictlyIncreasing(a));
//		int [] b = { 5, 4, 3, 2, 1 };
//		System.out.println(strictlyIncreasing(b));
	}

	/**
	 * moed March2020a 85 - Recursion
	 * Private helping method which will help to check the maximum points can be earn in the given array.
	 * @param mat - The Array.
	 * @param row - the Row in the array.
	 * @param col - the column in the array.
	 * @param sum - sum all the moves.
	 * @return - The maximum points can be earn in the given array.
	 */
	
	public static int findMaximum(int[][] mat)
	{
		return findMaximum(mat, 0, 0, 0);

	}

	private static int findMaximum(int[][] mat, int row, int col, int sum)
	{
		if (mat[0][0] == -1) // if mat [0][0] starts with -1
		{
			return -1; 
		}
		if (row >= mat.length || col < 0 || col >= mat[row].length || mat[row][col] == -1) // exception condition
		{
			return sum;
		}

		int moveDown = findMaximum(mat, row + 1, col, sum + mat[row][col]); // go down 
		int moveRightOrLeft;
		if (row % 2 == 0)  
		{
			moveRightOrLeft = findMaximum(mat, row, col + 1, sum + mat[row][col]); // go only right
		}
		else
		{
			moveRightOrLeft = findMaximum(mat, row, col - 1, sum + mat[row][col]); // go only left 
		}

		return Math.max(moveDown, moveRightOrLeft);
	}
	
	
	
	
	
	/**
	 * @param a - The array 
	 * @return - Returns the number of sub-arrays within it that are arranged is rising series.
	 * Time Complexity - O(n)
	 * Space Complexity - O(n)
	 */
	public static int strictlyIncreasing (int[] a)
	{
		int counter = 0; 
		int sum = 0;
		for (int i = 0; i < a.length-1; i++)
		{
			if (a[i] < a[i+1]) 
			{
				counter++;
				sum += counter;
				
			} // if close
			else  // if there is no up going array 
			{
				counter = 0;
			}
		} // for close 
		return sum;
	} // Main close 

}
