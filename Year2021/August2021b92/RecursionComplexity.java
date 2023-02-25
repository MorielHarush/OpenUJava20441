package shadi;

public class liveTest9 {
	public static void main(String[] args)
	{
		int [] a = {1,3,6,2};
//		System.out.println(printExpr(a,4));
		int [] aa = { 1 , 1 , 0 , 1 ,1 ,0 , 1 , 1 , 1 , 1 , 0 , 0 };
//		System.out.println(longestSequence(aa, 0));
		System.out.println(longestSequence(aa, 1));
		System.out.println(longestSequence(aa, 2));
//		System.out.println(longestSequence(aa, 3));
//		System.out.println(longestSequence(aa, 4));
	}

	public static int printExpr(int [] arr,int num) {
		return printExpr(arr,num,0,0,"");
	}
	
	private static int printExpr(int [] arr,int num,int i,int sum,String str) {
		
		if(sum == num) {
			System.out.println(str);
			return 1;
		}
		if(i > arr.length-1) {
			return 0;
		}
		
		int way1 = printExpr(arr,num,i+1,sum,str);
		int way2 = printExpr(arr,num,i+1,sum+arr[i],str + "+" + arr[i]);
		int way3 = printExpr(arr,num,i+1,sum-arr[i],str + "-" + arr[i]);
		return way1+way2+way3;
	}
	
	

	
	public static int longestSequence(int [] a, int k) {
		int left = 0;
		int counter = 0;
		int sum = k;
		while (left + counter < a.length)
		{
			sum += (a[left + counter] -1);
//			System.out.println(a[max + start] -1);
			if (sum >= 0)
				counter++;
			else
			{
				sum -= (a[left] -1); // so it will ignore the current place
					left++;
			}
		}
		return counter;
	}
	
	
}
