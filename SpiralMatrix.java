
// Time Complexity : O(M * N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    static List<Integer> result = new ArrayList<>();
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {

        if(matrix == null || matrix.length == 0)
            return new ArrayList<>();

        List<Integer> result = new ArrayList<>();

        int top=0, bottom=matrix.length-1;
        int left=0, right=matrix[0].length-1;

        int totalSize = matrix.length * matrix[0].length;

        while(totalSize > result.size()){
            //Top Elements - (Left to Right)
            for(int i=left; i<=right && top<=bottom; i++){
                result.add(matrix[top][i]);
            }
            top++;

            //Right Elements - (Top to Bottom)
            for(int i=top; i<=bottom && left<=right; i++){
                result.add(matrix[i][right]);
            }
            right--;

            //Bottom Elements - (Right to Left)
            for(int i=right; i>=left && top <= bottom; i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;

            //Left Elements  - (Bottom to Top)
            for(int i=bottom; i>=top && left <= right; i--){
                result.add(matrix[i][left]);
            }
            left++;

        }

        return result;
    }

}
