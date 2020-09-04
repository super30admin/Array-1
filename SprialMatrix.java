// Time Complexity : o(n*m) where n is the no:of rows and m is the no:of columns of the matrix
// Space Complexity : o(1) 
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
    /* Traverse all the elemnts of the matrix. Initialze pointers top and bottom, left and right to track the direction of traversal.
    Start from top : traverse left to right and increment top. 
    On reaching right : traverse top to bottom and decrement right.
    On reaching bottom: traverse right to left and decrement bottom.
    On reaching left: traverse bottom to top and increment left.
*/
// Your code here along with comments explaining your approach




class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length ==0){
            return new ArrayList<>();
        }
        
        List<Integer> result = new ArrayList<Integer>();
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        int left = 0;
        int right = m-1;
        int top = 0;
        int bottom = n-1;
        
        while(left<=right && top<=bottom){
            //Strat from top row: go left to right and increment top by 1
            for(int x= left;x<=right;x++){
                result.add(matrix[top][x]);
            }
            top++;
            
            //once we reach right, go from top to bottom and decrement right by 1
            for(int y = top; y<=bottom; y++){
                result.add(matrix[y][right]);
            }
            right--;
            
            //now when we reach bottom, we go from right to left and decrement bottom by 1
            if(top<=bottom){ //For the edge case so that we don't repeat any element
                for( int x = right; x>=left;x--){
                result.add(matrix[bottom][x]);
                }
                bottom--;
                
            }

            
            //when we reach left, we go from bottom to top and increment left by 1
            if(left<=right){
                for( int y = bottom; y>=top;y--){ //For the edge case so that we don't repeat any element
                result.add(matrix[y][left]);
                }
                left++;
            }

        }
        return result;
    }
}