package Array1;

// Time Complexity : O(M*N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        int top = 0, right = n, bottom = m, left = 0;

        while( left<=right && top <= bottom ){
            //top
            for(int j=left;j<=right;j++){
                ans.add(matrix[top][j]);
            }
            top++;
            //right
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;
            //bottom
            if(top<=bottom){
                for(int j=right;j>=left;j--){
                    ans.add(matrix[bottom][j]);
                }
            }

            bottom--;
            //left
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
            }
            left++;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new SpiralOrder().spiralOrder(new int[][]{{1,2,3}, {4,5,6}, {7,8,9}}));
    }
}
