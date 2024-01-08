/*
* Approach:
*  1. Exploring the walls(top, right, bottom, left) using four pointers.
* 
*  2. update the following pointers based on direction:
        top wall => row-> top
                    col-> left to right

        right wall => row-> top to bottom
                    col-> right
                
        bottom wall => row->bottom
                        col-> right to left
        
        left wall => row-> bottom to top
                    col-> left
* 
*  3. Check the base condition in between walls printing
* 
* 
* Did this code successfully run on Leetcode : YES
* 
* Any problem you faced while coding this : NO
* 
* Time Complexity: O(m*n)
* 
* Space Complexity: O(1)
* 
*/
import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int top = 0, bottom = matrix.length - 1,
                left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int index = left; index <= right; index++)
                result.add(matrix[top][index]);
            top++;

            for (int index = top; index <= bottom; index++)
                result.add(matrix[index][right]);
            right--;

            if (top <= bottom) {
                for (int index = right; index >= left; index--)
                    result.add(matrix[bottom][index]);
                bottom--;
            }

            if (left <= right) {
                for (int index = bottom; index >= top; index--)
                    result.add(matrix[index][left]);
                left++;
            }
        }

        return result;
    }
}
