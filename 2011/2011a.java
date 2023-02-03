/**
 * Contributed
 *@author:Refael Camus
 *@version  22-10-2021
 */
public class a2011
{
    public static void main (String [] args)
    { 
        int [][] mat = {   
                {8,9,5,1,7,8},
                {9,5,5,16,17,18},
                {10,11,6,15,2,19},
                {7,12,13,14,4,20},
                {9,13,4,15,22,21},
                {10,11,12,12,23,22},
            }; 

        System.out.println(isPath(mat));
        int [] a ={10,5,1,2,7,4,2,6};
        System.out.println(what(a,2));
    }

    public static boolean isPath(int[][]mat)
    { 
        if(mat.length==0)
            return false;
        if(mat.length==1) 
            return true;
        return isPath(mat,0,0,mat[0][0]-1);
    }

    private static boolean isPath(int[][]mat,int i,int j,int prev)
    { 
        if(i<0||j<0||i>mat.length-1||j>mat[0].length-1||mat[i][j]!=prev+1)
            return false;
        if(i==mat.length-1&&j==mat[0].length-1)
            return true;
        prev=mat[i][j];  
        return (isPath(mat,i+1,j,prev)||isPath(mat,i-1,j,prev)||isPath(mat,i,j+1,prev)||isPath(mat,i,j-1,prev));
    }

    public static int what(int[]a,int num)    
    {
        int b[]=new int[a.length];
        int size=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%num==0) 
            { 
                b[a[i]/num]=a[i]/num;   
            } 
        }
        for(int k=1;k<a.length;k++)
        {
            if(b[k]==k) 
                size++;
            else 
                return size;   
        }
        return size;
    }
}
