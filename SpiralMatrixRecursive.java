// Time Complexity : Asymtotic complexity is O(M*N) where m is the number of rows and n is the number of columns, since this is a traversal Problem 
// Space Complexity : O(1) Since we are not using any Auxillary data Structure. Here we are not considering the Stack Space used for subroutine calls
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach


import java.util.*;
class SpiralMatrixRecursive {
    List<Integer> disp = new ArrayList<>();
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return new ArrayList<>(); //edge case if matrix is empty
        int m = matrix.length;  //row
        int n = matrix[0].length; //column
        int top = 0;
        int bottom = m-1;
        int right = n-1;
        int left = 0;
        helper(matrix, m, n, top, bottom, right, left);
        return disp;
    }

    private void helper(int[][] matrix, int m, int n, int top, int bottom, int right, int left) {
       //base
        if(top > bottom || right < left) return;  //base case when any of the pointers cross each other
        
        
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
        
        helper(matrix, m, n, top, bottom, right, left);
        }
        }

//Main class

class Main
{
    public static void main(String[] args)
    {
    SpiralMatrixRecursive obj = new SpiralMatrixRecursive();
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