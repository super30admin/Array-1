import java.util.ArrayList;
import java.util.List;
// Time Complexity : O(MN)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/*
we are looping through boundaries and have four boundaries top, bottom, left, right
after each boundary it is shrinked and we check for base case
 */
// Your code here along with comments explaining your approach

public class SpiralMatrix {
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> result = new ArrayList<>();
            if(matrix == null || matrix.length == 0) return result;
            int m = matrix.length;
            int n = matrix[0].length;
            int top = 0;
            int bottom = matrix.length-1;
            int left = 0;
            int right = matrix[0].length-1;
            while(top <= bottom && left <= right) {
                //top
                for(int j = left; j <= right; j++) {
                    result.add(matrix[top][j]);
                }
                top++;
                //right
                if(top <= bottom && left <= right){

                }
                else {
                    break;
                }
                for(int j = top; j <= bottom; j++) {
                    result.add(matrix[j][right]);
                }
                right--;
                //bottom
                if(top <= bottom && left <= right){
                }

                else {
                    break;
                }
                for(int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--;
                //left
                if(top <= bottom && left <= right){
                }

                else {
                    break;
                }
                for(int j = bottom; j >= top; j--) {
                    result.add(matrix[j][left]);
                }
                left++;
                if(top <= bottom && left <= right){
                }

                else {
                    break;
                }
            }
            return result;
        }
    }
}
