/**Leetcode Question - 498 - Diagonal Traverse */
/**Algorithm
 * Change of direction happens when either i or j hits the roof
 * Change of direction conditions:
 *      1. When either i == m-1 or j == n-1 --> Reamin the same row, move to the next column || Remain in the same column, move to the next row
 *      2. When either i == 0 || j == 0 --> Move to the next column || Move to the next row
 */
public class DiagonalArray {
    class Solution {
        public int[] findDiagonalOrder(int[][] matrix) {
            if(matrix == null || matrix.length == 0){
                return new int[] {};
            }
            int dir =1; // set to upwards direction (-1 means downwards)
            int index =0;
            int m = matrix.length;
            int n = matrix[0].length;
            int[] result = new int[m*n];
            int i = 0, j=0;
            while(index < m*n){
                result[index] = matrix[i][j];
                if(dir == 1){
                    if(j== n-1){
                        i++;
                        dir = -1;
                    }
                    else if(i ==0){
                        j++;
                        dir = -1;
                    }
                    else{
                        i--;
                        j++;
                    }
                }
                else{
                    if(i == m-1){
                        j++;
                        dir = 1;
                    }
                    else if(j==0){
                        i++;
                        dir = 1;
                    }
                    else{
                        i++;
                        j--;
                    }
                }
                index++;
            }
            return result;
        }
    }
}
