// Time Complexity : O(m * n)
// Space Complexity : O(M*N)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
You maintain four boundaries (top, bottom, left, right) and traverse the matrix layer by layer.
In each loop, you move right → down → left → up, shrinking the boundaries after each direction.
You repeat this until all boundaries cross, ensuring every element is added exactly once in spiral order.
 */


import java.util.ArrayList;
import java.util.List;

public class Problem3 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0;
        int top = 0;
        int right = n-1;
        int bottom = m - 1;

        while(left <= right && top <= bottom) {
            for(int i = left;i<=right;i++) {
                res.add(matrix[top][i]);
            }
            top++;
            
            for(int i = top;i<=bottom;i++) {
                res.add(matrix[i][right]);
            }

            right--;

            if(top <= bottom) {
                for(int i = right;i>=left;i--) {
                    res.add(matrix[bottom][i]);
                }

                bottom--;
            }

            if(left <= right) {
                for(int i = bottom;i>=top;i--) {
                    res.add(matrix[i][left]);
                }

                left++;
            }
        }
        return res;
    }
}
