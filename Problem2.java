Time Complexity: O(mn)
Space Complexity: Constant
Ran successfully on leetcode?: yes

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        if(matrix.length == 0)return new int[0];
        int m = matrix.length, n = matrix[0].length;
        int i = 0, j = 0, k = 0;
        int dir = 1;
        int[] output = new int[m*n];
        
        while(k < m*n){
            
            if(dir == 1){
                
                while(i >= 0 && j < n){
                    output[k] = matrix[i][j];
                    k++;
                    --i; ++j;
                }
                
                if(i < 0 && j >= n) {
                	i = 1;
                	j = n - 1;
                }else if(i < 0){
                    i = 0;
                }else{
                    i = i + 2;
                    j = j - 1;
                }
                
                dir = -1;
            } else {
                while(i < m && j >= 0){
                    output[k] = matrix[i][j];
                    k++;
                    ++i; --j;
                }
                
                if(i >= m && j < 0) {
                	i = m - 1;
                	j = 1;
                }else if(j < 0) {
                	j = 0;
                }else {
                	i = i - 1;
                	j = j + 2;
                }
                
                dir = 1;
            }
            
        }
        
        return output;
    }
}
