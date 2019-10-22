/*
Author: Akhilesh Borgaonkar
Problem: LC 54. Spiral Matrix (Array-1)
Approach: Finding the edge cases in the matrix with the help of 4 pointers left, right, top and bottom. Everytime a row/col is traversed,
	I reduce the lookup of matrix for further manipulation by omitting a row/column.
Time Complexity: O(m*n) where m & n are number of rows and columns of matrix resp.
Space complexity: O(1)
LC verified
*/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> output = new ArrayList<>();
        if(matrix == null || matrix.length == 0)
            return output;
        
        int r = matrix.length, c = matrix[0].length;
        int left = 0, right = c-1, top = 0, bottom = r-1;
        
        while(top <= bottom && left <= right){				//recursively traversing till top overpasses bottom pointer
            for(int i = left; i <= right; i++)				//traversing left to right
                output.add(matrix[top][i]);
            top++;
                
            if(top <= bottom){
                for(int i = top; i <= bottom; i++){			//traversing top to bottom
                    output.add(matrix[i][right]);
                }
                right--;
                
                if(left <= right){
                    for(int i=right; i>=left; i--)			//traversing right to left
                        output.add(matrix[bottom][i]);
                    bottom--;

                    for(int i=bottom; i>=top; i--)			//traversing bottom to top
                        output.add(matrix[i][left]);
                    left++;
                }
            }
        }
        return output;
    }
}