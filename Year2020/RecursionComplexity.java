package Year2020;

public class July2020b81 {

	public static void main(String[] args)
	{
		int [] lengths = {2,5,10,20,50};
		System.out.println(makeSum(lengths,40,4));
//		int aa [] = {10,4,2,5,6,3,8,1,5,9};
//		minimumSubK(aa, 3);
	}
		
	public static int makeSum(int [] lengths, int k, int num) {
		return makeSum(lengths,k,num,0);
	}
	
	private static int makeSum(int [] lengths, int k, int num, int i) {
		if(i == lengths.length-1)
			return 0;
		if(k == 0 && num >= 0)
			return 1;
		if(num < 0)
			return 0;
		return makeSum(lengths,k-lengths[i],num-1,i) + makeSum(lengths,k,num,i+1);
	}
	
	public static void minimumSubK(int [] arr, int k)
	{
		int start=0;
		int end=k-1;
		int sum=0;
		int sumMin;
		int i;
		int len=arr.length;
		for(i=0; i<k; i++) {
			sum+=arr[i]; // sum all the index's until the 
		}
		sumMin=sum;
		for(i=k; i<len; i++) {
			sum+=arr[i]-arr[i-k]; // every time we will minus the last number and will take a new triplet.
			if(sum<sumMin) { // if the new sum is smaller
				sumMin=sum; 
				end=i; 
				start=i-k+1;
			}
		}
		System.out.println("Minimum sub array is (" +start+","+end+")");
	}
}
