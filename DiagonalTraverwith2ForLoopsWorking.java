//Time Complexity = O(m*n)
//Space Complexity = O(1) // Because return Datastructure is not considered in Aux Space
// Does it run on LeetCode successfully?: Yes
// Any difficulties: Finding difficulties in finding for loop condition. For - while combination here.

/*
Traversing Matrix Diagonally: Leetcode 498: https://leetcode.com/problems/diagonal-trave rse/description/
*/

//Tip: Always take symmetric & Asymmetry matrixs to figure out all conditions

public class DiagonalTraverwith2ForLoopsWorking {
        public int[] findDiagonalOrder(int[][] mat) {
            int m = mat.length;
            int n = mat[0].length;
            int i = 0; int j = 0;
            boolean dir = true;// up
            int [] result = new int[m*n];
            int idx = 0;
            for( i = 0; i < m & j < n; ){ // This is one forloop. 2 For loop class in this project is not working
                result[idx] = mat[i][j];
                if(dir){
                    if(i == 0 && j != n-1){
                        j++; dir = false;
                    }
                    else if(j == n-1){
                        i++; dir = false;
                    } else {
                        i--;
                        j++;
                    }
                } else {
                    if(i == m - 1){
                        j++; dir = true;
                    } else if(j == 0){
                        i++; dir = true;
                    } else {
                        j--;
                        i++;
                    }
                }
                idx++;
            }
            return result;
        }
}