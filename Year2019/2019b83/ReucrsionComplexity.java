package Year2019;

public class June2019b83 {
	public static void main(String[] args)
	{
		int mat [] [] = {{1,1,1,1,1,1,1},
						{1,1,0,1,0,0,1},
						{1,1,1,1,0,1,1}};
		int mat1 [] [] = {{-99,-72,-64,-55,-28,-10,-5},
						  {-72,-53,-46,-38,11,13,22},
						  {-63,-48,-27,-12,14,16,23},
						  {-44,-29,-10,0,18,20,28},
						  {0,12,14,20,28,30,35}};
		System.out.println(howManyNegativeNumbers(mat1));
//		System.out.println(longestPath(mat, 2, 5));
		
	}
	
	public static int longestPath(int mat [][], int x, int y) {
		return longestPath(mat,0,0,0,x,y);
	}
	
	private static int longestPath(int mat [][],int i,int j, int sum,int x,int y) {
		
		if(i < 0 || j < 0 || i >= mat.length || j >= mat[0].length || mat[i][j] == 0)
			return sum;
		
		int z = mat[i][j];
		mat[i][j] = 0;

		int right = longestPath(mat,i,j+1,sum+z,x,y);
		int down = longestPath(mat,i+1,j,sum+z,x,y);
		int left = longestPath(mat,i,j-1,sum+z,x,y);
		int up = longestPath(mat,i-1,j,sum+z,x,y);
		mat[i][j] = z;
		
		int max1 = Math.max(right, left);
		int max2 = Math.max(up, down);
		return Math.max(max1, max2);

	}
	
	public static int howManyNegativeNumbers(int [][] arr) {
	    int sum = 0;
	    int m = arr.length;
	    int n = arr[0].length;
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            if (arr[i][j] < 0) {
	                sum++;
	            }
	        }
	    }
	    return sum;
	}
}


