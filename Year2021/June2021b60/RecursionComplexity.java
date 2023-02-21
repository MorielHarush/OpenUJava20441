package Year2021;

import java.util.Arrays;

public class June2021b60 {

	public static void main(String[] args)
	{
//		int[] a = {8,4,7,1,2,3,5};
//		System.out.println(split3(a));
//		int[] aa = {4,7,1,2,3,5};
//		System.out.println(split3(aa));
		int[] aaa = {1,4,13,6,0,19};
		System.out.println(smallestSub(aaa, 22));
		}
	
	public static boolean split3 (int [] arr)
	{
		return split3 (arr,0,0,0,0);

	}
	private static boolean split3 (int [] arr,int s1,int s2,int s3,int i)
	{
	if (arr.length < 3)
		return false;
	if (i == arr.length)
	{
		if(s1 == s2 && s2 == s3 && s1 == s3)
		{
			return true;
		}
		return false;
	}
	return split3(arr,s1+arr[i],s2,s3,i+1)
		|| split3(arr,s1,s2+arr[i],s3,i+1)
		|| split3(arr,s1,s2,s3+arr[i],i+1);
	} // private close 
	
	public static int smallestSub (int [] a, int k)
	{
		int i=0;
		int j=0;
		int sum=0;
		int smallest = a.length-1;
		
		while(i < a.length)
		{
			sum+=a[i]; // count all the index's in the array.
			while (sum > k) // if sum is bigger than k
			{
				smallest = i-j+1;
				sum -=a[j];
				j++;
			}
			i++;
		}
		return smallest;
	}
	
} // main
