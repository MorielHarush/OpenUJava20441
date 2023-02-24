package Year2018;

public class June2018b83 {
	
	public static void main(String[] args)
	{

//		int [][] aaa = {
//				{2, 0, 1, 2, 3},
//				{2, 3, 5, 5, 4},
//			    {8, -1, 6, 8, 7},
//			    {3, 4, 7, 2, 4},
//			    {2, 4, 3, 1, 2}
//			    
//						};
//			 
//		System.out.println(prince(aaa, 0, 0));
		
		int b [] = {6,6,18,18,-4,-4,12,9,9};
		int bb[] = {5};
		int cc [] = {8,8,-7,-7,3,3,0,0,10,10,5,5,4};
//		System.out.println(findSingle(b));
//		System.out.println(findSingle(bb));
		System.out.println(findSingle(cc));
	}

	public static int prince(int [] []drm,int i, int j) {
		int total = prince(drm,i,j,drm[i][j],0);
		if(total == Integer.MAX_VALUE)
			return -1;
		return total;
		
	}
	
	private static int prince(int [][] drm,int i, int j,int prev,int sum) {
		if (i < 0 || j < 0 || i >= drm.length || j >= drm[0].length)
			return Integer.MAX_VALUE;
		
		
		if(drm[i][j] == -1)
			return sum+1;
		
		if(drm[i][j] == Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		
		prev = drm[i][j];
		drm[i][j] = Integer.MAX_VALUE;
		
		int down = prince(drm, i+1,j,prev,sum+1); 
		int up =prince(drm, i-1,j,prev,sum+1); 
		int left = prince(drm, i,j-1,prev,sum+1);
	    int right =prince(drm, i,j+1,prev,sum+1);
	    
	    drm[i][j] = prev;
	    
	    int max1 =Math.min(left, right);
	    int max2 = Math.min(down,up);
	    
	    return Math.min(max1, max2);
			
	}
	
	
	public static int findSingle(int [] a) {
		if (a.length == 1)
			return a[0];
		int low=0;
		int high=a.length-1;
		int mid;
		while(low < high) {
			mid = (low + high)/2;
			if(a[mid] == a[mid+1]){
				if((mid-low)%2 == 0) {
					low=mid;		
				}else{
					high = mid-1;
				}
			}else if(a[mid] == a[mid-1]){
				if((high-mid)%2 == 0){
					high=mid;
				}else{
					low=mid+1;
				}
			}else{
				return a[mid];
			}
		}
		return a[low];
	}
}

