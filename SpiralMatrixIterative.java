// Time Complexity : Asymtotic complexity is O(M*N) where m is the number of rows and n is the number of columns, since this is a traversal Problem 
// Space Complexity : O(1) Since we are not using any Auxillary data Structure
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach

import java.util.*;
class SpiralMatrixIterative {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return new ArrayList<>(); //edge case if matrix is empty
        int m = matrix.length;  //row
        int n = matrix[0].length; //column
        List<Integer> disp = new ArrayList<>();
        int top = 0;
        int bottom = m-1;
        int right = n-1;
        int left = 0;
        while(top <= bottom && right >= left)  //Check for edge cases to avoid index out of bound error
        {
            //go right
            for(int i = left; i <= right; i++ )
            {
                disp.add(matrix[top][i]);
            }
            top++;
            
            
            //go down
            for(int i = top; i <= bottom; i++)
            {
                disp.add(matrix[i][right]);
            }
            right--;
            
            
            if(top <= bottom) {
            //go left
            for(int i = right; i >= left; i--)
            {
                disp.add(matrix[bottom][i]);
            }
            bottom--;
            }
            
            if(left <= right){
            //go up
            for (int i = bottom; i >= top; i--)
            {
                disp.add(matrix[i][left]);
            }
            left++;
            }
        }
        return disp;
    }
}

//Main class

class Main
{
    public static void main(String[] args)
    {
    SpiralMatrixIterative obj = new SpiralMatrixIterative();
    int[][] input = {
                        { 1, 2, 3 },
                        { 4, 5, 6 },
                        { 7, 8, 9 }
                    };
    List<Integer> result = new ArrayList<>();
    result = obj.spiralOrder(input);
    System.out.print("Clockwise Spiral Order of the given input array " + Arrays.deepToString(input) + " is " + result + "\n");
    }
}