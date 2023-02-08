package Year2022;

public class March2022b74 {
	
	
	public static void main(String[] args) {
		char[][] mat1 = {{'a','c','b','c','@','a'},
				{'b','x','z','c','s','a'},
				{'?','c','d','*','c','d'},
				{'b','c','a','8','b','b'},
				{'c','2','x','+','b','c'}};
		System.out.println(lengthPath(mat1, "abc"));
		int [] arr = {2,4,5,3,5,1};
//		System.out.println(findDuplicate(arr));
//		System.out.println(findDuplicatee(arr));
	}
	
				
	
	public static int lengthPath (char[][] mat, String pattern)
	{
		return lengthPath(mat,pattern,0,0,pattern,0,0);
	}
	
	private static int lengthPath(char [][]mat, String pattern,int i, int j ,String original,int sum,int max1) {
		
		if(i < 0 || j < 0 || i >= mat.length || j >= mat[0].length || mat[i][j] == '#')
			return 0;
		
		if(pattern.length() == 0) {
			pattern = original;
			max1 = sum;
			sum = 1;
			i = 0;
			j = 0;
		}
			
		if(mat[i][j] == pattern.charAt(0)) {
			pattern = original;
			sum++;
			}else {
				lengthPath(mat, pattern.substring(1), i,j,original,sum,max1);
			}			

			char temp = mat[i][j];
			mat[i][j] = '#';
			int way1 = lengthPath(mat, pattern, i+1, j,original, sum,max1+1);
			int way2 = lengthPath(mat, pattern, i, j+1,original, sum,max1+1);
			int way3 = lengthPath(mat, pattern, i-1, j,original, sum,max1+1);
			int way4 = lengthPath(mat, pattern, i, j-1,original, sum,max1+1);
			
			mat[i][j] = temp;
			return way1 + way2 + way3 + way4;
	}

	
	
	// Option A 
	public static int findDuplicate(int[] a) {
//		quickSort(a,0,a.length-1);
		int i;
		for(i=1; i<a.length; i++) {
			if(a[i] == a[i+1])
				return a[i];
		}	
		return -1;
	}
	
	// Option B 
	public static int findDuplicatee(int[] a) {
	    int n = a.length - 1;
	    int sum = (n * (n + 1)) / 2;
	    int arraySum = 0;
	    
	    for (int i : a) {
	        arraySum += i;
	    }
	    
	    int duplicate = arraySum - sum;
	    if (duplicate == 0) {
	        return -1;
	    } else {
	        return duplicate;
	    }
	}
	
	}

