// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.*;

class spiralTraversalSolution {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        
        ArrayList<Integer> spiralTraversal = new ArrayList<>();
        
        while(left <= right && top <= bottom) {
           
            for (int i = left; i <= right; i++) {
                spiralTraversal.add(matrix[top][i]);
            }
            top++;
            
            for (int i = top; i <= bottom; i++) {
                spiralTraversal.add(matrix[i][right]);
            }
            right--;
            
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    spiralTraversal.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    spiralTraversal.add(matrix[i][left]);
                }
                left++; 
            }
            
        }
        return spiralTraversal;
        
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        List<Integer> result = new ArrayList<>();
        result = spiralOrder(matrix);
        System.out.print(result);
    }
}
