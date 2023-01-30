package Year2022;

public class April2022a96 {
	
	public static void main(String[] args) {
		int a [] = {3,0,0,4,7,9,0,0,0,0,11,15,0,19,20,0,0,31,40,0}; // 19 
//		System.out.println(kAlmostSearch(a,9));
//		System.out.println(kAlmostSearch(a,31)); 
//		System.out.println(kAlmostSearch(a,30));
//		System.out.println(kAlmostSearch(a,20));
//		System.out.println(kAlmostSearch(a,40));
//		System.out.println(kAlmostSearch(a,3));
//		System.out.println(kAlmostSearch(a,4));
//		System.out.println(kAlmostSearch(a,7));
//		System.out.println(kAlmostSearchh(a,9));
//		System.out.println(kAlmostSearchh(a,31)); 
//		System.out.println(kAlmostSearchh(a,30));
//		System.out.println(kAlmostSearchh(a,20));
//		System.out.println(kAlmostSearchh(a,40));
//		System.out.println(kAlmostSearchh(a,3));
//		System.out.println(kAlmostSearchh(a,4));
//		System.out.println(kAlmostSearchh(a,7));
//		
		System.out.println(calc(3,36,4));
	}
	
	public static int kAlmostSearch(int [] a, int num) {
		int low = 0;
		int high = a.length-1;
		while(low <= high) {
			int mid = (low + high)/2;
			while (mid <= high && a[mid] == 0) {
				mid++;
			}
			if (mid > high) 
			{
				mid--;
				while (mid >= low && a[mid] == 0)
				{
					mid--;
				}
				if (mid < low)
				{
					return -1;
				}
			}
			if (a[mid] == num) 
				return mid;
			if (a[mid] < num) 
				low = (low+high)/2 + 1;
			else 
				high = (low+high)/2 - 1;
		}
		return -1;
	}
	
	public static int kAlmostSearchh(int [] a, int num) {
		int low = 0;
		int high = a.length-1;
		while(low <= high) {
			int mid = (low + high)/2;
			if (mid <= high && a[mid] == 0)
				mid++;
			if (mid >= high && a[mid] == 0) 
				mid--;
			if (a[mid] == num) 
				return mid;
			if (a[mid] < num) {
				low = (low+high)/2 + 1;
				if(a[low] == num)
					return low;
			}
			else 
				high = (low+high)/2 - 1;	
		}
		return -1;
	}
	
	
	public static int calc(int num, int result, int maxOp) {
		return calc(num,result,maxOp,num+"",num);
	}
	
	private static int calc(int num, int result, int maxOp,String string, int currentResult)	{
		if (maxOp < 0)
			return 0;
		if (currentResult == result) {
			System.out.println(string + "=" + result);
			return 1;
		}
		int r0 = calc(num, result, maxOp-1,string + "+" + num, currentResult + num);
		int r1 = calc(num, result, maxOp-1,string + "-" + num, currentResult - num);
		int r2 = calc(num, result, maxOp-1,string + "*" + num, currentResult * num);
		int r3 = calc(num, result, maxOp-1,string + "/" + num, currentResult / num);
		
		return r0+r1+r2+r3;
	}
}
