package S30.exercises;

import java.util.ArrayList;
import java.util.List;
// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes


public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> ans = new ArrayList<>();
    int m = matrix.length, n = matrix[0].length;
    int left = 0, top = 0, right = n - 1, bottom = m - 1;
        while(left <= right && top <= bottom){
        for(int j = left; j <= right; j++)
            ans.add(matrix[top][j]);
        top++;
        for(int i = top; i <= bottom; i++)
            ans.add(matrix[i][right]);
        right--;
        if(top <= bottom){
            for(int j = right; j >= left; j--)
                ans.add(matrix[bottom][j]);
            bottom--;}
        if(left <= right){
            for(int i = bottom; i >= top; i--)
                ans.add(matrix[i][left]);
            left++;}
    }
        return ans;
}
}
