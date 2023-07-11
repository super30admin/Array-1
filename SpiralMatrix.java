// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int length = m * n ;

        List<Integer> result = new ArrayList<>(length);
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length -1 ;

        while(top <= bottom && left <= right)
        {
            for(int i = left; i <= right; i++) // travel from left to right in a row
            {
                result.add(matrix[top][i]);
            }
            top++;

            for(int i = top; i <= bottom; i++)  // travel from top to bottom in the column
            {
                result.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom) {
                for (int i = right; i >= left; i--)  // travel from right to left in the row
                {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right) {
                for (int i = bottom; i >= top; i--)  // travel from bottom to top in the column
                {
                    result.add(matrix[i][left]);
                }
                left++;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }
}
