// Time Complexity : O(MN)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/*
we Have two directions +1 and -1, which are just flags to monitor if we have to go
up or down. Then we are handling the edge cases and directions change in both as we traverse each diagonals and storing
the result in an array.
 */
// Your code here along with comments explaining your approach
public class Diagonal {
        public int[] findDiagonalOrder(int[][] matrix) {
            //base
            int m = matrix.length; int n = matrix[0].length;
            int result[] = new int[m*n];
            int k = 0;
            int dir=1;
            int i=0; int j=0;
            while(k < result.length) {
                result[k] = matrix[i][j];
                k++;
                //next i and j matrix
                if(dir == 1) {
                    if( j == n-1) {
                        i++; dir = -1;
                    } else if(i == 0) {
                        j++; dir = -1;
                    } else {
                        i--; j++;
                    }
                }
                else {
                    if( i == m-1) {
                        j++; dir = 1;
                    } else if(j == 0) {
                        i++; dir = 1;
                    } else {
                        j--; i++;
                    }
                }
            }
            return result;
        }
}
