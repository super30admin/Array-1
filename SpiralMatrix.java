// Time Complexity :O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;
        List<Integer> result = new ArrayList<>();

        while(top <= bottom && left <= right){
            for(int i=left; i<=right; i++){//top row 
                result.add(matrix[top][i]);
            }
            top++;//update top
            for(int i=top; i<=bottom; i++){//right column
                result.add(matrix[i][right]);
            }
            right--;//update right
            if(top <= bottom)
            {
                for(int i=right; i>=left; i--){//bottom row
                    result.add(matrix[bottom][i]);
                }
                bottom--;//update bottom
            }
            if(left <= right)
            {
                for(int i=bottom; i>=top; i--){//left column
                    result.add(matrix[i][left]);
                }
                left++;//update left
            }
        }
        return result;
    }
}

