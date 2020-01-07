// Time Complexity : O(m*n) where m and n are dimension of the matrix as we traverse each element once
// Space Complexity : O(1) as no auxillary DS used
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : Traverse in spiral order while adding the element to
// the list. Have 4 pointers pointing to top, bottom, left, right. Update these after traversing a row or a 
// column

// Your code here along with comments explaining your approach
import java.util.*;
class spiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        if (m == 0) return ans;
        int n = matrix[0].length;
        int top = 0, bottom = m-1;
        int left = 0, right = n-1;
        while (left <= right && top <= bottom) {
            //traverse right
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;
            //traverse down
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;
            //traverse left
            if (top <= bottom) { // checking again as we alter value of top after traversing right
                for (int i = right; i >= left; i--) {
                ans.add(matrix[bottom][i]);
                }
                bottom--;    
            }
            //traverse up
            if (left <= right) { // checking again as we alter value of right after traversing down
                for (int i = bottom; i >= top; i--) {
                ans.add(matrix[i][left]);
                }
                left++;    
            }
        }
        return ans;
    }
    public static void main(String[] args) {
    	int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    	List<Integer> ans = spiralOrder(matrix);
    	for (int i : ans) {
    		System.out.print(i + " ");
    	}
    }
}