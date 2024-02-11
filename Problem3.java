import java.util.ArrayList;
import java.util.List;

// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english

/**
 * We are maintaining 4 pointers and moving them to
 * keep track of our traversal space. Keep checking the
 * base condition as we are mutating the base condition
 * from within the loop. We can do this recursively as well.
 */

// Your code here along with comments explaining your approach
public class Problem3 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0; int right = n-1;
        int top = 0; int bottom = m-1;
        List<Integer> res = new ArrayList<>();

        while(left <= right && top <= bottom) {
            //top row
            for(int j = left; j <= right; j++) {
                res.add(matrix[top][j]);
            }
            top++;

            //right col
            for(int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;

            //bottom row
            if(top <= bottom) {
                for(int j = right; j >= left; j--) {
                    res.add(matrix[bottom][j]);
                }
                bottom--;
            }

            //left col
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }

        }

        return res;
    }
}
