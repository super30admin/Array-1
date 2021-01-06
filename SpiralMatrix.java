// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Unable to get logic for matrix where m != n

// Notes : Move along the edges of the matrix defined by 4 pointers, left, right, top and bottom, and increment them once data is parsed.

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        
        if(matrix == null || matrix.length == 0) return list;
        
        int top = 0; 
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        
        while(top <= bottom && left <= right ){
            //move from left to right, keeping top row constant
            for(int j = left; j <= right; j++){
                list.add(matrix[top][j]);
            }
            top = top + 1;
            
            //move from top to bottom, keeping right row constant
            if(left <= right ){
                for(int i = top; i <= bottom; i++){
                    list.add(matrix[i][right]);
                }
                right = right - 1;
            }
            
            //move from right to left, keeping bottom row constant
            if(top <= bottom){
                for(int j = right; j >= left; j--){
                    list.add(matrix[bottom][j]);
                }
                bottom = bottom - 1;
            }
            
            //move from bottom to top, keeping left row constant
            if(left <= right  ){
                for(int i = bottom; i >= top; i--){
                    list.add(matrix[i][left]);
                }
                left = left + 1;
            }
        }
        
        return list;
    }
}
