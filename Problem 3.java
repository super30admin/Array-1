// Time Complexity :O(row * col)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
        // we will have 4 pointers

        // top and bottom for keeping track of rows

        // left and right for keeping track of column
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {



        int m = matrix.length; // row length
        int n = matrix[0].length; // column length
        
        List<Integer> result = new ArrayList<Integer>();

        int top = 0;
        int bottom = m -1;
        int left = 0;
        int right = n-1;

        while(left<=right && top <=bottom){

            // print top rows
            // from left to right
            for(int r= left; r<=right;  r++){
                result.add(matrix[top][r]);
            }

            //print last right column
            // right to bottom
            
            for(int row = top+1; row <=bottom;row++){
                result.add(matrix[row][right]);
            }

            // Print last row reverse
            // bottom end to bottom start
            
            if(bottom != top)  // since the top row has already printed, if we print again for bottom, then it would be duplicare which would happen only when bottom equal top
            for(int rev = right-1; rev>=left;rev--){
                result.add(matrix[bottom][rev]);
            }
            //print first colum reverse
            // from bottom to top
            if(left != right)// if left == right, then this column would already been printed on the (//print last right column), in this case bottom would also be //pointing to the same column and hence a duplicate could occur
            for(int bot = bottom-1; bot >top;bot--){
                result.add(matrix[bot][left]);
            }

            left++;top++;right--;bottom--;
        }

        return result;        
    }
}