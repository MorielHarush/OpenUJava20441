package Year2019;

public class August2019a93 {
	public static void main (String [] args)
	{
		int a[] = {5,4,2,1,3};
//		System.out.println(isSum(a, 0));
//		System.out.println(isSum(a, 8));
//		System.out.println(isSum(a, 9));
//		System.out.println(isSum(a, 2));
//		System.out.println(isSum(a, 11)); // Still has bug here.
//		System.out.println(isSum(a, 17));
		int road1[] = {5,4,5,8,12,9,9,3};
		int road2[] = {7,3,3,12,10,2,10,7};
		System.out.println(shortestRoad(road1, road2));
	}

	public static boolean isSum (int[] a, int num) {
	    return isSum(a, num, 0, 0, 0);
	}

	private static boolean isSum (int[] a, int num, int i, int sum, int count) {

	    if (count <= 3 && sum == num || num == 0) 
	        return true;
	    if(count > 3 )
	    	return false;
	    if(sum > num && i == a.length || i == a.length) 
	    	return false;
	    if(a[i] == num) 
	    	return true;
	    if(i == a.length-1 && count < 3) {
	    	sum+= a[i];
	    	count+=1;
	    }
	    return isSum(a, num, i+1, sum+a[i], count+1) || isSum(a, num, i+2, sum+a[i], count+1) ;
	}
	
	public static int shortestRoad (int [] road1, int [] road2) {
		int i=0;
		int sum = 0;
		while(i < road1.length-2 || i < road2.length-2) {
			if(road1[i] + road1[i+1] + road1[i+2] < road2[i] + road2[i+1] + road2[i+2]) {
				sum +=road1[i] + road1[i+1] + road1[i+2];
				i = i+3;
			}else {
				sum+=road2[i]+road2[i+1]+road2[i+2];
				i=i+3;
			}
		}
		if(road1[i]+road1[i+1] < road2[i]+road2[i+1]) {
			sum+=road1[i]+road1[i+1];
		}else {
			sum+=road2[i]+road2[i+1];
		}
		return sum;
	}
	
	
}
