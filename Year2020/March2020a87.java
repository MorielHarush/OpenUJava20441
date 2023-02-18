package Year2020;

public class March2020a87 {
	/* 
	 * Tester
	 */
	public static void main(String[] args)
	{
	int[] a ={ 1, 3, 6, 8 }; // nothing
	int [] b = {1,2,3,4,5,6,7,8,9}; // YES
	March2020a87.printTriplets(a, 40);
	March2020a87.printTriplets(b, 40);
	}
	
	
	/**
	Moed 2020a - 470 , 87 Complexity
		/**A method that calculates the product of three different members in a one-dimensional array.
	Count three different members at a time when there is i, i + 1, i-2 and so we will be able to calculate three
 	different members at a time and compare them to Num.
	 * 
	 * @param a - The array.
	 * @param num - the number which suppose to be calculated.
	 */

	public static void printTriplets (int[] a, int num)
	{
        for(int i = 0 ; i < a.length-2; ++i) {
            int rightIndex = a.length-1;
            int leftIndex = i + 1;

            while(leftIndex < rightIndex) {
                if(a[i] * a[leftIndex] * a[rightIndex] == num)
                    System.out.println(a[i] + "    " + a[leftIndex] + "    " + a[rightIndex] );
                if(a[i] * a[leftIndex] * a[rightIndex] < num)
                    leftIndex++;
                else
                    rightIndex--;
            } // while close

        } // for close 

    } // main close 

	
	/**
	 * Moed 2020a - 470 , 87 RECURSION
	 * A method that calculates the amount of references that can be made in a matrix.
		The method works so you can only go right or down.
		So we will use 2 recursive readings.
		The first will go right and down and make sure we did not come from above with the help of a Boolean response.
		The second will go down and right and make sure we came from above with the help of a Boolean response.
	 * @param mat - the Array
	 * @param k - Turns amount
	 * @return - the amount of turns can be made in the same two dimensional array.
	 */

		public static int totalWays(int [][] mat,int k ) {
		return totalWays(mat,k,0,0,0);
	}
	
	private static int totalWays(int [][] mat,int k ,int i,int j,int lastI) {
		if(i < 0 || j < 0 || i >= mat.length || j >= mat[0].length || k < 0)
			return 0;
		if (i == mat.length-1 && j == mat.length-1 && k == 0)
			return 1;
		
		if(i == 0 && j == 0)
			return totalWays(mat,k,i+1,j,i);
		if(lastI == i) {
			return totalWays(mat,k,i+1,j,i) + totalWays(mat,k,i,j+1,i);
		}else {
			return totalWays(mat,k,i+1,j,i) + totalWays(mat,k-1,i,j+1,i);
		}

	}
	
	
}
	
	
	

	

