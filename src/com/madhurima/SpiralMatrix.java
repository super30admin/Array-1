/*
    Time Complexity = O(m*n) //going through all elements
    Space Complexity = O(1)
    Did this code successfully run on Leetcode : yes
 */

package com.madhurima;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
}

class SolutionB {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0){
            return new ArrayList<>();
        }

        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();

        int top = 0, bottom = m-1;
        int left = 0, right = n-1;

        while(top <= bottom && left <= right){

            //for top row, move left to right, increment top
            for(int i = left; i <= right; i++){
                result.add(matrix[top][i]);
            }
            top++;

            //for right col, move top to bottom, decrement right
            for(int i = top; i <= bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom){ //top was changed, so need to cross check
                //for bottom row, move right to left, decrement bottom;
                for(int i = right; i>= left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right){ //right was changed, so need to cross check
                //for left col, move bottom to top, increment left;
                for(int i = bottom; i>= top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }

        }

        return result;

    }

    public static void main(String[] args) {
        SolutionB s = new SolutionB();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(s.spiralOrder(matrix).toString());
    }
}
