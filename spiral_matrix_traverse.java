// Time Complexity : O(m*n) 2D matrix elements are being traversed
// Space Complexity : O(1): if result array is not considered OR
				//S: O(m*n)): if result array considered 
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// take a sprial path containing two pointers. One from left to right to traverse horizontally back/forth and one from top to bottom to traverse vertically up/down.

// Your code here along with comments explaining your approach: Same as class


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        //left---->right
        //top
        //|
        //|
        //~~
        //bottom
        
        if(matrix == null || matrix.length == 0)
            return new ArrayList<>();
        
        List<Integer> result = new ArrayList<>();
        
        int m = matrix.length, n = matrix[0].length;
        int top = 0, bottom = m-1, left = 0, right = n-1;
        
        while(top <= bottom && left <= right){
            
            //left--->right
            for(int cursor = left; cursor <= right; cursor++){
                result.add(matrix[top][cursor]);
            }
            top++;
            
            //top---->bottom down
            for(int cursor = top; cursor <= bottom; cursor++){
                result.add(matrix[cursor][right]);
            }
            right--;
            
            //right---->left
            if(top <= bottom){
                for(int cursor = right; cursor>=left; cursor--){
                    result.add(matrix[bottom][cursor]);
                }
            }
            bottom--;
            
            //bottom---->top
            if(left <= right){
                for(int cursor = bottom; cursor >= top; cursor--){
                    result.add(matrix[cursor][left]); 
                }
            }
            left++;
                       
        }
        
        return result;
    }
}