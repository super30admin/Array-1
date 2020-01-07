// Time Complexity : O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix ==  null || matrix.length == 0){	// base case
            return new int[]{};
        }
        
        int m = matrix.length;		// initialise the start pointers according to the matrix length and direction
        int n = matrix[0].length;
        int [] result = new int[m*n];
        int i =0;
        int r =0;
        int c = 0;
        int dir = 1;
        while(i < m*n){			// to traverse the whole array
            result[i] = matrix[r][c];
            if(dir == 1){		// to traverse the array in the up direction
                if(c == n-1){
                    r++;
                    dir = -1;
                }else if(r==0){
                    c++;
                    dir = -1;
                }else{
                    r--;
                    c++;
                }
            }else{				// to traverse the array in the down direction
                if(r == m-1){
                    c++;
                    dir = 1;
                } else if(c==0){
                    r++;
                    dir = 1;
                }else{
                    c--;
                    r++;
                }
            }
            i++;
        }
        return result;		// return result
    }
}