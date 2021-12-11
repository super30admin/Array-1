import java.util.ArrayList;
import java.util.List;

// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes


public class SpiralTraversal {

    public List <Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length ==0){
            return new ArrayList <>();
        }

        int m = matrix.length;
        int n = matrix[0].length;

        // Taking four variables to keep track of the four direction traversal
        int top =0;
        int bottom = m - 1;
        int left = 0;
        int right = n-1;
        List<Integer> ans = new ArrayList<> ();

        // Add check so that the pointers donot cross each other and we end up adding duplicate elements
        while(top <=bottom && left <=right) {
            // Traverse left to right
            for(int i = left ; i<=right; i++) {
                ans.add(matrix[top][i]);
            }
            top++; // as we have traversed the row at top

            // Traverse from top to bottom - because we want to make a spiral
            for(int i = top; i<=bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--; // move towards left direction, because we traversed the right column elements in above for loop

            if(top <=bottom) {  // Since we changed the top in line 32, we need to check it back again if it didn't break the condition
                // traverse right to left
                for(int i = right; i>=left; i--) {
                    ans.add(matrix[bottom][i]);
                }
            }
            bottom--; // move towards top direction, because we traversed the bottom row elements in above for loop

            if(left<=right) {  // Since we changed the right in line 38, we need to check it back again if it didn't break the condition
                // traverse from bottom to top
                for(int i = bottom; i>=top; i--) {
                    ans.add(matrix[i][left]);
                }
            }
            left++; // move toward the right direction
        }
        return ans;
    }
}

