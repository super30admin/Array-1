// Time Complexity : O(m*n) - m : length of column , n: length of row
// Space Complexity : O(1) - Used one list to return which is not consider
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

/*
 * Given a matrix of m x n elements (m rows, n columns), return all elements of
 * the matrix in spiral order.
 * 
 * Example 1:
 * 
 * Input:
 * 
 * [
 * 
 * [ 1, 2, 3 ],
 * 
 * [ 4, 5, 6 ],
 * 
 * [ 7, 8, 9 ]
 * 
 * ] Output: [1,2,3,6,9,8,7,4,5] Example 2:
 * 
 * Input:
 * 
 * [
 * 
 * [1, 2, 3, 4],
 * 
 * [5, 6, 7, 8],
 * 
 * [9,10,11,12]
 * 
 * ] Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 */

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return new ArrayList<Integer>();
        }
        
        int n = matrix.length; int m = matrix[0].length;
        int left = 0;
        int right = m -1;
        int top = 0;
        int bottom = n -1;
        
        List<Integer> output = new ArrayList<Integer>();
        while(left<=right && top <= bottom){
            
            for(int i =left;i<=right;i++){
                output.add(matrix[top][i]);
            }
            top+=1;
            
            for(int i = top;i<=bottom;i++){
                output.add(matrix[i][right]); 
            }
            right-=1;
            
            if(top <= bottom){
                for(int i = right;i>=left;i--){
                    output.add(matrix[bottom][i]); 
                }
                bottom-=1;
            }
            
             if(left <= right){
                for(int i =bottom;i>=top;i--){
                    output.add(matrix[i][left]);
                }
                left+=1;
             }
            
        }
        return output;
    }
}