/**
 * Q. Given a matrix of m x n elements (m rows, n columns), return all elements of
 * the matrix in spiral order.
 * 
 * A. I have used layer by layer approch where, where in every itaration we add the
 * elements from all four sides of the layer to the solution and then move to inner
 * layer.  
 * 
 * Time Complexity - O(n) each element in input array is reached just once
 * Space Complexity - O(n) the solution array is same size as that of input array
 * Runs on Leetcode - Yes  
 */

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        if(matrix.length == 0){
            return new ArrayList<Integer>();
        }
        
        int r = matrix.length;
        int c = matrix[0].length;
        
        int start_x=0, start_y = 0;
        int end_x = r-1, end_y = c-1; 
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        while(true){
            
            //top side elements of layer
            for(int i=start_y; i<=end_y; i++){
                result.add(matrix[start_x][i]);
            }
            
            if(++start_x > end_x) break;
            
            //right side elements of layer
            for(int i=start_x; i<=end_x; i++){
                result.add(matrix[i][end_y]);
            }
            
            if(--end_y<start_y) break;
            
            //bottom side elements of layer
            for(int i=end_y; i>=start_y; i--){
                result.add(matrix[end_x][i]);
            }
            
            if(--end_x<start_x) break;
            
            // left side elements of layer
            for(int i=end_x; i>=start_x; i--){
                result.add(matrix[i][start_y]);
            }
            
            if(++start_y>end_y) break;
        }
        
        return result;
    }
}
