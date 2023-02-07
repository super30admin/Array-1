// Time Complexity : O(n * m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/* We traverse 2d matrix and maintain 4 pointers left,right,top and bottom to maintain the boundaries. Then we start adding elements to
   result array in a spiral fashion. After each iteration in a direction, we accordgly change our boundaries for next round to add in spiral 
   manner. In the end the spiral traversal is stored in result array and we return it.
*/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0)
            return new ArrayList<>();
        
        int n = matrix.length;
        int m = matrix[0].length;

        int left = 0, right = m - 1, top = 0, bottom = n - 1;

        List<Integer> result = new ArrayList<>();
        
        while(left <= right && top <= bottom) {
            
            for(int i = left; i <= right; ++i)
                result.add(matrix[top][i]);
            top++;

            
            for(int i = top; i <= bottom; ++i)  
                result.add(matrix[i][right]);
            right--;
            

            if(top <= bottom) {
                for(int i = right; i>= left; --i)
                    result.add(matrix[bottom][i]);
                bottom--;
            }

            if(left <= right) {
                for(int i = bottom; i>=top; --i)
                    result.add(matrix[i][left]);
                left++;
            }
        }
        return result;
    }
}