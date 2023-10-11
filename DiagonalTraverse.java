// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

public class DiagonalTraverse {
    class Solution {
        public int[] findDiagonalOrder(int[][] mat) {
            int m = mat.length;
            int n = mat[0].length;
            int result[] = new int[m * n];
            int idx = 0;
            boolean dir = true;
            int i = 0, j = 0;

            while(idx < (m * n)){
                result[idx] = mat[i][j];
                idx++;

                if(dir){
                    if(j == n-1){
                        i++;
                        dir = false;
                    }
                    else if(i == 0){
                        j++;
                        dir = false;
                    }
                    else{
                        i--;
                        j++;
                    }
                }
                else{
                    if(i == m-1){
                        j++;
                        dir = true;
                    }
                    else if(j == 0){
                        i++;
                        dir = true;
                    }
                    else{
                        i++;
                        j--;
                    }
                }
            }
            return result;
        }
    }
}
