// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//Identify the 4 points as left,right,top,bottom
//tranaverse the matrix by checking the bounderies and add them to list.
//increment or decrement the pointer after each r or c finished.

import java.util.ArrayList;
import java.util.List;

public class Problem3 {
      public static List<Integer> spiralOrder(int[][] matrix) {
           int m = matrix.length;
           int n = matrix[0].length;
        List<Integer> list = new ArrayList<Integer>();
        int left = 0;
        int right = n-1;
        int top = 0;
        int down = m-1;
        
        while(left <= right && top <= down){
            for(int i = left; i <= right ; i++){
                list.add(matrix[top][i]);
            }
            top++;
            for(int i = top; i<= down; i++){
                list.add(matrix[i][right]);
            }
            right--;
            if(top <= down){
            for(int i = right; i >= left; i--){
                list.add(matrix[down][i]);
            }
            }
            down--;
            if(left <= right){
            for(int i = down; i>= top; i--){
                list.add(matrix[i][left]);
            }
            }
            left++;
        }
        return list;
    }
    public static void main(String[] arg) {
        int[][] nums = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(spiralOrder(nums));
    }
}
