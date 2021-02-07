/**
Time complexity: O(n*m)
Space complexity: O(1)
Execute successfully on Leetcode: Yes
Any problems faced: No
*/

class Solution {
    /**
    Approach:
    - For this problem, the brute force solution itself is the optimal solution as every element in the matrix needs to be traversed.
    - We have 4 pointers: top, left, bottom, right.
    - Initially, top = 0, left = 0, bottom = no. of rows - 1, right = no. of columns - 1
    - 4 steps:
      Top row: left -> right , top++
      Right column: top -> bottom, right--
      Bottom row: right -> left, bottom--
      Left column: bottom -> top, left++
    */    

    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<>();
        }
        List<Integer> output = new ArrayList<>();
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int top = 0; 
        int bottom = m-1;
        int left = 0; 
        int right = n-1;
        
        while(top <= bottom && left <= right) {
            for(int x = left; x <= right; x++) {
                output.add(matrix[top][x]);
            }
            top += 1;
            
            for(int x = top; x <= bottom; x++) {
                output.add(matrix[x][right]);
            }
            right -= 1;
            
            if(top <= bottom && left <= right) {
                for(int x = right; x >= left; x--) {
                    output.add(matrix[bottom][x]);
                }
                bottom -= 1;
                
                for(int x = bottom; x >= top; x--) {
                    output.add(matrix[x][left]);
                }
                left += 1;
            }
        }
        return output;
    }
}
