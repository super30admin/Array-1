// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:
//	1. Keep pointers top, bottom, left, right at 4 edges of matrix
//	2. Iterate matrix with help of these pointers.
//  3. When respective pointers overlap, matrix has been traversed spirally.

import java.util.ArrayList;
import java.util.List;

class SpiralArray {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return new ArrayList();
        List<Integer> answer = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        
        while(left <= right && top <= bottom){
            for(int i = left; i <= right; i++){
                answer.add(matrix[top][i]);
            }
            top++;
            
            for(int i = top; i <= bottom; i++){
                answer.add(matrix[i][right]);
            }
            right--;
            
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    answer.add(matrix[bottom][i]);
                }
            bottom--;
            }
            
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    answer.add(matrix[i][left]);
                }
            left++;
            }
        }
        return answer;
    }
}