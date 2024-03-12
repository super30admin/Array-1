// Time Complexity : O(n * m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// we've taken 2 variables to traverse thru the matrix and we've a direction flag 
//to indicate if we're going in the urward or downward direction 

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int i =0, j = 0;
        boolean dir = true;
        int[] result = new int[m*n];
        for(int idx = 0; idx < m*n; idx++){
            result[idx] = mat[i][j];
            if(dir){
                //up
                if(j == n-1){
                    i++;
                    dir = false;
                }else if(i == 0){
                    j++;
                    dir = false;
                }else{
                    i--;
                    j++;
                }
            }else{
            //down
            if(i == m-1){
                j++;
                dir = true;
            }else if(j == 0){
                i++;
                dir = true;
            }else{
                i++;
                j--;
            }
        }
        }
        return result;
    }
}