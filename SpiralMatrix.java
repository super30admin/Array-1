import java.util.ArrayList;
import java.util.List;

// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// need to loop over entire m*n array and add it to a list starting at m[0] and then left side, bottom, right,
// top and repeat the process

// Your code here along with comments explaining your approach

public class SpiralMatrix {

    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> nums = new ArrayList<>();
            if (matrix.length == 0 || matrix == null) return nums;

            int top = 0; //top row
            int bottom = matrix.length - 1; // bottom row
            int left = 0; //left most column
            int right = matrix[0].length - 1; //right most column
            int size = matrix.length * matrix[0].length;

            while (nums.size() < size) {
                //add top row to nums
                for (int i = left; i <= right && nums.size() < size; i++) {
                    nums.add(matrix[top][i]);
                }
                top++; // increment counter to move to next row
                //add right most column
                for (int i = top; i <= bottom && nums.size() < size; i++) {
                    nums.add(matrix[i][right]);
                }
                //move the right pointer one to the left
                right--;
                //traverse from left to right at bottom
                for (int i = right; i >= left & nums.size() < size; i--) {
                    nums.add(matrix[bottom][i]);
                }
                //move bottom row up
                bottom--;
                //add bottom row
                for (int i = bottom; i >= top && nums.size() < size; i--) {
                    nums.add(matrix[i][left]);
                }
                //sift left to right
                left++;
            }
            return nums;
        }
    }
}
