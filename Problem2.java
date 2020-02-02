/* Diagonal Traverse- Return elements in diagonal order */

// Time Complexity : O(mn) where m is number of rows and n is number of columns 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//we will choose direction flag as 1 if we are moving up and -1(moving down)
//1. if we overshoot the array from the last column, change direction and increase row
//2. if we overshoot the array from first column, then change direction and increase column
//3. else(if we are not overshooting), increase column by 1 and decrease row by 1.
//we will repeat above algo(with changes) for dir=-1

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        //Edge case
        if(matrix == null || matrix.length == 0) return new int[]{};
        int m = matrix.length;
        int n = matrix[0].length;
        int[] result =  new int[m*n];
        //[0,0,0,0,0,0,0,0,0]
        int i = 0;
        int r = 0;
        int c = 0;
        //upward direction
        int dir = 1;
        while(i < m*n){
            result[i] = matrix[r][c];
            //Case1) if we have upward direction
            if(dir == 1){
                //if we overshoots array from last column, change direction(-1) and increment row
                if(c == n-1){
                    r++;
                    dir = -1;
                } else if(r == 0){
                    c++;
                    dir = -1;
                } else {
                    r--;
                    c++;
                }
            } 
            //Case2) if we have downward direction
            else {
                //if we overshoots array from last row, change direction(1) and increment column
                if(r == m-1){
                    c++;
                    dir = 1;
                } else if(c == 0){
                    r++;
                    dir = 1;
                } else {
                    r++;
                    c--;
                }
            }
            i++;
        }
        return result;
    }
}