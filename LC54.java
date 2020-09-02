// Time Complexity : O(M*N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        //if matrix is empty, return empty array list
        if(matrix.length == 0 || matrix == null || matrix[0].length == 0){
            return new ArrayList<Integer>();
        }
        
        //length of matrix
        int n = matrix.length;
        //width of matrix
        int m = matrix[0].length;
        
        //initialize new array list
        ArrayList<Integer> output = new ArrayList<Integer>();
        
        //initialize the pointers
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;
        
        //We traverse through the matrix in a spiral order and keep adding every element to the output array list
        //we will exit the while loop in case top and left exceed bottom and right which would be array out of bounds 
        while(top <= bottom && left <= right){
            //Left -> Right
            for(int i = left; i <= right; i++){
                output.add(matrix[top][i]);
            }
            //increment the row because we are done adding the elements of this row
            top += 1;
            
            //Last column, Top -> bottom
            for(int i = top; i <= bottom; i++){
                output.add(matrix[i][right]);
            }
            //decrease the right pointer by 1
            right -= 1;
            
            //This condtion is for the edge case so that we dont end up adding duplicate elements. We add elements only when top >= bottom, else we have already added those elements and we wont enter this loop
            if(top <= bottom){
                //Right -> Left
                for(int i = right; i >= left; i--){
                    output.add(matrix[bottom][i]);
                }
                //decrease the bottom pointer
                bottom -= 1;
            }
            
            //Same check as the previous one
            if(left <= right){
                //Bottom -> Top
                for(int i = bottom; i >= top; i--){
                    output.add(matrix[i][left]);
                }
                //increase the left pointer by 1
                left += 1;
            }
        }
        //Finally when we break out of the while loop, return the output array list
        return output;
    }
}