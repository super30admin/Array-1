//TC:O(m*n)
//SC:O(1)
//## Problem 3
//        Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
//
//        Example 1:
//
//        Input:
//
//        [
//
//        [ 1, 2, 3 ],
//
//        [ 4, 5, 6 ],
//
//        [ 7, 8, 9 ]
//
//        ]
//        Output: [1,2,3,6,9,8,7,4,5]
//        Example 2:
//
//        Input:
//
//        [
//
//        [1, 2, 3, 4],
//
//        [5, 6, 7, 8],
//
//        [9,10,11,12]
//
//        ]
//        Output: [1,2,3,4,8,12,11,10,9,5,6,7]
import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
    public List<Integer> spiralOrder(int[][] matrix) {
        //null check
        List<Integer> result = new ArrayList<>();
        int top = 0, left = 0, m = matrix.length, n = matrix[0].length;
        int bottom = m-1, right = n-1;
        while(top <= bottom && left<= right){
            if(top <= bottom && left<= right){
                for(int i = left; i <= right; i++){
                    result.add(matrix[top][i]);
                }
                top++;
            }
            if(top <= bottom && left<= right){
                for(int i = top; i <= bottom; i++){
                    result.add(matrix[i][right]);
                }
                right--;
            }
            if(top <= bottom && left<= right){
                for(int i = right; i >=left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(top <= bottom && left<= right){
                for(int i = bottom; i >= top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}
