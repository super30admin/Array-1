/*
    Time Complexity = O(m*n) //going through all elements
    Space Complexity = O(1)
    Did this code successfully run on Leetcode : yes
 */


package com.madhurima;

import java.util.Arrays;

public class DiagonalOrder {
}

class SolutionC {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0){
            return new int[]{};
        }

        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];

        int index = 0;
        int dir = 1;
        int i = 0;
        int j = 0;

        while(index < m*n){
            result[index] = mat[i][j];
            index++;

            if(dir == 1){
                if(j == n-1){
                    dir = -1;
                    i++;
                }else if(i == 0){
                    dir = -1;
                    j++;
                }else{
                    i--;
                    j++;
                }
            }else{
                if(i == m-1){
                    dir = 1;
                    j++;
                }else if(j == 0){
                    dir = 1;
                    i++;
                }else{
                    i++;
                    j--;
                }

            }

        }

        return result;

    }

    public static void main(String[] args) {
        SolutionC s = new SolutionC();
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(s.findDiagonalOrder(mat)));
    }
}
