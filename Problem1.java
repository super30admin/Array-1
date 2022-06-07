// Time Complexity : O (m * n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Three line explanation of solution in plain english:
/* Traverse a 2D matrix diagonally by maintaining two pointers for row and column.
 Use a variable to keep track of direction of tranversal - up and down
Store the results of the traversal in an array and handle edge cases carefully
 */

//Problem statement: https://leetcode.com/problems/diagonal-traverse/

class Problem1 {
        public int[] findDiagonalOrder(int[][] mat) {

            if (mat == null || mat.length == 0) {
                return new int[0];
            }

            int m = mat.length;
            int n = mat[0].length;
            int[] res = new int[m*n];
            int i = 0;
            int j = 0;
            int idx = 0;
            int dir = 1;
            //res[0] = mat[0][0];

            while(idx < m * n){

                res[idx] = mat[i][j];
                idx++;

                if(dir == 1){
                    if(i == 0 && j!=n-1){
                        j++;
                        dir = -1;
                    }
                    else if(j == n-1){
                        i++;
                        dir = -1;
                    }else{
                        i--;
                        j++;
                    }
                }
                else if(dir == -1){
                    if(j==0 && i!=m-1){
                        i++;
                        dir = 1;
                    }else if(i == m-1){
                        j++;
                        dir = 1;
                    }else{
                        i++;
                        j--;
                    }
                }
            }
            return res;
        }
}