package Year2023;

public class February2023a65 {
    public static void  main (String[] args){
//    	System.out.println(countPairs(3));
    	int a [] = {2,3,8,27};
   	System.out.println(superInc(a, 13));
    System.out.println(superInc(a, 30));
    System.out.println(superInc(a, 7));
    System.out.println(superInc(a, 9));
    System.out.println(superInc(a, 10));
    }
    
	public static int countPairs (int n) {
		return countPairs(n, 0, 0, "");
	}
	
	private static int countPairs (int n, int open,int close, String str) {
		if(open < close || n < 0 ) {
			return 0;
		}
		if(n == 0 && open == 3 && close == 3) {
			System.out.println(str);
			return 1;
		}
		int openR = countPairs(n-1,open+1,close,str+"(");
		int closeR = countPairs(n,open,close+1,str+")");
		return openR + closeR;
	}
	
	
	// 2,3,8,27. k = 30
	public static boolean superInc (int [] arr, int k) {
		for(int i = arr.length-1; i >= 0; i--) {
			if(arr[i] <= k) 
				k-= arr[i];
			if(k == 0)
				return true;
		}
		return false;
}
	
	
	
}

