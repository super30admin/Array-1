// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        // directions 0,1,2,3 will be used to denote right, down, left, up
        int dir = 0; // initially we move right
        
        List<Integer> result = new ArrayList<>();
        
        int row_start = 0;
        int row_end = matrix.length - 1;
        int col_start = 0;
        int col_end = matrix[0].length - 1;
        
        while(result.size() < matrix.length * matrix[0].length) {
            
            // process dir 0
            if (dir == 0) {
                int a = col_start;
                
                while (a <= col_end && result.size() < matrix.length * matrix[0].length) {
                    result.add(matrix[row_start][a]);
                    
                    a++;
                }
                
                row_start++;
                
                dir = 1;
            }
            
            // process dir 1
            if (dir == 1) {
                int a = row_start;
                
                while (a <= row_end && result.size() < matrix.length * matrix[0].length) {
                    result.add(matrix[a][col_end]);
                    
                    a++;
                }
                
                col_end--;
                
                dir = 2;
            }
            
            // process dir 2
            if (dir == 2) {
                int a = col_end;
                
                while (a >= col_start && result.size() < matrix.length * matrix[0].length) {
                    result.add(matrix[row_end][a]);
                    
                    a--;
                }
                
                row_end--;
                
                dir = 3;
            }
            
            // process dir 3
            if (dir == 3) {
                int a = row_end;
                
                while (a >= row_start && result.size() < matrix.length * matrix[0].length) {
                    result.add(matrix[a][col_start]);
                    
                    a--;
                }
                
                col_start++;
                
                dir = 0;
            }
        }
        
        return result;
    }
}