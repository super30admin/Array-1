// Time Complexity : O(m x n) where m and n are dimensions of given matrix
// Space Complexity : O(1) because no use of extra data structure used apart from output List
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        //null check
        if(matrix.length == 0 || matrix == null) return new ArrayList<Integer>();
        
        List<Integer> result = new ArrayList<>(); //declaring array to store result
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        //setting up variables to use as boundaries
        int top = 0, bottom = m-1; //m-1 gives number of rows
        int left = 0, right = n-1; //n-1 gives number of columns
        
        while( top <= bottom && left <= right ) {
            //top row
            for( int j = left; j <= right; j++ ) {//for each element in the row
                result.add(matrix[top][j]); 
            }
            top++; //move on to the next row

            if( top <= bottom && left <= right ) { //adding while conditions again
                //right col
                for( int i = top; i <= bottom; i++ ) {
                    result.add(matrix[i][right]);
                }
                right--; //pushing boundary in from right side
            }
            
            if( top <= bottom && left <= right ) { //adding while conditions again
                //bottom row
                for( int j = right; j >=left; j--) {
                    result.add(matrix[bottom][j]); 
                }
                bottom--; //pushing boundary up from bottom
            }

            if( top <= bottom && left <= right ) { //adding while conditions again
                //left col
                for( int i = bottom; i >= top; i-- ) {
                    result.add(matrix[i][left]);
                }
                left++; //pushing boundary inside from left side
            }
            
        }
        return result;
    }
}