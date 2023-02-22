package Year2022;

public class March2022b74 {
	
	
	public static void main(String[] args) {
		char[][] mat1 = {{'a','c','b','c','@','a'},
				{'b','x','z','c','s','a'},
				{'?','c','d','*','c','d'},
				{'b','c','a','8','b','b'},
				{'c','2','x','+','b','c'}};
		System.out.println(lengthPath(mat1, "abc"));
		System.out.println(maxPath(mat1, "abc"));
//		int [] arr = {2,4,5,3,5,1};
//		System.out.println(findDuplicate(arr));
//		System.out.println(findDuplicateee(arr));
	}
	
				
	
	public static int lengthPath (char[][] mat, String pattern) {
		return lengthPath(mat,pattern,0,0,0,0,1,0);
	}
    public static int lengthPath(char[][] mat, String pattern, int i, int j, int prevI,int privJ, int pathLength, int charIndex) {

        int maxPath = pathLength;
        char currentChar = pattern.charAt(charIndex);

        if (j > 0 && (j-1 != privJ || i != prevI) && mat[j-1][i] == currentChar) {
            int path = lengthPath(mat, pattern, i, j-1, i, j, pathLength+1, 0);
            maxPath = Math.max(maxPath, path);
        }
        if (i > 0 && (j != privJ && i-1 != prevI) && mat[j][i-1] == currentChar) {
            int path = lengthPath(mat, pattern, i-1, j, i, j, pathLength+1, 0);
            maxPath = Math.max(maxPath, path);
        }
        if (i < mat.length && (j+1 != privJ || i != prevI) && mat[j+1][i] == currentChar) {
            int path = lengthPath(mat, pattern, i, j+1, i, j, pathLength+1, 0);
            maxPath = Math.max(maxPath, path);
        }
        if (j < mat[j].length && (j != privJ || i+1 != prevI) && mat[j][i+1] == currentChar) {
            int path = lengthPath(mat, pattern, i+1, j, i, j, pathLength+1, 0);
            maxPath = Math.max(maxPath, path);
        }

        if (charIndex < pattern.length()-1) {
            int path = lengthPath(mat, pattern, i, j, prevI, privJ, pathLength,charIndex+1);
            maxPath = Math.max(maxPath, path);
        }
        return maxPath;
    }
    
    

    public static int maxPath(char[][] mat, String pattern) {
        return maxPath(mat, pattern, 0, 0, 0, 0);
    }

    private static int maxPath(char[][] mat, String pattern, int xIndex, int yIndex, int charIndex, int sum) {

        int pathSum = sum;
        char currentChar = pattern.charAt(charIndex);
        char element = mat[yIndex][xIndex];

        if (currentChar == element) {
            int path = lengthPath(mat, pattern);
            pathSum = Math.max(pathSum, path);
        }
        if (charIndex < pattern.length() - 1) {
            int path = maxPath(mat, pattern, xIndex, yIndex, charIndex + 1, sum);
            pathSum = Math.max(pathSum, path);
        } else {
            if (xIndex < mat.length) {
                int path = maxPath(mat, pattern, xIndex + 1, yIndex, 0, sum);
                pathSum = Math.max(pathSum, path);
            }
            if (yIndex < mat[xIndex].length) {
                int path = maxPath(mat, pattern, 0, yIndex + 1, 0, sum);
                pathSum = Math.max(pathSum, path);
            }
        }

        return pathSum;
    }

	
	public static int findDuplicate(int[] a)
	{
		
		for (int i = 0; i < a.length; i++){
			if (a[0] == a[a[0]]){
				return a[0];
			}
			// swap(0, a[0]);
			int temp = a[0];
			a[0] = a[a[0]];
			a[temp] = temp;
		}
		return 0;
	}
}

