// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0 ){
            return new int[]{};
        }
        int i = 0, j = 0, index = 0, dir = 1;
        int m = matrix.length;
        int n = matrix[0].length;
        int[] output = new int[m*n];
        while(index < m*n){
            output[index] = matrix[i][j];
            if(dir == 1){
                if(j == n-1){
                    i++;
                    dir = -1;
                }
                else if(i == 0){
                    j++;
                    dir = -1;
                }else{
                    i--;
                    j++;
                }
                
            }else{
                if(i == m-1){
                    j++;
                    dir = 1;
                }
                else if(j == 0){
                    i++;
                    dir = 1;
                }else{
                    i++;
                    j--;
                }
                
            }
            index++;
        }
        return output;
        
    }
}
