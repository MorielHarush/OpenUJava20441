package Year2019;

public class Feburary2019a84 {
	
	public static void main(String[] args)
	{
		int [] a = {5, 7, -2, 10 };
		System.out.println(sumPower3(67));
		System.out.println(sumPower3(128));
		System.out.println(sumPower3(37));
		System.out.println(sumPower3(38));
//		System.out.println(average(a));
	}
	
	
	/**In this method we will average the differences between the organs from a particular index from beginning to end,
	 *  we divide the array into two sides, rightsum and leftsum.
		In fact,
 		we calculate the difference between the right side of the array from the particular index and also
  		from the left side of the array from the particular index.
		Then, perform a calculation between all the differences we received for all the indexes and
 		return the difference between the averages
	 * @param arr - the array.
	 * @return - the average between.
	 */
	public static int average (int [] arr)
	{

        if(arr.length == 1)
            return arr[0];
        if(arr.length == 0)
            return 0;

        int start = 0;
        int end =arr.length - 1;
        int divider = 0; // the "divider" that moves along the array 

        double maxDif = 0; // don't need to set as Integer.MIN_VALUE since we use the absolute difference so 0 will do as a dummy 
        double leftSum = arr[0];
        double rightSum = 0;

        for(int i = 1; i <= end ; ++i) {
            rightSum += arr[i];
        }

        for(int i = 0 ; i < arr.length -1  ; ++i) {
            //get the temporary absolute difference 
            double tempDif = leftSum/(start + 1) - rightSum/end;
            tempDif = (tempDif < 0) ? -tempDif : tempDif ;

            if(tempDif > maxDif) {
                maxDif = tempDif;
                divider = i;
            }
                
            // here we move the divider to the right by 1 spot so we increase and decrease values as we make the left window bigger and the right one smaller
            leftSum += arr[i+1]; 
            start++; // for the average
            rightSum-= arr[i+1]; 
            end--; // for the average
            
        }
        return divider;
	}
	
	

	/** 2019a84 February - RECURSION . 
	 * In this method we get some number, and the method should check if the number can make a strong third.
	For example: 3 * 0 + 3 * 1 + 3 * 2 = number
	If so, truth must be returned.
	If not, a lie must be returned.
	The method performs a modular arithmetic operation on the number and checks if it has a remainder.
	If its remainder is 2, we will automatically get a lie.
	If the remainder is 1, we will continue with the method and perform another mathematical operation which
	is the number less the remainder divided by 3,
	and so we will divide non-stop until we reach 0 and thus we get a truth
	 * @param num - the number.
	 * @return - True or False.
	 */
	public static boolean sumPower3 (int num)
	{
        int rest = num%3; // leaves the rest of the number.
        if(rest == 2 || rest == 0) // the solution will be 1 || 2 || 3 . if it is 0,2 , it cannot be used by Pow.
            return false;
        if(rest == 1)
        	return true;
        return sumPower3(num);
	} // main close 

	
	
	
	
	
}
