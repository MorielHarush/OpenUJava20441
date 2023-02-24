package Year2018;

public class Feburary2018a85 {
	
	public static void main(String[] args)
	{

		int [][] aaa = {
				{3, 13, 15, 28, 30},
				{55, 54, 53, 27, 26},
			    {54, 12, 52, 51, 50},
			    {50, 10, 8, 53, 11}
						};
		
		int [] a = {2,2,2,3,3,2,2,2,2,2};
//		System.out.println(what(a));
		System.out.println(longestSlope(aaa,1));
	}

	public static int longestSlope (int [][] mat, int num)
	{
		return longestSlope (mat,num,0,0,1);
	}
	
	private static int longestSlope (int [][] mat,int num, int i, int j, int max)
	{
		if (j == mat[0].length) {
			return longestSlope(mat,num,i+1,0,max);
		}else if(i == mat.length) {
			return max;
		}else {
			int newPath = findPath(mat,num,i,j,mat[i][j]+num);
			return longestSlope(mat,num,i,j+1,Math.max(max, newPath));
		}
	}
	private static int findPath (int [][] mat,int num, int i, int j, int prev)
	{
		if (i < 0 || j < 0 || i >= mat.length || j >= mat[0].length || mat[i][j] == -1) 
			return 0;
		
		if(prev - mat[i][j] != num) 
			return 0;
		
		int up = findPath(mat,num,i-1,j,mat[i][j])+1;
		int down = findPath(mat,num,i+1,j,mat[i][j])+1;
		int right =  findPath(mat,num,i,j+1,mat[i][j])+1;
		int left = findPath(mat,num,i,j-1,mat[i][j])+1;
		int max1 = Math.max(right, left);
		int max2 = Math.max(up,down);
		return Math.max(max1, max2);
	}

	
	public static int what(int [] a) {
		int low = 0;
		int high = a.length-1;
		int len = a.length;
		int sum = 0;
		
		for(int i=0; i< high; i++) {
			sum+=a[i];
		}
		if(sum%2 == 1) {
			return len;
		}
		len--;
		while(low <= high) {
			if(sum%2 == 1) {
				return len;
			}
			if(a[low]%2 == 1 || a[high]%2 == 1) {
				return len;
			}
			low++;
			high--;
			len--;
		}
		return 0;
	}
}
