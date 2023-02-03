/**
 * Contributed
 *@author:Refael Camus
 *@version  22-10-2021
 */
public class a2007b1
{
    public static void main (String [] args)
    {
        int [] b = {2,1,6,5,4};
        System.out.println("currect: 2");
        System.out.println(minDiff(b));
    }

    public static int minDiff(int [] a)
    {
        return minDiff(a,0);
    }

    public static int minDiff(int[]a,int i)
    {
        if(i==a.length)
            return -1;
        return Math.max(minDiff(a,0,i,0,0),minDiff(a,i+1));
    }

    public static int minDiff(int[]a,int i,int devided,int sum1,int sum2)
    {
        if (i==a.length)
        {
            if(sum1==sum2)
                return devided;
            else
                return -1;
        }
        if(i<=devided)
            sum1+=a[i];
        else
            sum2+=a[i];
        return minDiff(a,i+1,devided,sum1,sum2);
    }
}
