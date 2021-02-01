// Time Complexity : O(n*m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english
    //The direction of the diagonal is how we add elements and for each direction we handle the edge cases.

// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0)
            return new int[0];
        int n= matrix.length, m= matrix[0].length;
        int[] output=  new int[n*m];
        int dir=1;
        int index=0;
        int i=0,j=0;
        while(index<n*m)
        {
            output[index++]= matrix[i][j];
            if(dir==1)
            {
                if(j==m-1)
                {
                    dir=-1;
                    i++;
                }
                else if(i==0)
                {
                    dir=-1;
                    j++;
                }
                else
                {
                    i--;
                    j++;
                }
            }
            else
            {
                if(i==n-1)
                {
                    dir=1;
                    j++;
                }
                else if(j==0)
                {
                    dir=1;
                    i++;
                }
                else
                {
                    j--;
                    i++;
                }
            }
        }
        
        return output;
        
    }
}