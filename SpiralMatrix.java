// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

public class SpiralMatrix {
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> list = new ArrayList<>();
            int m = matrix.length, n = matrix[0].length;
            int top = 0, bottom = m-1, left = 0, right = n-1;

            while(top <= bottom && left <= right){

                //right
                for(int i = left; i <= right; i++){
                    list.add(matrix[top][i]);
                }
                top++;

                //down
                if(top <= bottom && left <= right){
                    for(int i = top; i <= bottom; i++){
                        list.add(matrix[i][right]);
                    }
                    right--;
                }

                //left
                if(top <= bottom && left <= right){
                    for(int i = right; i >= left; i--){
                        list.add(matrix[bottom][i]);
                    }
                    bottom--;
                }

                //up
                if(top <= bottom && left <= right){
                    for(int i = bottom; i >= top; i--){
                        list.add(matrix[i][left]);
                    }
                    left++;
                }
            }
            return list;
        }
    }
}
