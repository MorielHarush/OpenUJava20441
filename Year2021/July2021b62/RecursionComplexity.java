package Year2021;

public class July2021b62 {
	
	public static void main(String[] args)
	{
		int [] a = {-3,5,12,14,-9,13};
		System.out.println(equalSplit(a));
		int [] aa = {-3,5,-12,14,-9,13};
		System.out.println(equalSplit(aa));
		int [][] aaa = 
				{{1,3,7,9},
				{6,4,15,11},
				{36,50,21,22},
				{60,55,30,26}};
		System.out.println(search(aaa, 11));
	}
		
	public static boolean equalSplit(int[] arr)
	{
		return equalSplit(arr,0,0,0,0,arr.length,0);
	}
	
	private static boolean equalSplit(int[] arr,int sum1, int sum2, int cnt1, int cnt2,int left, int i) {
		if (arr.length % 2 != 0) // if arr length is not double ( 3/3 2/2 ZUGI ) 
			return false;
		if (left == 0 && cnt1 == cnt2 && sum1 == sum2)
			return true;
		if (left == 0 && (cnt1 != cnt2 || sum1 != sum2))
			return false;
		return equalSplit(arr,sum1+arr[i],sum2,cnt1+1,cnt2,left-1,i+1)
			|| equalSplit(arr,sum1,sum2+arr[i],cnt1,cnt2+1,left-1,i+1);
	}
	
	
	public static boolean search (int [][]mat,int num)
	{
		int len = mat.length;
		int row = len-1;
	    int col = 0;
	    int value = num-1;
	    int firstQuarter,secondQuarter,thirdQuarter,fourthQuarter;
	    int halfSize = len/2;
	    if(row == 0) {
	    	if(num == mat[row][col]) {
	    	System.out.println("row=0\ncol=0");
	    	return true;
	    	}
	    return false;
	    }
	    
	    while(num != value && halfSize > 0){
		    firstQuarter=mat[row-halfSize][col];
		    secondQuarter=mat[row-halfSize][col+halfSize];
		    thirdQuarter=mat[row][col+halfSize];
		    fourthQuarter=mat[row][col];
		    	
		    if(firstQuarter >= num) {
		    	value=firstQuarter;
		    	row-=halfSize;
		    }
		    else if(secondQuarter >= num) {
		    	value=secondQuarter;
		    	row-=halfSize;
		    	col+=halfSize;
		    }
		    else if(thirdQuarter >= num) {
		    	value=thirdQuarter;
		    	col+=halfSize;
		    }
		    else if(fourthQuarter >= num) {
		    	value=fourthQuarter;
		    }else{ 
		    	return false;
		    }
		    halfSize/=2;
		} // while
	    if(value == num) {
	    	System.out.println("row=" + row+ "\ncol= " +col);
	    	return true;
	    }
	    return false;
	    
	}
}
