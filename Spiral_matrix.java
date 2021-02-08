class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        /*
            Time complexity: O(n*m)
            Space complexity: O(1)
        */
        
        // create a new array to store the output
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        // rows and columns
        int n = matrix.length;
        int m = matrix[0].length;
        
        // if the matrix is empty
        if (matrix == null || n == 0 || m == 0){
            return arr;
        }
        
        // initialize direction variables
        int left = 0, right = m - 1;
        int top = 0, bottom = n - 1;
        
        // check if any variable is out of bounds
        while(top <= bottom && left <= right){
            // left to right
            for(int i = left; i <= right; i++) {
                arr.add(matrix[top][i]);
            }
            
            top++;
            
            // top to bottom
            for(int i = top ; i <= bottom ; i++) {
                arr.add(matrix[i][right]);
            }
            
            right--;
            
            // check for out of bounds exception
            if(left <= right && top <= bottom) {
                // right to left
                for(int i = right; i >= left; i--) {
                    arr.add(matrix[bottom][i]);
                }
            
                bottom--;
                
                // bottom to top
                for(int i = bottom; i >= top; i--) {
                    arr.add(matrix[i][left]);
                }
                left++;
            }
        
        }
    // return the output array
    return arr; 
    }
}