// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
We need to traverse the matrix in upward and downward direction. for travesing upward we will decrement row & increment column. Also, we will keep in mind where the dircetion of traversal changes. So, the direction changes from upward to downward at last column and first row==0. Also, we will find the same thig in case of downward traversal. 

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat==null || mat.length==0)
            return new int[]{};
        int n = mat.length;
        int m = mat[0].length;
        int dir = 1;
        int [] result = new int[m*n];
        int index = 0;
        int r = 0;
        int c = 0;
        while(index<m*n){
            result[index] = mat[r][c];
            index++;
            if(dir == 1){
                if(c==m-1){
                    dir = -1;
                    r++;
                }
                else if(r==0){
                    dir = -1;
                    c++;
                }
                else{
                    r--;
                    c++;
                }
            }
            else{
                if(r==n-1){
                    dir = 1;
                    c++;
                }
                else if(c==0){
                    dir = 1;
                    r++;
                }
                else{
                    r++;
                    c--;
                }
            }
        }
        return result;
    }
}