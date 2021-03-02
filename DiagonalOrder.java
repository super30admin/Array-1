//Time Complexity: O(n*m)
//Space complexity: O(1). output array for result rest are constant spaces.
//executed on leetcode 
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix==null || matrix.length==0) return new int[0];
        int m = matrix.length;
        int n = matrix[0].length;
        int []output = new int[m*n];
        int i=0, r=0, c=0, dir = 1;
        while(i<n*m)
        {
            output[i] = matrix[r][c];           //looping through each value of the matrix.
            if(dir==1)
            {
                if(c==n-1)                      //if the direction is upwards, increment row and decrement col. if we reach the last element of digonal we increment only column and change direction and if column going out of bound increment row and change direction
                {
                    r++;
                    dir=-1;
                }
                else if(r==0)
                {
                    c++;
                    dir=-1;
                    
                }
                else
                {
                    r--;
                    c++;
                }
            }
            else
            {
                if(r==m-1)
                {
                    c++;
                    dir=1;
                }
                else if(c==0)       //If direction is downwards we do row and col operaions opposite to what we have 
                {
                    r++;
                    dir=1;
                    
                }
                else
                {
                    c--;
                    r++;
                }
            }
            i++;
        }
        
        return output;
    }
}