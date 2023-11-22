//T.C O(m*n)
//S.C O(1)
// Did this code successfully run on Leetcode : yes https://leetcode.com/problems/spiral-matrix/description/
// Any problem you faced while coding this : -
/*
Given an m x n matrix, return all elements of the matrix in spiral order.
Mark directions as top, bottom, left, right to derive the indexes of next number in matrix
Double check on variables is necessary as they are modified within the conditional block
 */
import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
    public List<Integer> spiralOrder(int[][] matrix) {
        //null chk

        List<Integer> res = new ArrayList<>();

        int m = matrix.length, n = matrix[0].length;
        int top = 0, left = 0;
        int bottom = m-1, right = n-1;

        while(top<=bottom) {
            if(top<=bottom && left<=right) {
                for (int i = left; i <= right; i++)
                    res.add(matrix[top][i]);
                top++;
            }

            if(left<=right) {
                for (int i = top; i <= bottom; i++)
                    res.add(matrix[i][right]);
                right--;
            }
            if(top<=bottom) {
                for (int i = right; i >= left; i--)
                    res.add(matrix[bottom][i]);
                bottom--;
            }
            if(left<=right) {
                for (int i = bottom; i >= top; i--)
                    res.add(matrix[i][left]);
                left++;
            }
        }
        return res;
    }
}
