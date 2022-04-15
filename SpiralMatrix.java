import java.util.ArrayList;
import java.util.List;
// Time Complexity :O(M*N)
// Space Complexity :O(1) no extra space
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Taking 4 pointers top, bottom, left, right
//1st go from left to right in top row then increment top
//Then go from top to bottom in right column then decrement right
//Then go from right to left in bottom row then decrement bottom
//Then go bottom to top in left column then increment left

// Your code here along with comments explaining your approach
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        if(matrix.length == 0 || matrix == null){
            return new ArrayList<>();
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        List<Integer> answer = new ArrayList<>();

        while(top <= bottom && left <= right){

            // left to right
            for(int i = left; i <= right; i++){
                answer.add(matrix[top][i]);
            }
            top++;

            //top to bottom
            if(top <= bottom && left <= right){
                for(int i = top; i <= bottom; i++){
                    answer.add(matrix[i][right]);
                }
            }
            right--;

            // right to left
            if(top <= bottom && left <= right){
                for(int i = right; i >= left; i--){
                    answer.add(matrix[bottom][i]);
                }
            }
            bottom--;


            //bottom to top
            if(top <= bottom && left <= right){
                for(int i = bottom; i >= top; i--){
                    answer.add(matrix[i][left]);
                }
            }
            left++;

        }

        return answer;

    }
}
