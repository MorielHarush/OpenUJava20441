package Year2022;

public class July2022a91 {
	

	public static void main(String[] args)
	{
		int [] a = {2,4,8,3,10,1,12,3,2};
		cheapRt(a,3,2,4);
		int [] aa = {-4,1,-8,9,6};
		System.out.println(findTriplet(aa));
	}

	public static int cheapRt (int [] stations,int step1,int step2, int limit)
	{
		return cheapRt(stations,step1,step2,limit,0,0,"");
	}
	
	private static int cheapRt (int [] stations,int step1,int step2, int limit,int i,int sum,String str)
	{
		if(limit < 0 || i > stations.length-1)
			return Integer.MAX_VALUE;
		if (i == stations.length-1)
		{
			sum += stations[i];
			System.out.println(str + i + " " + "= " + sum);
			return sum;
		}
		int firstWay = cheapRt(stations,step1,step2,limit,i+step1,sum+stations[i],str + i + " ");
		int	secondWay = cheapRt(stations,step1,step2,limit-1,i+step2,sum+stations[i],str + i + " ");
		
		return Math.min(firstWay, secondWay);	
	}
		
	public static int findTriplet (int [] arr)
	{
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		for(int i=0; i < arr.length; i++) 
		{
			if(arr[i]>max1) {
				max3=max2;
				max2=max1;
				max1=arr[i];
			}else if(arr[i]>max2) {
				max3=max2;
				max2=arr[i];
			}else if(arr[i]>max3) {
				max3=arr[i];
			}
			if(arr[i]<min1) {
				min2=min1;
				min1=arr[i];
			}else if(arr[i]<min2) {
				min2=arr[i];
			}	
		}
		if(min1 * min2 * max1 > max1 * max2 * max3) {
			System.out.println(min1 + " " + min2 + " " + max1);
			return min1 * min2 * max1;
		}else {
			System.out.println(max1 + " " + max2 + " " + max3);
			return max1 * max2 * max3;
		}
	}
}
