//time complexity: O(m*n)
//space complexity: O(1)
//Did it run successfully on leetcode: YES

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        int top = 0, left = 0;
        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;
        
        while(top <= bottom && left <= right) {
            //left to right
            for(int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            //top to bottom
            for(int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }   
            right--;
            
            if(top <= bottom) {
                //right to left
                for(int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            if(left <= right) {
                 //bottom to top
                for(int i = bottom; i >= top; i-- ) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
           
        }
        return result;
    }
}